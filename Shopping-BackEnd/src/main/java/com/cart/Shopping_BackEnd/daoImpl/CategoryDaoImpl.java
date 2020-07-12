package com.cart.Shopping_BackEnd.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cart.Shopping_BackEnd.dao.CategoryDao;
import com.cart.Shopping_BackEnd.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		     Category category = new Category();
		     //----1st-----one-----//
		category.setId(1);
		category.setName("Television");
		category.setDescription("we have tv");
		category.setImgURL("Dog1.png");
		categories.add(category);
		
	     //----2nd-----one-----//
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("we have mobiles");
		category.setImgURL("");
		categories.add(category);
		
		//---3rd---one-----//
	
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("we have laptopes");
		category.setImgURL("");
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
