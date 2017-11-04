package tr.com.yd.ee.erp.webapp.common.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.com.yd.ee.erp.ms.base.domain.User;

/**
 * Created by Ramazan Karagoz on 4.11.2017.
 */
@Service
@Transactional
public class SecurityService {

    @Autowired
    private SecurityDao securityDao;

    public User findByUsername(String username)
    {
        if (username!=null)
        {
            return securityDao.findByUsername(username);
        }else return null;
    }
}
