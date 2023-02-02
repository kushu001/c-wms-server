package com.chomolungma.basic.material.infrastructure.mybatis.repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chomolungma.basic.material.domain.entity.Material;
import com.chomolungma.basic.material.domain.repository.IMaterialRepository;
import com.chomolungma.basic.material.infrastructure.converter.MaterialConverter;
import com.chomolungma.basic.material.infrastructure.dataobject.MaterialDO;
import com.chomolungma.basic.material.infrastructure.mybatis.repository.mapper.MaterialMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

@Repository
public class MaterialRepositoryImpl implements IMaterialRepository {
    private final MaterialMapper materialMapper;
    public MaterialRepositoryImpl(MaterialMapper materialMapper){
        this.materialMapper = materialMapper;
    }
    @Override
    public void save(Material material) {
        MaterialDO materialDO = MaterialConverter.INSTANCE.toDO(material);
        if (StringUtils.isEmpty(materialDO.getId())){
            materialMapper.insert(materialDO);
        }else{
            materialMapper.updateById(materialDO);
        }
    }

    @Override
    public void remove(List<String> ids) {
        materialMapper.deleteBatchIds(ids);
    }

    @Override
    public Material find(Long id) {
        return MaterialConverter.INSTANCE.toEntity(materialMapper.selectById(id));
    }

    @Override
    public PageInfo<Material> findPageList(Material material, int current, int size) {
        MaterialDO materialDO = MaterialConverter.INSTANCE.toDO(material);
        PageHelper.startPage(current, size);
        List<MaterialDO> materials = materialMapper.selectList(new QueryWrapper<>());
        PageInfo<Material> pageInfo = new PageInfo<>(MaterialConverter.INSTANCE.toEntity(materials));
        return pageInfo;
    }
}
