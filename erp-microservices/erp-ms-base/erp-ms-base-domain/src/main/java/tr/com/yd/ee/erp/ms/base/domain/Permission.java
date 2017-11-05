package tr.com.yd.ee.erp.ms.base.domain;

import tr.com.yd.ee.erp.util.base.enums.PermissionTypeEnum;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ramazan Karagoz on 22.10.2017.
 */
@Entity
@Table(name = "PERMISSION")
@SequenceGenerator(sequenceName = "SEQ_PERMISSION",name = "SequenceGenerator",allocationSize=1 ,initialValue=1)
public class Permission extends BaseEntity implements IPermission{

    @Column(name = "PERMISSION_NAME")
    private String permissionName;

    @ManyToMany(targetEntity = Role.class,mappedBy = "permissionList")
    private List<IRole> roleList;

    @Enumerated(EnumType.ORDINAL)
    private PermissionTypeEnum permissionType;

    @ManyToOne
    @JoinColumn(name = "MENU_ID")
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "REST_ID")
    private Rest rest;

    public Permission(){}

    public Permission(String permissionName, List<IRole> roleList, PermissionTypeEnum permissionType, Menu menu, Rest rest) {
        this.permissionName = permissionName;
        this.roleList = roleList;
        this.permissionType = permissionType;
        this.menu = menu;
        this.rest = rest;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public List<IRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<IRole> roleList) {
        this.roleList = roleList;
    }

    public PermissionTypeEnum getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PermissionTypeEnum permissionType) {
        this.permissionType = permissionType;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Rest getRest() {
        return rest;
    }

    public void setRest(Rest rest) {
        this.rest = rest;
    }
}
