package com.chomolungma.basic.material.interfaces.param;

import com.chomolungma.core.dto.PageDTO;
import lombok.Data;

@Data
public class MaterialDTO extends PageDTO {
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
