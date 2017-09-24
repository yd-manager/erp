package tr.com.yd.ee.erp.ms.base.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "YD_ULKE")
@SequenceGenerator(sequenceName="SEQ_YD_ULKE_ID", name= "SequenceGenerator",allocationSize=1,initialValue=1)
public class YdUlke extends BaseEntity{

	@Column(name="ISO_KODU1")
	private String isoKodu1;
	
	@Column(name="ISO_KODU2")
	private String isoKodu2;
	
	@Column(name="NUMERIC_KOD")
	private String numericKod;
	
	@Column(name="ULKE_ADI")
	private String ulkeAdi;
	
	@Column(name="TEL_KODU")
	private String telKodu;

	public String getIsoKodu1() {
		return isoKodu1;
	}

	public void setIsoKodu1(String isoKodu1) {
		this.isoKodu1 = isoKodu1;
	}

	public String getIsoKodu2() {
		return isoKodu2;
	}

	public void setIsoKodu2(String isoKodu2) {
		this.isoKodu2 = isoKodu2;
	}

	public String getNumericKod() {
		return numericKod;
	}

	public void setNumericKod(String numericKod) {
		this.numericKod = numericKod;
	}

	public String getUlkeAdi() {
		return ulkeAdi;
	}

	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}

	public String getTelKodu() {
		return telKodu;
	}

	public void setTelKodu(String telKodu) {
		this.telKodu = telKodu;
	}
	
	
	
}
