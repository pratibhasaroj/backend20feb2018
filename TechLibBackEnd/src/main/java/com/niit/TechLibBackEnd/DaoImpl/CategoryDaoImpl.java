/*package com.niit.TechLibBackEnd.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TechLibBackEnd.Dao.CategoryDao;
import com.niit.TechLibBackEnd.Model.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/
	/*
	 * @Transactional public void insertCategory(Category category) { // TODO
	 * Auto-generated method stub Session session = sessionFactory.openSession();
	 * session.beginTransaction(); session.saveOrUpdate(category);
	 * session.getTransaction().commit(); }
	 */

//	@Override

/*	public boolean insertCategory(Category category) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().persist("category");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/

//}
