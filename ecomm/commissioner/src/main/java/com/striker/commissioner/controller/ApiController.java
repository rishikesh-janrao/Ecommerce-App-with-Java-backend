package com.striker.commissioner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.striker.commissioner.models.product;
import com.striker.commissioner.services.InventoryService;

@RestController
public class ApiController {

	@Autowired
	public InventoryService invService;
	
	
	//Returns all products
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/inventory")
	public List<product> getAllItems() {		
		return this.invService.getProducts();
	}
	
	//Returns only product with matched id
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/inventory/{id}")
	public product getInventoryItem(@PathVariable int id) {
		return this.invService.getProduct(id);
	}
	
	//Creates product with auto id
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/inventory/add")
	public Boolean addInventoryItem(@RequestBody product newProduct) {
		return this.invService.addProduct(newProduct);
	}
	
	//Creates products in bulk
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/inventory/addAll")
	public Boolean addInventoryItems(@RequestBody List<product> newProduct) {
		return this.invService.addProducts(newProduct);
	}
	
	//updates product with id
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/inventory/update/{id}")
	public Boolean updateInventoryItem(@PathVariable int id, @RequestBody product updatedProduct) {
		return this.invService.updateProduct(id,updatedProduct);
	}
	
	//deletes product with id
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/inventory/delete/{id}")
	public Boolean deleteInventoryItem(@PathVariable int id) {
		return this.invService.deleteProduct(id);
	}
}
