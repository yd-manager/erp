package tr.com.yd.ee.erp.ms.base.converter;

import tr.com.yd.ee.erp.dto.base.BaseDTO;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

public interface BasePartialConverter<D extends BaseDTO,E extends BaseEntity> {
	
	void toEntityPartial(E e,D d);
	void toDtoPartial(D d,E e);
}
