package com.restapi.dto;


import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	private String productName;
	private List<CategoryDto> categoryDto=new ArrayList<>();

}
