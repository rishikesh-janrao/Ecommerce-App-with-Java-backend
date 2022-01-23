package com.striker.commissioner.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.striker.commissioner.models.product;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	public List<product> list;
	public InventoryServiceImpl() {
		list = new ArrayList<product>();
	}

	@Override
	public List<product> getProducts() {
		return list;
	}

	@Override
	public product getProduct(int id) {
		product prod = null;
		Boolean status = false;
		try {
			for(product item:list)
			{
				if(item.getId() == id) {
					prod = item;
					status = true;
					break;
				}
				else {
					status = false;
				}
			}
		}
		catch(NullPointerException e) {
			if (e != null) {
				status = false;
			}
		}
		
		return status ? prod : null;
	}

	@Override
	public Boolean addProduct(product newProduct) {
		newProduct.setId(list.size()+1);
		return list.add(newProduct);
	}
	@Override
	public Boolean addProducts(List<product> newProduct) {
		return list.addAll(newProduct);
	}

	@Override
	public Boolean updateProduct(int id, product updatedProduct) {
		Boolean status = false;
		updatedProduct.setId(id);
		try {
			for(int i=0; i<list.size();i++) {
				if(list.get(i).getId() == id)
				{
					list.set(i, updatedProduct);
					status = true;
					break;
				}
				else {
					status = false;
				}
			}
		}
		catch(NullPointerException e) {
			if (e != null) {
				status = false;
			}
		}
		
		return status;
	}

	@Override
	public Boolean deleteProduct(int id) {
		Boolean status = false;
		product shiftProd = null;
		try {
			for(int i=0; i<list.size();i++) {
				if(list.get(i).getId() == id)
				{
					list.remove(i);
					for(int j = i; j<list.size();j++) {
						shiftProd =  list.get(j);
						shiftProd.setId(id);
						list.set(j, shiftProd);
					}
					status = true;
					break;
				}
				else {
					status = false;
				}
			}
		}
		catch(NullPointerException e) {
			if (e != null) {
				status = false;
			}
		}
		
		return status;
	}

}
