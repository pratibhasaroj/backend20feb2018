package com.niit.TechLibBackEnd.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TechLibBackEnd.Model.Product;

@Repository
	@Service
	public class ProductDaoImpl {
		
		@Autowired
		SessionFactory sessionFactory;
		@Autowired
		public
		
		ProductDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}
		
		@Transactional
		public void insertProduct(Product product) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(product);
			session.getTransaction().commit();
		}
			
		
	
	
}
