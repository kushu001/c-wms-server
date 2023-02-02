package com.chomolungma.basic.material.interfaces.param;

import com.chomolungma.core.dto.PageDTO;
import lombok.Data;

import java.util.List;
@Data
public class MaterialPageDTO extends PageDTO {
    private List<MaterialDTO> records;
}
