package tr.com.yd.ee.erp.ms.base.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by Ramazan Karagoz on 22.10.2017.
 */
@Entity
@Table(name = "REST")
@SequenceGenerator(sequenceName = "SEQ_REST",name = "SequenceGenerator",allocationSize=1 ,initialValue=1)
public class Rest extends BaseEntity implements IRest {

    @Column(name = "NAME")
    private String name;

    @Column(name = "PATH")
    private String path;

    @Column(name = "METHOD")
    private String method;

    @Column(name = "NICK")
    private String nick;

    public Rest(){}

    public Rest(String name, String path, String method, String nick) {
        this.name = name;
        this.path = path;
        this.method = method;
        this.nick = nick;
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

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
