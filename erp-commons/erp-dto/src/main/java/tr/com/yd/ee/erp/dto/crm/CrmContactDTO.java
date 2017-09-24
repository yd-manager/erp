package tr.com.yd.ee.erp.dto.crm;

import java.util.Date;

import tr.com.yd.ee.erp.dto.base.BaseDTO;
import tr.com.yd.ee.erp.dto.base.enums.BaseGender;

public class CrmContactDTO extends BaseDTO{

	private String adi;
	
	private String soyadi;
	
	private BaseGender gender;
	
	private String title;//enum olacak
	
	private String department;//enum olacak
	
	private String email;
	
	private String tel;
	
	private String dahili;
	
	private String fax;
	
	private String gsm;
	
	private int countryId;
	
	private int stateId;
	
	private int cityId;
	
	private int districtId;
	
	private String semt;
	
	private Date birthday;
	
	private int maritalStatus;//Enum olacak
	
	private String specialNote;

	private CompanyDTO company;

	private CompanyDTO crmCompany;
}
