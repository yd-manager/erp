package tr.com.yd.ee.erp.webapp.common.application;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tr.com.yd.ee.erp.ms.base.domain.User;

/**
 * Created by Ramazan Karagoz on 4.11.2017.
 */
@Repository
public class SecurityDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Criteria cr;

    public User findByUsername(String username)
    {
        cr=sessionFactory.getCurrentSession().createCriteria(User.class);
        cr.add(Restrictions.eq("username",username));

        return (User) cr.uniqueResult();
    }
}
