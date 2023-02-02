package com.chomolungma.basic.material.infrastructure.mybatis.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chomolungma.basic.material.infrastructure.dataobject.MaterialDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MaterialMapper extends BaseMapper<MaterialDO> {
}
