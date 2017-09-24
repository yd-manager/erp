package tr.com.yd.ee.erp.ms.base.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "YD_SEHIR")
@SequenceGenerator(sequenceName="SEQ_YD_SEHIR_ID", name= "SequenceGenerator",allocationSize=1,initialValue=1)
public class YdSehir extends BaseEntity {

	@ManyToOne
	@Column(name="ULKE_ID")
	private YdUlke ulkeId;
	
	@ManyToOne
	@Column(name="EYALET_ID")
	private YdEyalet eyaletId;
	
	@Column(name="SEHIR_ADI")
	private String sehirAdi;
	
	@Column(name="KOD")
	private String Kod;
	
	@Column(name="ENLEM")
	private String enlem;
	
	@Column(name="BOYLAM")
	private String boylam;
	
	@Column(name="SAAT_DILIMI")
	private String saatDilimi;



	public YdUlke getUlkeId() {
		return ulkeId;
	}

	public void setUlkeId(YdUlke ulkeId) {
		this.ulkeId = ulkeId;
	}

	public YdEyalet getEyaletId() {
		return eyaletId;
	}

	public void setEyaletId(YdEyalet eyaletId) {
		this.eyaletId = eyaletId;
	}

	public String getSehirAdi() {
		return sehirAdi;
	}

	public void setSehirAdi(String sehirAdi) {
		this.sehirAdi = sehirAdi;
	}

	public String getKod() {
		return Kod;
	}

	public void setKod(String kod) {
		Kod = kod;
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

	public String getSaatDilimi() {
		return saatDilimi;
	}

	public void setSaatDilimi(String saatDilimi) {
		this.saatDilimi = saatDilimi;
	}

}
