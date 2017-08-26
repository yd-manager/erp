package tr.com.yd.ee.erp.ms.crm.dao;

import tr.com.yd.ee.erp.dto.crm.CompanyDTO;
import tr.com.yd.ee.erp.ms.base.dao.BaseDao;
import tr.com.yd.ee.erp.ms.crm.converter.CompanyConverter;
import tr.com.yd.ee.erp.ms.crm.domain.Company;

public interface CompanyDao extends BaseDao<CompanyDTO, Company, CompanyConverter>{

}
