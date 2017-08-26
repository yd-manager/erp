package tr.com.yd.ee.erp.webapp.common.session;

import tr.com.yd.ee.erp.dto.base.enums.UserStatusEnum;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
public interface IUserSession {
    String getUsername();

    String getName();

    String getSurname();

    UserStatusEnum getStatus();

    String getLanguage();
}
