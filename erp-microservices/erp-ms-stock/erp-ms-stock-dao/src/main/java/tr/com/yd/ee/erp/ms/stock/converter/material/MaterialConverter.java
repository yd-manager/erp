package tr.com.yd.ee.erp.ms.stock.converter.material;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.com.yd.ee.erp.dto.stock.material.MaterialDTO;
import tr.com.yd.ee.erp.ms.base.converter.BaseConverter;
import tr.com.yd.ee.erp.ms.base.converter.BasePartialConverter;
import tr.com.yd.ee.erp.ms.stock.domain.material.Material;

@Component
public class MaterialConverter implements BaseConverter<MaterialDTO, Material>{

	@Autowired
	private BasePartialConverter basePartialConverter;
	
	@Override
	public MaterialDTO toDTO(Material e) {
		MaterialDTO dto = new MaterialDTO();
		basePartialConverter.toDtoPartial(dto, e);
		dto.setCode(e.getCode());
		dto.setName(e.getName());
		return dto;
	}

	@Override
	public Material toEntity(MaterialDTO d) {
		Material entity = new Material();
		basePartialConverter.toEntityPartial(entity, d);
		entity.setCode(d.getCode());
		entity.setName(d.getName());
		return entity;
	}

}
