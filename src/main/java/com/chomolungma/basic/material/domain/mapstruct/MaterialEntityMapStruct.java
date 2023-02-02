package com.chomolungma.basic.material.domain.mapstruct;

import com.chomolungma.basic.material.domain.entity.Material;
import com.chomolungma.basic.material.interfaces.param.MaterialDTO;
import com.chomolungma.basic.material.interfaces.param.MaterialPageDTO;
import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MaterialEntityMapStruct {
    MaterialEntityMapStruct INSTANCE = Mappers.getMapper(MaterialEntityMapStruct.class);

    Material toEntity(MaterialDTO materialDTO);

    MaterialDTO toDTO(Material material);

    @Mappings({
            @Mapping(target = "records", source = "list"),
            @Mapping(target = "page", source = "pageNum")
    })
    MaterialPageDTO toMaterialPageDTO(PageInfo<Material> materialPageInfo);

}
