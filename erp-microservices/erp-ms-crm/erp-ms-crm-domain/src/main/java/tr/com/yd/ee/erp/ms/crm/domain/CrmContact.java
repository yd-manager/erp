package tr.com.yd.ee.erp.ms.crm.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import tr.com.yd.ee.erp.dto.base.enums.BaseGender;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

@Entity
@Table(name = "CRM_CONTACT")
@SequenceGenerator(sequenceName="SEQ_CRM_CONTACT", name= "SequenceGenerator",allocationSize=1,initialValue=1)
public class CrmContact extends BaseEntity{
	
	@Column(name="ADI")
	private String adi;
	
	@Column(name="SOYADI")
	private String soyadi;
	
	@Column(name="GENDER")
	private BaseGender gender;
	
	@Column(name="TITLE")
	private String title;//enum olacak
	
	@Column(name="DEPARTMENT")
	private String department;//enum olacak
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TEL")
	private String tel;
	
	@Column(name="DAHILI")
	private String dahili;
	
	@Column(name="FAX")
	private String fax;
	
	@Column(name="GSM")
	private String gsm;
	
	@Column(name = "COUNTRY_ID")
	private int countryId;
	
	@Column(name = "STATE_ID")
	private int stateId;
	
	@Column(name = "CITY_ID")
	private int cityId;
	
	@Column(name = "DISTRICT_ID")
	private int districtId;
	
	@Column(name = "SEMT")
	private String semt;
	
	@Column(name="BIRTHDAY")
	private Date birthday;
	
	@Column(name="MARITAL_STATUS")
	private int maritalStatus;//Enum olacak
	
	@Column(name="SPECIAL_NOTE")
	private String specialNote;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "companyCEO")
	private Company company;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "COMPANY_ID")
	private Company crmCompany;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public BaseGender getGender() {
		return gender;
	}

	public void setGender(BaseGender gender) {
		this.gender = gender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDahili() {
		return dahili;
	}

	public void setDahili(String dahili) {
		this.dahili = dahili;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getSemt() {
		return semt;
	}

	public void setSemt(String semt) {
		this.semt = semt;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getSpecialNote() {
		return specialNote;
	}

	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
	}
	
	
}
