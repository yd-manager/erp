package tr.com.yd.ee.erp.dto.base.enums;

public enum BaseActivePassive implements BaseEnum {

	AKTIF(1l,"enum.status.aktive"),
	PASIF(0l,"enum.status.passive");

	private Long id;
	private String messageKey;
	
	private BaseActivePassive(Long id, String messageKey) {
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
