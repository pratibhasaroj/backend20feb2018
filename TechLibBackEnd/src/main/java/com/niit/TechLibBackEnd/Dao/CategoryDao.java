package com.niit.TechLibBackEnd.Dao;

import java.util.List;

import com.niit.TechLibBackEnd.Model.Category;

public interface CategoryDao {
	
    boolean insertCategory(Category category);
	List <Category> list();
	Category get(int id);
	
}
