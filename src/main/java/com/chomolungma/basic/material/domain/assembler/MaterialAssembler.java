package com.chomolungma.basic.material.domain.assembler;

import com.chomolungma.basic.material.domain.entity.Material;
import com.chomolungma.basic.material.domain.mapstruct.MaterialEntityMapStruct;
import com.chomolungma.basic.material.interfaces.param.MaterialDTO;
import com.chomolungma.basic.material.interfaces.param.MaterialPageDTO;
import com.github.pagehelper.PageInfo;

public class MaterialAssembler {
    public static Material toEntity(MaterialDTO materialDTO){
        return MaterialEntityMapStruct.INSTANCE.toEntity(materialDTO);
    }

    public static MaterialDTO toDTO(Material material){
        return MaterialEntityMapStruct.INSTANCE.toDTO(material);
    }

    public static MaterialPageDTO toMaterialPageDTO(PageInfo<Material> page){
        return MaterialEntityMapStruct.INSTANCE.toMaterialPageDTO(page);
    }
}
