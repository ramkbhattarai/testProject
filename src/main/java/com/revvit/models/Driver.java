package com.revvit.models;

import java.util.ArrayList;
import java.util.List;

//import com.revvit.dao.HashTagDao;
//import com.revvit.dao.MessageDao;
import com.revvit.dao.RevvitDao;
import com.revvit.dao.UserDao;





public class Driver {
	
	
	public static void main(String[] args) {
		
		initialValues();
		


	}

	public static void initialValues() {
		User u1 = new User("sophia", "gavrila", "soph", "soph@gmail.com", "soph123");
		User u2 = new User("david", "chacon", "chscond", "david@gmail.com", "david123");
		User u3 = new User("andre", "atkins", "andre", "andre@gmail.com", "andre123");
		User u4 = new User("ram", "bhattarai", "ramkb", "ramkb@gmail.com", "ram123");
		
		UserDao udao = new UserDao();
		udao.insert(u1);
		udao.insert(u2);
		udao.insert(u3);
		udao.insert(u4);
		
		Revvit r1 = new Revvit("Revvit is a revolutionary app", u1);
		Revvit r2 = new Revvit("Revvit is a revolutionary app", u1);
		Revvit r3 = new Revvit("Revvit is a revolutionary app", u1);
		Revvit r4 = new Revvit("Revvit is a revolutionary app", u1);
		ArrayList<Revvit> revlist = new ArrayList<>();
		revlist.add(r1);
		u1.setRevvits(revlist);
		RevvitDao rdao = new RevvitDao();
		rdao.insert(r1);
		rdao.insert(r2);
		rdao.insert(r3);
		rdao.insert(r4);
		
//		Message m1 = new Message("Hi", u1, u2);
//		Message m2 = new Message("Hello", u1, u2);
//		Message m3 = new Message("Hihello", u1, u2);
//		Message m4 = new Message("Hey", u1, u2);
//		
//		MessageDao mdao = new MessageDao();
//		mdao.insert(m1);
//		mdao.insert(m2);
//		mdao.insert(m3);
//		mdao.insert(m4);
//		
//		HashTags h1 = new HashTags("cool");
//		HashTags h2 = new HashTags("hot");
//		HashTags h3 = new HashTags("heat");
//		HashTags h4 = new HashTags("cold");
//		
//		HashTagDao hdao = new HashTagDao();
//		hdao.insert(h1);
//		hdao.insert(h2);
//		hdao.insert(h3);
//		hdao.insert(h4);
		
	
		
//		List<Crimes> list1 = new ArrayList<Crimes>();
//		list1.add(c4);
//		list1.add(c2);
//		list1.add(c3);
//		SuperPrisons sp1 = new SuperPrisons("Nepal", "Banepa");
//		SuperVillain sv1 = new SuperVillain("krishna", "Good looks and mood", 29299, list1, sp1);
//		SuperVillainDao svdao = new SuperVillainDao();
//		svdao.insert(sv1);
//		List<SuperVillain> svlist1 = new ArrayList<SuperVillain>();
//		svlist1.add(sv1);
//		sp1.setSpList(svlist1);
		
	}

}
