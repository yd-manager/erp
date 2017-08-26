package tr.com.yd.ee.erp.webapp.common.session;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
@Component
@Scope("view")
public class DenemeViewScope {

    private String denemeView;

    @PostConstruct
    public void init()
    {
        System.out.println("DenemeViewScope is created.");
    }

    public String getDenemeView() {
        return denemeView;
    }

    public void setDenemeView(String denemeView) {
        this.denemeView = denemeView;
    }
}
