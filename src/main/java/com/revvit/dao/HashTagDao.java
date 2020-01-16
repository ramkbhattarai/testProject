//package com.revvit.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.revvit.models.HashTags;
//
//import com.revvit.utils.HibernateUtil;
//
//public class HashTagDao {
//	
//	public HashTagDao() {
//		
//	}
//	
//	public void insert(HashTags h) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.save(h);
//		tx.commit();
//	}
//	
//	public void update(HashTags h) {
//		Session ses = HibernateUtil.getSession();
//		Transaction tx = ses.beginTransaction();
//		ses.update(h);
//		tx.commit();
//	}
//	
//	public HashTags selectById( int id) {
//		Session ses = HibernateUtil.getSession();
//		HashTags h = ses.get(HashTags.class, id);
//		return h;
//	}
//	
//	
//	
//	public List<HashTags> selectAll(){
//		Session ses = HibernateUtil.getSession();
//		List<HashTags> list = ses.createQuery("from hashTags", HashTags.class).list();
//		return list.size() == 0 ? null : list;
//	}
//
//}
