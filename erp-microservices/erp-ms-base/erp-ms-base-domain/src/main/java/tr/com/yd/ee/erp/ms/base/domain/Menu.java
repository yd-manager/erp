package tr.com.yd.ee.erp.ms.base.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by Ramazan Karagoz on 22.10.2017.
 */
@Entity
@Table(name = "MENU")
@SequenceGenerator(sequenceName = "SEQ_MENU",name = "SequenceGenerator",allocationSize=1 ,initialValue=1)
public class Menu extends BaseEntity implements IMenu {

    @Column(name = "NAME")
    private String name;
    @Column(name = "PATH")
    private String path;
    @Column(name = "SUBMENU")
    private String subMenu;

    public Menu()
    {

    }

    public Menu(String name, String path, String subMenu) {
        this.name = name;
        this.path = path;
        this.subMenu = subMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String subMenu) {
        this.subMenu = subMenu;
    }
}
