package com.revvit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revvit.models.User;
import com.revvit.utils.HibernateUtil;



public class UserDao {
	
	public UserDao() {
		
	}
	
	public void insert(User u) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(u);
		tx.commit();
	}
	
	public void update(User u) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(u);
		tx.commit();
	}
	
	public User selectById( int id) {
		Session ses = HibernateUtil.getSession();
		User u = ses.get(User.class, id);
		return u;
	}
	
	public User selectByName(String username) {
		Session ses = HibernateUtil.getSession();
		
		List<User> userlist = ses.createQuery("from users where name='"+ username +"'", User.class ).list();
		 if(userlist.size() == 0) {
			 System.out.println("Error");
			 return null;
		 }
		 return userlist.get(0);
	}
	
	public List<User> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<User> list = ses.createQuery("from users", User.class).list();
		return list.size() == 0 ? null : list;
	}

}
