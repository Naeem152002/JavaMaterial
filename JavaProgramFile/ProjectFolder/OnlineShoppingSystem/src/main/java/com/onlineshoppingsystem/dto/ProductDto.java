package com.onlineshoppingsystem.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private List<ImageDto> images=new ArrayList<ImageDto>();
    private CategoryDto category;
  // private List<ImageDto> images=new ArrayList<ImageDto>();
}
