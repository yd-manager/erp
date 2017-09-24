package tr.com.yd.ee.erp.ms.crm.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.yd.ee.erp.dto.crm.CompanyDTO;
import tr.com.yd.ee.erp.ms.base.converter.BaseConverter;
import tr.com.yd.ee.erp.ms.base.converter.BasePartialConverter;
import tr.com.yd.ee.erp.ms.crm.domain.Company;
import tr.com.yd.ee.erp.ms.crm.domain.CrmContact;

@Component
public class CompanyConverter implements BaseConverter<CompanyDTO,Company> {

	@Autowired
	private BasePartialConverter basePartialConverter;
	
	@Autowired
	private CrmContactConverter crmContactConverter;
	
	@Override
	public CompanyDTO toDTO(Company e) {
		
		CompanyDTO dto = new CompanyDTO();
		basePartialConverter.toDtoPartial(dto, e);
		dto.setCompanyNo(e.getCompanyNo());
		dto.setCompanyName(e.getCompanyName());
		dto.setCompanyLegalName(e.getCompanyLegalName());
		dto.setCompanyTel(e.getCompanyTel());
		dto.setCompanyFax(e.getCompanyFax());
		dto.setCompanyEmail(e.getCompanyEmail());
		dto.setCompanyTaxOffice(e.getCompanyTaxOffice());
		dto.setCompanyTaxNo(e.getCompanyTaxNo());
		dto.setCompanyIBAN(e.getCompanyIBAN());
		dto.setCompanyType(e.getCompanyType());
		dto.setCompanyCEO(crmContactConverter.toDTO(e.getCompanyCEO()));
		return dto;
		
	}

	@Override
	public Company toEntity(CompanyDTO dto) {
		Company e = new Company();
		basePartialConverter.toEntityPartial(e, dto);
		e.setCompanyNo(dto.getCompanyNo());
		e.setCompanyName(dto.getCompanyName());
		e.setCompanyLegalName(dto.getCompanyLegalName());
		e.setCompanyTel(dto.getCompanyTel());
		e.setCompanyFax(dto.getCompanyFax());
		e.setCompanyEmail(dto.getCompanyEmail());
		e.setCompanyTaxOffice(dto.getCompanyTaxOffice());
		e.setCompanyTaxNo(dto.getCompanyTaxNo());
		e.setCompanyIBAN(dto.getCompanyIBAN());
		e.setCompanyType(dto.getCompanyType());
		e.setCompanyCEO(crmContactConverter.toEntity(dto.getCompanyCEO()));
		return e;
		
	}

}
