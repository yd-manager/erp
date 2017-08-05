package tr.com.yd.ee.erp.ms.stock.dao.material;

import tr.com.yd.ee.erp.dto.stock.material.MaterialDTO;
import tr.com.yd.ee.erp.ms.base.dao.BaseDao;
import tr.com.yd.ee.erp.ms.stock.converter.material.MaterialConverter;
import tr.com.yd.ee.erp.ms.stock.domain.material.Material;

public interface MaterialDao extends BaseDao<MaterialDTO, Material, MaterialConverter>  {
	
}
