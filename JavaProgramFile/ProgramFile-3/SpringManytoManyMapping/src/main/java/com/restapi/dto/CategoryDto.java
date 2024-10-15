package com.restapi.dto;



import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
	private String categoryName;
	private List<ProductDto> productDto=new ArrayList<>();

}