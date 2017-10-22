package tr.com.yd.ee.erp.webapp.common.menu;

import com.sun.faces.component.visit.FullVisitContext;
import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import tr.com.yd.ee.erp.ms.base.domain.Menu;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.component.visit.VisitResult;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ramazan Karagoz on 8.10.2017.
 */
@Component
@Scope("session")
public class MenuView implements Serializable{

    private MenuModel model;
    private String url;
    private List<Menu> menuList;
    private DefaultMenuItem item;

    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();

        //dummy menu
        Menu menu = new Menu("DUMMY", "/dummy/dummy_order.xhtml", "Dummy");
        Menu menu2 = new Menu("HELLO", "/hello.xhtml", "Hello");
        menuList = new ArrayList<>();
        menuList.add(menu);
        menuList.add(menu2);

        for (Menu menuProperties : menuList)
        {
            DefaultSubMenu firstSubmenu = new DefaultSubMenu(menuProperties.getName());
            item = new DefaultMenuItem(menuProperties.getSubMenu());
            item.setCommand("#{menuView.sa}");
            url=menuProperties.getPath();
            //item.setUrl(url);
            item.setUpdate(":content");
            firstSubmenu.addElement(item);
            model.addElement(firstSubmenu);
        }

        System.out.println("c");


    }

    public void sa(MenuActionEvent event) {
        for (Menu menuProperties:menuList) {
            if (menuProperties.getSubMenu().equals(event.getMenuItem().getValue().toString()))
            {
                setUrl(menuProperties.getPath());
            }
        }
    }

    public MenuModel getModel() {
        return model;
    }

    public void setModel(MenuModel model) {
        this.model = model;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
