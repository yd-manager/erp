package tr.com.yd.ee.erp.ms.base.converter;

import tr.com.yd.ee.erp.dto.base.BaseDTO;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

public interface BaseConverter<D extends BaseDTO,E extends BaseEntity> {
	
	D toDTO(E e);
	E toEntity(D d);
}
