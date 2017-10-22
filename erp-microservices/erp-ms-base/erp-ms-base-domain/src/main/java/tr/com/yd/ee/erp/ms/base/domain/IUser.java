package tr.com.yd.ee.erp.ms.base.domain;

import tr.com.yd.ee.erp.dto.base.enums.UserStatusEnum;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
public interface IUser {

    String getUsername();
    String getPassword();
    String getLanguage();
    String getName();
    String getSurname();
    UserStatusEnum getStatus();
    List<IRole> getRoleList();
}
