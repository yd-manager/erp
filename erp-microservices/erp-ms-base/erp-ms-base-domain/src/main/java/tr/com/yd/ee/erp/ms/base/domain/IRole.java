package tr.com.yd.ee.erp.ms.base.domain;

import java.util.List;

/**
 * Created by Ramazan Karagoz on 22.10.2017.
 */
public interface IRole {
    String getRoleName();
    List<IPermission> getPermissionList();
    List<IUser> getUserList();
}
