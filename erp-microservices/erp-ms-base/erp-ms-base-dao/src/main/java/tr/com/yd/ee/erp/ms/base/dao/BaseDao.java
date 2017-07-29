package tr.com.yd.ee.erp.ms.base.dao;

import java.util.List;

import tr.com.yd.ee.erp.dto.base.BaseDTO;
import tr.com.yd.ee.erp.ms.base.converter.BaseConverter;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

public interface BaseDao<D extends BaseDTO,E extends BaseEntity,C extends BaseConverter<?, ?>> {
	D insert(D d);
	D update(D d);
	void delete(D d);
	List<D> getAll();
}
