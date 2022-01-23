package com.striker.commissioner.services;

import java.util.List;

import com.striker.commissioner.models.product;

public interface InventoryService {

	public List<product> getProducts();
	public product getProduct(int id);
	public Boolean addProduct(product newProduct);
	public Boolean addProducts(List<product> newProduct);
	public Boolean updateProduct(int id, product updatedProduct);
	public Boolean deleteProduct(int id);
}
