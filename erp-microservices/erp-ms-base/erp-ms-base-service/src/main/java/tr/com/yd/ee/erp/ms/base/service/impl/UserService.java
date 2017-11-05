package tr.com.yd.ee.erp.ms.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.com.yd.ee.erp.ms.base.dao.impl.UserDaoImp;
import tr.com.yd.ee.erp.ms.base.domain.User;
import tr.com.yd.ee.erp.ms.base.service.IUserService;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
@Service
@Transactional
public class UserService implements IUserService<User>{
    @Autowired
    private UserDaoImp userDaoImp;


    @Override
    public User getByID(User user) {
        return userDaoImp.getByID(user);
    }

    @Override
    public User create(User user) {
        return userDaoImp.create(user);
    }

    @Override
    public User update(User user) {
        return userDaoImp.update(user);
    }

    @Override
    public Boolean delete(User user) {
        return userDaoImp.delete(user);
    }

    @Override
    public List<User> getList() {
        return userDaoImp.getList();
    }

    public User findByUsername(String username)
    {
        return userDaoImp.findByUsername(username);
    }
}
