package tr.com.yd.ee.erp.ms.base.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tr.com.yd.ee.erp.ms.base.domain.User;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
@Repository
public class UserDaoImp extends BaseDaoImp<User> {


    private Criteria cr;

    public User findByUsername(String username)
    {
        cr=getSession().createCriteria(User.class);
        cr.add(Restrictions.eq("username",username));

        return (User) cr.uniqueResult();
    }
}
