package tr.com.yd.ee.erp.ms.base.domain;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramazan Karagoz on 22.10.2017.
 */
@Entity
@Table(name = "ROLE")
@SequenceGenerator(sequenceName = "SEQ_ROLE",name = "SequenceGenerator",allocationSize=1 ,initialValue=1)
public class Role extends BaseEntity implements IRole{

    @Column(name = "ROLE_NAME")
    private String roleName;

    @ManyToMany(targetEntity = Permission.class)
    @JoinTable(name = "ROLE_PERMISSION",joinColumns = {@JoinColumn(name = "ROLE_ID",nullable = false)}
    ,inverseJoinColumns = {@JoinColumn(name = "PERMISSION_ID",nullable = false)})
    private List<IPermission> permissionList=new ArrayList<>(0);

    @ManyToMany(targetEntity = User.class,mappedBy = "roleList")
    private List<IUser> userList=new ArrayList<>(0);

    public Role()
    {

    }

    public Role(String roleName, List<IPermission> permissionList, List<IUser> userList) {
        this.roleName = roleName;
        this.permissionList = permissionList;
        this.userList = userList;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<IPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<IPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<IUser> getUserList() {
        return userList;
    }

    public void setUserList(List<IUser> userList) {
        this.userList = userList;
    }
}
