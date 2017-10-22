package tr.com.yd.ee.erp.dto.base.enums;

/**
 * Created by Ramazan Karagoz on 22.10.2017.
 */
public enum PermissionTypeEnum implements BaseEnum{


    MENU(1l,"enum.user.permission.menu"),
    REST(2l,"enum.user.permission.rest");

    private Long id;

    private String messageKey;

    PermissionTypeEnum(Long id, String messageKey) {

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
