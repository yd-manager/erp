package tr.com.yd.ee.erp.ms.base.service;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 5.11.2017.
 */
public interface IUserService<T> {

    T getByID(T t);

    T create(T t);

    T update(T t);

    Boolean delete(T t);

    List<T> getList();
}
