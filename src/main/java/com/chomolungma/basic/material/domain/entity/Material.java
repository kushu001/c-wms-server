package com.chomolungma.basic.material.domain.entity;

import com.chomolungma.core.entity.BaseEntity;
import lombok.Data;

@Data
public class Material extends BaseEntity {
    private String code;
    private String name;
    private String spec;
    private String model;
    private String unit;
    private Long brand;
    private Long supplier;
    private String remark;
    private Boolean enabled;
    private Boolean deleted;
}
