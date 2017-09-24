package tr.com.yd.ee.erp.dto.base.enums;

public enum BaseGender implements BaseEnum{

	ACIK(1l,"enum.gender.open"),
	KAPALI(0l,"enum.gender.closed");

	private Long id;
	private String messageKey;

	private BaseGender(Long id, String messageKey) {
		this.id = id;
		this.messageKey = messageKey;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}
}
