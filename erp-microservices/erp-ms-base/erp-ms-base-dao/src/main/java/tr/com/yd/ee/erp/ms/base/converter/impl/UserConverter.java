package tr.com.yd.ee.erp.ms.base.converter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.com.yd.ee.erp.dto.base.authentication.UserDTO;
import tr.com.yd.ee.erp.ms.base.converter.BaseConverter;
import tr.com.yd.ee.erp.ms.base.converter.BasePartialConverter;
import tr.com.yd.ee.erp.ms.base.domain.User;

/**
 * Created by Ramazan Karagoz on 26.08.2017.
 */
@Component
public class UserConverter implements BaseConverter<UserDTO,User> {

    @Autowired
    private BasePartialConverter basePartialConverter;

    @Override
    public UserDTO toDTO(User user) {
        UserDTO dto=new UserDTO();
        basePartialConverter.toDtoPartial(dto,user);
        dto.setName(user.getName());
        dto.setLanguage(user.getLanguage());
        dto.setPassword(user.getPassword());
        dto.setStatus(user.getStatus());
        dto.setSurname(user.getSurname());
        dto.setUsername(user.getUsername());
        return dto;
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        User entity=new User();
        basePartialConverter.toEntityPartial(entity,userDTO);
        entity.setName(userDTO.getName());
        entity.setLanguage(userDTO.getLanguage());
        entity.setPassword(userDTO.getPassword());
        entity.setStatus(userDTO.getStatus());
        entity.setSurname(userDTO.getSurname());
        entity.setUsername(userDTO.getUsername());
        return entity;
    }
}
