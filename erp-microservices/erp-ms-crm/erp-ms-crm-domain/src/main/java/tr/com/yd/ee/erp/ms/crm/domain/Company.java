package tr.com.yd.ee.erp.ms.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import tr.com.yd.ee.erp.dto.crm.enums.CompanyTypeEnum;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

@Entity
@Table(name = "CRM_COMPANY")
@SequenceGenerator(sequenceName="SEQ_COMPANY_ID", name= "SequenceGenerator",allocationSize=1,initialValue=1)
public class Company extends BaseEntity {
	
	@Column(name="COMPANY_NO")
	private String companyNo;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="COMPANY_LEGAL_NAME")
	private String companyLegalName;
	
	@Column(name="COMPANY_TEL")
	private String companyTel;
	
	@Column(name="COMPANY_FAX")
	private String companyFax;
	
	@Column(name="COMPANY_EMAIL")
	private String companyEmail;
	
	
	private Integer companyAdresId;//FK crm_adres
	
	@Column(name="COMPANY_TAX_OFFICE")
	private String companyTaxOffice;
	
	@Column(name="COMPANY_TAX_NO")
	private Long companyTaxNo;
	
	@Column(name="COMPANY_IBAN")
	private String companyIBAN;
	
	@Column(name="COMPANY_TYPE")
	@Enumerated(EnumType.ORDINAL)
	private CompanyTypeEnum companyType;//Enum
	
	
	private Integer companyCEOId;// FK crm_contact


	public String getCompanyNo() {
		return companyNo;
	}


	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyLegalName() {
		return companyLegalName;
	}


	public void setCompanyLegalName(String companyLegalName) {
		this.companyLegalName = companyLegalName;
	}


	public String getCompanyTel() {
		return companyTel;
	}


	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}


	public String getCompanyFax() {
		return companyFax;
	}


	public void setCompanyFax(String companyFax) {
		this.companyFax = companyFax;
	}


	public String getCompanyEmail() {
		return companyEmail;
	}


	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}


	public Integer getCompanyAdresId() {
		return companyAdresId;
	}


	public void setCompanyAdresId(Integer companyAdresId) {
		this.companyAdresId = companyAdresId;
	}


	public String getCompanyTaxOffice() {
		return companyTaxOffice;
	}


	public void setCompanyTaxOffice(String companyTaxOffice) {
		this.companyTaxOffice = companyTaxOffice;
	}


	public Long getCompanyTaxNo() {
		return companyTaxNo;
	}


	public void setCompanyTaxNo(Long companyTaxNo) {
		this.companyTaxNo = companyTaxNo;
	}


	public String getCompanyIBAN() {
		return companyIBAN;
	}


	public void setCompanyIBAN(String companyIBAN) {
		this.companyIBAN = companyIBAN;
	}


	public CompanyTypeEnum getCompanyType() {
		return companyType;
	}


	public void setCompanyType(CompanyTypeEnum companyType) {
		this.companyType = companyType;
	}


	public Integer getCompanyCEOId() {
		return companyCEOId;
	}


	public void setCompanyCEOId(Integer companyCEOId) {
		this.companyCEOId = companyCEOId;
	}
	
	
}
