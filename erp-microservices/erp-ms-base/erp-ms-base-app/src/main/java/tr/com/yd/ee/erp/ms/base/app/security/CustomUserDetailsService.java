package tr.com.yd.ee.erp.ms.base.app.security;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import tr.com.yd.ee.erp.ms.base.domain.IRole;
import tr.com.yd.ee.erp.ms.base.domain.Role;
import tr.com.yd.ee.erp.ms.base.domain.User;
import tr.com.yd.ee.erp.ms.base.service.impl.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramazan Karagoz on 4.11.2017.
 */
@Component("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User ydUser=userService.findByUsername(username);
        List<SimpleGrantedAuthority> authorityList=getAuthorities(ydUser.getRoleList());
        return new org.springframework.security.core.userdetails.User(ydUser.getUsername(),ydUser.getPassword(), authorityList);
    }


    private List<SimpleGrantedAuthority> getAuthorities(List<IRole> roles)
    {
        List<SimpleGrantedAuthority> authorityList=null;
        if (roles.size()>0) {
            authorityList= new ArrayList<>();
            for (IRole role : roles) {
                authorityList.add(new SimpleGrantedAuthority(role.getRoleName()));
            }
        }

        return authorityList;
    }


}
