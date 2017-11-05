package tr.com.yd.ee.erp.webapp.common.session;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import tr.com.yd.ee.erp.util.base.enums.UserStatusEnum;

import javax.annotation.PostConstruct;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */

@Component
@Scope("session")
public class UserSession implements IUserSession {

    private String username;

    private String name;

    private String surname;

    private UserStatusEnum status;

    private String language;

    @PostConstruct
    void init()
    {
        System.out.println("UserSession scope is created.");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
