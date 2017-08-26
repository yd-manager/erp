package tr.com.yd.ee.erp.ms.base.domain;

import tr.com.yd.ee.erp.dto.base.enums.UserStatusEnum;

import javax.persistence.*;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
@Entity
@Table(name = "USER")
@SequenceGenerator(sequenceName = "USER_SEQ",name = "SequenceGenerator")
public class User extends BaseEntity implements IUser {

    @Column(name = "USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String password;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Enumerated(EnumType.ORDINAL)
    private UserStatusEnum status;

    public User() {
    }

    public User(String username, String password, String language, String name, String surname, UserStatusEnum status) {
        this.username = username;
        this.password = password;
        this.language = language;
        this.name = name;
        this.surname = surname;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
}
