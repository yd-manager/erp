package tr.com.yd.ee.erp.ms.stock.domain.material;

import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK_MATERIAL")
@SequenceGenerator(sequenceName = "MATERIAL_SEQ",name = "SequenceGenerator")
public class Material extends BaseEntity{


	@Column(name = "CODE")
	private String code;
	@Column(name = "NAME")
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
