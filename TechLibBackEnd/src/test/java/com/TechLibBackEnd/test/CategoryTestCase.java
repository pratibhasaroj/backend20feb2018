/*package com.TechLibBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TechLibBackEnd.Dao.CategoryDao;
//import com.niit.TechLibBackEnd.Dao.UserDao;
import com.niit.TechLibBackEnd.Model.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDao categoryDao;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.TechLibBackEnd");;
		context.refresh();
		
		categoryDao=(CategoryDao)context.getBean("categoryDao");
		
		
	}
	
	@Test
	public void testinsertCategory() {
		
		category =new Category();
		
		category.setCname("Books");
		category.setDescription("nice one");
		
		
		assertEquals("successfully added category",true,categoryDao.insertCategory(category));
		
	}
	
	
	
}
*/