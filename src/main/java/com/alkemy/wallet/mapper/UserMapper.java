package com.alkemy.wallet.mapper;

import com.alkemy.wallet.dto.basicDTO.UserBasicDTO;
import com.alkemy.wallet.model.UserEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.List;


@Component
public class UserMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public UserBasicDTO userEntity2DTO(UserEntity entity){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserBasicDTO result = this.modelMapper.map(entity, UserBasicDTO.class);
        return result;
    }

    public UserEntity userDTO2Entity(UserBasicDTO userBasicDTO){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity result = this.modelMapper.map(userBasicDTO, UserEntity.class);
        return result;
    }

    public List<UserBasicDTO> userEntity2DTOList(List<UserEntity> entities){
        List<UserBasicDTO> dtos = new ArrayList<>();
        for(UserEntity entity:entities){
            dtos.add(this.userEntity2DTO(entity));
        }
        return dtos;
    }

    public List<UserEntity> userDTO2EntityList(List<UserBasicDTO> dtos){
        List<UserEntity> entities = new ArrayList<>();
        for(UserBasicDTO dto:dtos){
            entities.add(this.userDTO2Entity(dto));
        }
        return entities;
    }}