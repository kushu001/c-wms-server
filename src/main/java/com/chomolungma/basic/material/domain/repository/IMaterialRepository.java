package com.chomolungma.basic.material.domain.repository;

import com.chomolungma.basic.material.domain.entity.Material;
import com.chomolungma.basic.material.infrastructure.dataobject.MaterialDO;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IMaterialRepository {
    void save(Material material);
    void remove(List<String> ids);
    Material find(Long id);

    PageInfo<Material> findPageList(Material material, int current, int size);


}
