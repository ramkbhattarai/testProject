//package com.revvit.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.revvit.models.Message;
//
//import com.revvit.utils.HibernateUtil;
//
//public class MessageDao {
//	
//	public MessageDao() {
//		
//	}
//	
//	public void insert(Message m) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(m);
//		tx.commit();
//	}
//	
//	public void update(Message m) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(m);
//		tx.commit();
//	}
//	
//	public Message selectById( int id) {
//		Session ses = HibernateUtil.getSession();
//		Message m = ses.get(Message.class, id);
//		return m;
//	}
//	
//
//	
//	public List<Message> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<Message> list = ses.createQuery("from messages", Message.class).list();
//		return list.size() == 0 ? null : list;
//	}
//
//
//}
