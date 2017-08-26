package tr.com.yd.ee.erp.dto.base.enums;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
public enum UserStatusEnum implements BaseEnum {


    USER_ACTIVE(1l, "enum.user.status.user.active"),
    USER_PASSIVE(2l, "enum.user.status.user.passive");

    private Long id;

    private String messageKey;

    UserStatusEnum(Long id, String messageKey) {

        this.id = id;

        this.messageKey = messageKey;

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getMessageKey() {
        return messageKey;
    }

}
