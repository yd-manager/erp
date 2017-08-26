package tr.com.yd.ee.erp.ms.base.dao.impl;

import org.springframework.stereotype.Repository;
import tr.com.yd.ee.erp.dto.base.authentication.UserDTO;
import tr.com.yd.ee.erp.ms.base.converter.impl.UserConverter;
import tr.com.yd.ee.erp.ms.base.dao.IUserDao;
import tr.com.yd.ee.erp.ms.base.domain.User;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
@Repository
public class UserDaoImp extends BaseDaoImp<UserDTO,User,UserConverter> implements IUserDao {

}
