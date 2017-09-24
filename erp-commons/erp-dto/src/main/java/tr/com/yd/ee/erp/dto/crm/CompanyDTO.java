package tr.com.yd.ee.erp.dto.crm;

import java.util.List;

import tr.com.yd.ee.erp.dto.base.BaseDTO;
import tr.com.yd.ee.erp.dto.crm.enums.CompanyTypeEnum;

public class CompanyDTO extends BaseDTO  {

	private String companyNo;
	private String companyName;
	private String companyLegalName;
	private String companyTel;
	private String companyFax;
	private String companyEmail;
	private Integer companyAdresId;//FK crm_adres
	private String companyTaxOffice;
	private Long companyTaxNo;
	private String companyIBAN;
	private CompanyTypeEnum companyType;//Enum
	private CrmContactDTO companyCEO;// FK crm_contact
	
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
	public CrmContactDTO getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(CrmContactDTO companyCEO) {
		this.companyCEO = companyCEO;
	}

	
}
