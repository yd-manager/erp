package tr.com.yd.ee.erp.ms.base.converter.impl;

import org.springframework.stereotype.Component;

import tr.com.yd.ee.erp.dto.base.BaseDTO;
import tr.com.yd.ee.erp.ms.base.converter.BasePartialConverter;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

@Component
public class BasePartialConverterImp implements BasePartialConverter<BaseDTO, BaseEntity> {

	@Override
	public void toEntityPartial(BaseEntity e, BaseDTO d) {
		e.setId(d.getId());
		e.setCreatedUserId(d.getCreatedUserId());
		e.setCreationDate(d.getCreationDate());
		e.setUpdatedUserId(d.getUpdatedUserId());
		e.setUpdatedDate(d.getUpdatedDate());
	}

	@Override
	public void toDtoPartial(BaseDTO d, BaseEntity e) {
		d.setId(e.getId());
		d.setCreatedUserId(e.getCreatedUserId());
		d.setCreationDate(e.getCreationDate());
		d.setUpdatedUserId(e.getUpdatedUserId());
		d.setUpdatedDate(e.getUpdatedDate());
	}

}
