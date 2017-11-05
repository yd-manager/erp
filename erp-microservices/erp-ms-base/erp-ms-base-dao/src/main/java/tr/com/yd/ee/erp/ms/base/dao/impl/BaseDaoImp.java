package tr.com.yd.ee.erp.ms.base.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

@Component
public abstract class BaseDaoImp<T extends BaseEntity> {
    private final Class<T> entityClass;

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public BaseDaoImp() {
        this.entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }


    protected Session getSession() {

        return sessionFactory.getCurrentSession();

    }

    protected Criteria createEntityCriteria() {
        return getSession().createCriteria(this.entityClass);
    }

    public T getByID(T t) {
        try {

            T result = (T) getSession().get(entityClass, t.getId());

            return result;
        } catch (HibernateException e) {

            return null;
        }
    }

    public T create(T entity) {
        T t=null;
        try {

            t= (T) getSession().save(entity);

            return t;
        } catch (HibernateException e) {

            return t;
        }
    }

    public T update(T entity) {
        T t=null;
        try {

            t= (T) getSession().merge(entity);

            return t;
        } catch (HibernateException e) {

            return t;
        }
    }

    public Boolean delete(T entity) {
        try {
            entity.setDeleted(true);
            getSession().saveOrUpdate(entity);
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }

    public List<T> getList() {
        try {

            @SuppressWarnings("unchecked")
            List<T> list = this.createEntityCriteria().list();

            return list;
        } catch (HibernateException e) {

            return null;
        }
    }

}
