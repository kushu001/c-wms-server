package com.chomolungma.basic.material.infrastructure.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import com.chomolungma.core.dataobject.BaseDO;
import lombok.Data;

@Data
@TableName("wms_material")
public class MaterialDO extends BaseDO {
    private String code;
    private String name;
    private String spec;
    private String model;
    private Long brand;
    private Long supplier;
    private String remark;
    private Boolean enabled;
    private Boolean deleted;
}
