package tr.com.yd.ee.erp.ms.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import tr.com.yd.ee.erp.dto.base.enums.BaseActivePassive;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;
import tr.com.yd.ee.erp.ms.base.domain.YdEyalet;
import tr.com.yd.ee.erp.ms.base.domain.YdIlce;
import tr.com.yd.ee.erp.ms.base.domain.YdSehir;
import tr.com.yd.ee.erp.ms.base.domain.YdUlke;

@Entity
@Table(name = "CRM_ADDRESS")
@SequenceGenerator(sequenceName="SEQ_CRM_ADDRESS", name= "SequenceGenerator",allocationSize=1,initialValue=1)
public class CrmAddress extends BaseEntity{

	@Column(name = "CONTACT_ID")
	private int contactId;
	
	@Column(name = "ADDRESS_DSC")
	private String addressDsc;
	
	@ManyToOne
	@Column(name = "ULKE_ID")
	private YdUlke ulkeId;
	
	@ManyToOne
	@Column(name = "EYALET_ID")
	private YdEyalet eyaletId;
	
	@ManyToOne
	@Column(name = "SEHIR_ID")
	private YdSehir sehirId;
	
	
	@Column(name = "ILCE_ID")
	private YdIlce ilceId;
	
	@Column(name = "SEMT")
	private String semt;
	
	@Column(name = "POST_CODE")
	private String postCode;
	
	@Column(name = "ENLEM")
	private Double enlem;
	
	@Column(name = "BOYLAM")
	private Double boylam;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.ORDINAL)
	private BaseActivePassive status;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "COMPANY_ID")
	private Company crmCompany;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getAddressDsc() {
		return addressDsc;
	}

	public void setAddressDsc(String addressDsc) {
		this.addressDsc = addressDsc;
	}

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

	public YdSehir getSehirId() {
		return sehirId;
	}

	public void setSehirId(YdSehir sehirId) {
		this.sehirId = sehirId;
	}

	public YdIlce getIlceId() {
		return ilceId;
	}

	public void setIlceId(YdIlce ilceId) {
		this.ilceId = ilceId;
	}

	public String getSemt() {
		return semt;
	}

	public void setSemt(String semt) {
		this.semt = semt;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Double getEnlem() {
		return enlem;
	}

	public void setEnlem(Double enlem) {
		this.enlem = enlem;
	}

	public Double getBoylam() {
		return boylam;
	}

	public void setBoylam(Double boylam) {
		this.boylam = boylam;
	}

	public BaseActivePassive getStatus() {
		return status;
	}

	public void setStatus(BaseActivePassive status) {
		this.status = status;
	}

	public Company getCrmCompany() {
		return crmCompany;
	}

	public void setCrmCompany(Company crmCompany) {
		this.crmCompany = crmCompany;
	}

	
	
}
