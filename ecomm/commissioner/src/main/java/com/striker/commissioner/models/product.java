package com.striker.commissioner.models;

import java.util.List;

public class product {	
	//product entity
	public int id;
    public int categoryId;
    public String productName;
    public String description;
    public String rating;
    public int price;
    public String productImg;
    public Boolean isAvailable;
    public List<String> color;
    public int reviews;
	public product() {
		super();
	}
	public product(int id, int categoryId, String productName, String description, String rating, int price,
			String productImg, Boolean isAvailable, List<String> color, int reviews) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.productImg = productImg;
		this.isAvailable = isAvailable;
		this.color = color;
		this.reviews = reviews;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public List<String> getColor() {
		return color;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}
	public int getReviews() {
		return reviews;
	}
	public void setReviews(int reviews) {
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", categoryId=" + categoryId + ", productName=" + productName + ", description="
				+ description + ", rating=" + rating + ", price=" + price + ", productImg=" + productImg
				+ ", isAvailable=" + isAvailable + ", color=" + color + ", reviews=" + reviews + "]";
	}
	
    
    
}

