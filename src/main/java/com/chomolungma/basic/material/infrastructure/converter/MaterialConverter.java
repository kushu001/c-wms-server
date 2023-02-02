package com.chomolungma.basic.material.infrastructure.converter;

import com.chomolungma.basic.material.domain.entity.Material;
import com.chomolungma.basic.material.infrastructure.dataobject.MaterialDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MaterialConverter {
    MaterialConverter INSTANCE = Mappers.getMapper(MaterialConverter.class);
    Material toEntity(MaterialDO materialDO);
    MaterialDO toDO(Material material);
    List<Material> toEntity(List<MaterialDO> materialDOS);
}
