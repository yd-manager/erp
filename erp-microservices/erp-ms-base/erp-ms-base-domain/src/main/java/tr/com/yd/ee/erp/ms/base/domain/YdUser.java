package tr.com.yd.ee.erp.ms.base.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import tr.com.yd.ee.erp.dto.base.enums.BaseActivePassive;
import tr.com.yd.ee.erp.dto.base.enums.BaseGender;

@Entity
@Table(name = "YD_USER")
@SequenceGenerator(sequenceName="SEQ_YD_USER_ID", name= "SequenceGenerator",allocationSize=1,initialValue=1)
public class YdUser extends BaseEntity{

	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SURNAME")
	private String surname;
	
	@Column(name="TEL")
	private String tel;
	
	@Column(name="GSM")
	private String gsm;
	
	@Column(name="EMAIL")
	private String email;
	
	
	@Column(name="GENDER")
	@Enumerated(EnumType.ORDINAL)
	private BaseGender gender;//0 kadýn 1 erkek

	@Column(name="STATUS")
	@Enumerated(EnumType.ORDINAL)
	private BaseActivePassive status;//0 pasif 1 erkek
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public BaseGender getGender() {
		return gender;
	}
	public void setGender(BaseGender gender) {
		this.gender = gender;
	}
	public BaseActivePassive getStatus() {
		return status;
	}
	public void setStatus(BaseActivePassive status) {
		this.status = status;
	}

}
