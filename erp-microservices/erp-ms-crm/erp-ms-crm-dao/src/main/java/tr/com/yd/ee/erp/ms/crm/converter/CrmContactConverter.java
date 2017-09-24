package tr.com.yd.ee.erp.ms.crm.converter;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.ee.erp.dto.base.enums.BaseGender;
import tr.com.yd.ee.erp.dto.crm.CompanyDTO;
import tr.com.yd.ee.erp.dto.crm.CrmContactDTO;
import tr.com.yd.ee.erp.ms.base.converter.BaseConverter;
import tr.com.yd.ee.erp.ms.base.converter.BasePartialConverter;
import tr.com.yd.ee.erp.ms.crm.domain.Company;
import tr.com.yd.ee.erp.ms.crm.domain.CrmContact;

public class CrmContactConverter implements BaseConverter<CrmContactDTO,CrmContact> {

	@Autowired
	private BasePartialConverter basePartialConverter;

	/*
	 * private String adi;
	
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

	private CompanyDTO crmCompany;*/
	@Override
	public CrmContactDTO toDTO(CrmContact e) {
		CrmContactDTO dto = new CrmContactDTO();
		dto.set
		return dto;
	}

	@Override
	public CrmContact toEntity(CrmContactDTO d) {
		CrmContact entity = new CrmContact();
		return entity;
	}

}
