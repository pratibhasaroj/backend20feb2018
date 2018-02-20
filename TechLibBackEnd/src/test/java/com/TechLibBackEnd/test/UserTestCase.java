package com.TechLibBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TechLibBackEnd.Dao.UserDao;
import com.niit.TechLibBackEnd.Model.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static UserDao userDao;
	
	private User user;
	@BeforeClass	
	public static void init() {
		context =new AnnotationConfigApplicationContext();
		context.scan("com.niit.TechLibBackEnd");
		context.refresh();
		userDao=(UserDao)context.getBean("userDao");
		
	}
	/*@Test
	public void testInsertuser() {
		 user=new User();
		 user.setAddress("fgfghfhgg");
		 user.setEmail("asdf@hjh.com");
		 user.setEnabled(true);
		 user.setPassword("123456");
		 user.setPhone("87564544");		 
		 user.setRole("admin");
		 user.setUsername("prati");
		 assertEquals("user added successfully",true,userDao.insertUser(user));
		 
		
	}
	*/
		/*@Test
	public void testGetuser() {
		user=userDao.
		}*/
	}
	

