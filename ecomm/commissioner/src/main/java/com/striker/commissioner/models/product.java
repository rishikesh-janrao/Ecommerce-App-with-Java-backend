package com.striker.commissioner.models;

import java.util.List;

import lombok.Data;

public @Data class product {	
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
}

