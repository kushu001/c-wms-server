package com.chomolungma.basic.material.interfaces.controller;

import com.chomolungma.basic.material.domain.assembler.MaterialAssembler;
import com.chomolungma.basic.material.domain.entity.Material;
import com.chomolungma.basic.material.domain.repository.IMaterialRepository;
import com.chomolungma.basic.material.interfaces.param.MaterialDTO;
import com.chomolungma.core.dto.PageDTO;
import com.chomolungma.core.result.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@RestController
@RequestMapping("/api/v1/material")
public class MaterialController {
    private final IMaterialRepository iMaterialRepository;
    public MaterialController(IMaterialRepository iMaterialRepository){
        this.iMaterialRepository = iMaterialRepository;
    }

    @GetMapping
    public Result pageList(PageDTO pageDTO,
                           @RequestParam(required = false) String code,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false) String spec,
                           @RequestParam(required = false) String model,
                           @RequestParam(required = false) Boolean enabled){
        Material material = new Material();

        PageInfo<Material> pageInfo = iMaterialRepository.findPageList(material, pageDTO.getPage(), pageDTO.getLimit());
        return Result.success(MaterialAssembler.toMaterialPageDTO(pageInfo));
    }

    @GetMapping("/{id}")
    public Result getMaterial(@PathVariable("id") Long id){
        return Result.success(MaterialAssembler.toDTO(iMaterialRepository.find(id)));
    }


    @PostMapping
    public Result createMaterial(@RequestBody MaterialDTO materialDTO){
        iMaterialRepository.save(MaterialAssembler.toEntity(materialDTO));
        return Result.success();
    }

    @PutMapping
    public Result modifyMaterial(@RequestBody MaterialDTO materialDTO){
        iMaterialRepository.save(MaterialAssembler.toEntity(materialDTO));
        return Result.success();
    }

    @DeleteMapping("/{ids}")
    public Result deleteMaterial(@PathVariable String ids){
        iMaterialRepository.remove(Arrays.asList(ids.split(",")));
        return Result.success();
    }
}
