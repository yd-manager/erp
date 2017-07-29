package tr.com.yd.ee.erp.dto.stock.material;

import tr.com.yd.ee.erp.dto.base.BaseDTO;

public class MaterialDTO extends BaseDTO {
	
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
