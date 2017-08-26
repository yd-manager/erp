package tr.com.yd.ee.erp.ms.base.dao;

import tr.com.yd.ee.erp.dto.base.authentication.UserDTO;
import tr.com.yd.ee.erp.ms.base.converter.impl.UserConverter;
import tr.com.yd.ee.erp.ms.base.domain.User;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
public interface IUserDao extends BaseDao<UserDTO,User,UserConverter> {
}
