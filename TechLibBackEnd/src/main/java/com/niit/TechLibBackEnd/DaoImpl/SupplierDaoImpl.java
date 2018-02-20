package com.niit.TechLibBackEnd.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TechLibBackEnd.Dao.SupplierDao;
import com.niit.TechLibBackEnd.Model.Supplier;

@Repository
@Service
public class SupplierDaoImpl implements SupplierDao{

	
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	public
	
	SupplierDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(supplier);
		session.getTransaction().commit();
	}

	
	
	
}
