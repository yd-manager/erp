package tr.com.yd.ee.erp.ms.base.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "YD_EYALET")
@SequenceGenerator(sequenceName="SEQ_YD_EYALET_ID", name= "SequenceGenerator",allocationSize=1,initialValue=1)

public class YdEyalet extends BaseEntity {
	
	@Column(name="ULKE_ID")
	private int ulkeId;
	
	@Column(name="EYALET_ADI")
	private String eyaletAdi;
	
	@Column(name="KOD")
	private String kod;

	public int getUlkeId() {
		return ulkeId;
	}

	public void setUlkeId(int ulkeId) {
		this.ulkeId = ulkeId;
	}

	public String getEyaletAdi() {
		return eyaletAdi;
	}

	public void setEyaletAdi(String eyaletAdi) {
		this.eyaletAdi = eyaletAdi;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}
	
	
	

}
