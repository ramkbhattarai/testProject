package com.revvit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revvit.models.Revvit;
import com.revvit.models.User;
import com.revvit.utils.HibernateUtil;

public class RevvitDao {
	
	public RevvitDao() {
		
	}
	
	public void insert(Revvit r) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(r);
		tx.commit();
	}
	
	public void update(Revvit r) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(r);
		tx.commit();
	}
	
	public Revvit selectById( int id) {
		Session ses = HibernateUtil.getSession();
		Revvit r = ses.get(Revvit.class, id);
		return r;
	}
	
	
	public List<Revvit> selectAll(){
		Session ses = HibernateUtil.getSession();
		List<Revvit> list = ses.createQuery("from revvits", Revvit.class).list();
		return list.size() == 0 ? null : list;
	}
	
	


}
