package tr.com.yd.ee.erp.ms.base.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.ee.erp.dto.base.BaseDTO;
import tr.com.yd.ee.erp.ms.base.converter.BaseConverter;
import tr.com.yd.ee.erp.ms.base.dao.BaseDao;
import tr.com.yd.ee.erp.ms.base.domain.BaseEntity;

public class BaseDaoImp<D extends BaseDTO,E extends BaseEntity,C extends BaseConverter<D, E>> implements BaseDao<D,E,C> {

	@Autowired
	private C converter;
	
	@Override
	public D insert(D d) {
		E e = converter.toEntity(d);
		//TODO insert entity
		d = converter.toDTO(e);
		return d;
	}

	@Override
	public D update(D d) {
		E e = converter.toEntity(d);
		//TODO update entity
		d = converter.toDTO(e);
		return d;
	}

	@Override
	public void delete(D d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<D> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
