package tr.com.yd.ee.erp.ms.base.domain;

import tr.com.yd.ee.erp.dto.base.enums.PermissionTypeEnum;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 22.10.2017.
 */
public interface IPermission{

    String getPermissionName();

    List<IRole> getRoleList();

    PermissionTypeEnum getPermissionType();

    Menu getMenu();

    Rest getRest();
}
