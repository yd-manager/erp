package tr.com.yd.ee.erp.ms.stock.domain.material;

import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

public class Material extends BaseEntity{
	
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
