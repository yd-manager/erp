package tr.com.yd.ee.erp.ms.base.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "YD_ILCE")
@SequenceGenerator(sequenceName="SEQ_YD_ILCE_ID", name= "SequenceGenerator",allocationSize=1,initialValue=1)
public class YdIlce extends BaseEntity {

	@ManyToOne
	@Column(name="ULKE_ID")
	private YdUlke ulkeId;
	
	
	@ManyToOne
	@Column(name="SEHIR_ID")
	private YdSehir sehirId;
	
	@Column(name="ILCE_ADI")
	private String ilceAdi;
	
	@Column(name="ENLEM")
	private String enlem;
	
	@Column(name="BOYLAM")
	private String boylam;
	

	public YdUlke getUlkeId() {
		return ulkeId;
	}

	public void setUlkeId(YdUlke ulkeId) {
		this.ulkeId = ulkeId;
	}

	public YdSehir getSehirId() {
		return sehirId;
	}

	public void setSehirId(YdSehir sehirId) {
		this.sehirId = sehirId;
	}

	public String getIlceAdi() {
		return ilceAdi;
	}

	public void setIlceAdi(String ilceAdi) {
		this.ilceAdi = ilceAdi;
	}

	public String getEnlem() {
		return enlem;
	}

	public void setEnlem(String enlem) {
		this.enlem = enlem;
	}

	public String getBoylam() {
		return boylam;
	}

	public void setBoylam(String boylam) {
		this.boylam = boylam;
	}
	
	
}
