package tr.com.yd.ee.erp.ms.stock.dao.material.impl;

import org.springframework.stereotype.Repository;
import tr.com.yd.ee.erp.dto.stock.material.MaterialDTO;
import tr.com.yd.ee.erp.ms.base.dao.impl.BaseDaoImp;
import tr.com.yd.ee.erp.ms.stock.converter.material.MaterialConverter;
import tr.com.yd.ee.erp.ms.stock.dao.material.MaterialDao;
import tr.com.yd.ee.erp.ms.stock.domain.material.Material;
@Repository
public class MaterialDaoImpl extends BaseDaoImp<MaterialDTO, Material, MaterialConverter> implements MaterialDao{

}
