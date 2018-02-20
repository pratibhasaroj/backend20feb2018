package com.niit.TechLibBackEnd.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TechLibBackEnd.Dao.UserDao;
import com.niit.TechLibBackEnd.Model.User;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	//private UserDao userdao;
	
	  public UserDaoImpl(SessionFactory sessionFactory) { super();
	  this.sessionFactory = sessionFactory; }
	  
	 /*
	 * 
	 * @Transactional public void insertUser(User user) { // TODO Auto-generated
	 * method stub Session session=sessionFactory.openSession();
	 * session.beginTransaction(); session.saveOrUpdate(user);
	 * session.getTransaction().commit(); }
	 */

	@Override
	public boolean insertUser(User user) {
		try {

			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub

		return sessionFactory.getCurrentSession().get(User.class, Integer.valueOf(id));
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
