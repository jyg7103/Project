package com.example.project.model.shop.dao;

import java.util.List;

import com.example.project.model.shop.dto.CategoryDTO;
import com.example.project.model.shop.dto.ProductDTO;

public interface ProductDAO {
	List<ProductDTO> listProduct();
	ProductDTO detailProduct(int product_id);
	void updateProduct(ProductDTO dto);
	void deleteProduct(int product_id);
	void insertProduct(ProductDTO dto);
	String fileInfo(int product_id);
	public List<CategoryDTO> category();

}
