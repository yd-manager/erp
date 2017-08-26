package tr.com.yd.ee.erp.ms.crm.dao.impl;

import org.springframework.stereotype.Repository;

import tr.com.yd.ee.erp.dto.crm.CompanyDTO;
import tr.com.yd.ee.erp.ms.base.dao.impl.BaseDaoImp;
import tr.com.yd.ee.erp.ms.crm.converter.CompanyConverter;
import tr.com.yd.ee.erp.ms.crm.dao.CompanyDao;
import tr.com.yd.ee.erp.ms.crm.domain.Company;

@Repository
public class CompanyDaoImpl extends BaseDaoImp<CompanyDTO, Company, CompanyConverter> implements CompanyDao{

}
