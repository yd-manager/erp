package tr.com.yd.ee.erp.ms.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.yd.ee.erp.ms.crm.dao.CompanyDao;
import tr.com.yd.ee.erp.ms.crm.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao companyDao;
}
