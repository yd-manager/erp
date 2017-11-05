package tr.com.yd.ee.erp.util.crm.enums;

import tr.com.yd.ee.erp.util.base.enums.BaseEnum;

public enum CompanyTypeEnum implements BaseEnum {
	CUSTOMER(1l,"enum.company.type.customer"),
	SALLER(2l,"enum.company.type.saller"),
	OTHER(3l,"enum.company.type.other")
	;
	
	private Long id;
	private String messageKey;
	
	

	private CompanyTypeEnum(Long id, String messageKey) {
		this.id = id;
		this.messageKey = messageKey;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getMessageKey() {
		// TODO Auto-generated method stub
		return messageKey;
	}

}
