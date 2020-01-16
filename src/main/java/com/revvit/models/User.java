package com.revvit.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="revvit_users")
public class User implements Serializable{ // do we need this? to be serializable?
	
	
	private static final long serialVersionUID = 4299025609319660614L;
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="fname", nullable=false)
	private String fname;
	
	@Column(name="lname", nullable=false)
	private String lname;
	
	@Column(name="username", nullable=false)
	private String userName;
	
	@Column(name="email", unique=true, nullable=false)
	private String email;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="profilePicture", nullable=true)
	private String profilePicture;
	
	@OneToMany(mappedBy="author", fetch = FetchType.LAZY)
	private List<Revvit> revvits = new ArrayList<>();
	
//	@OneToMany(mappedBy="sender", fetch = FetchType.LAZY)
//	private List<Message> send_messages = new ArrayList<>();
//	
//	@OneToMany(mappedBy="receiver", fetch = FetchType.LAZY)
//	private List<Message> received_messages = new ArrayList<>();
//	
//	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(
//	        name = "user_liked_revvit", 
//	        joinColumns = { @JoinColumn(name = "user_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "revvit_id") }
//	    )
//	private List<Revvit> liked;
//	
//	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(
//	        name = "user_reRevvited", 
//	        joinColumns = { @JoinColumn(name = "user_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "revvit_id") }
//	    )
//	private List<Revvit> reRevvited;
//	
//	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(
//	        name = "user_followers", 
//	        joinColumns = { @JoinColumn(name = "user_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "user_id") }
//	    )
//	private List<User> followers = new ArrayList<>();
//	
//	
//	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(
//	        name = "user_followering", 
//	        joinColumns = { @JoinColumn(name = "user_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "user_id") }
//	    )
//	private List<User> following = new ArrayList<>();


	public User() {
		super();
	}


	
	public User(String fname, String lname, String userName, String email, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}



	public User(String fname, String lname, String userName, String email, String password, String profilePicture) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.profilePicture = profilePicture;
	}


	public User(int id, String fname, String lname, String userName, String email, String password,
			String profilePicture, List<Revvit> revvits) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.profilePicture = profilePicture;
		this.revvits = revvits;
	}

//
//	public User(int id, String fname, String lname, String userName, String email, String password,
//			String profilePicture, List<Revvit> revvits, List<Message> send_messages) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.userName = userName;
//		this.email = email;
//		this.password = password;
//		this.profilePicture = profilePicture;
//		this.revvits = revvits;
//		this.send_messages = send_messages;
//	}


//	public User(int id, String fname, String lname, String userName, String email, String password,
//			String profilePicture, List<Revvit> revvits, List<Message> send_messages, List<Message> received_messages) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.userName = userName;
//		this.email = email;
//		this.password = password;
//		this.profilePicture = profilePicture;
//		this.revvits = revvits;
//		this.send_messages = send_messages;
//		this.received_messages = received_messages;
//	}

//
//	public User(int id, String fname, String lname, String userName, String email, String password,
//			String profilePicture, List<Revvit> revvits, List<Message> send_messages, List<Message> received_messages,
//			List<Revvit> liked) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.userName = userName;
//		this.email = email;
//		this.password = password;
//		this.profilePicture = profilePicture;
//		this.revvits = revvits;
//		this.send_messages = send_messages;
//		this.received_messages = received_messages;
//		this.liked = liked;
//	}


//	public User(int id, String fname, String lname, String userName, String email, String password,
//			String profilePicture, List<Revvit> revvits, List<Message> send_messages, List<Message> received_messages,
//			List<Revvit> liked, List<Revvit> reRevvited) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.userName = userName;
//		this.email = email;
//		this.password = password;
//		this.profilePicture = profilePicture;
//		this.revvits = revvits;
//		this.send_messages = send_messages;
//		this.received_messages = received_messages;
//		this.liked = liked;
//		this.reRevvited = reRevvited;
//	}


//	public User(int id, String fname, String lname, String userName, String email, String password,
//			String profilePicture, List<Revvit> revvits, List<Message> send_messages, List<Message> received_messages,
//			List<Revvit> liked, List<Revvit> reRevvited, List<User> followers) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.userName = userName;
//		this.email = email;
//		this.password = password;
//		this.profilePicture = profilePicture;
//		this.revvits = revvits;
//		this.send_messages = send_messages;
//		this.received_messages = received_messages;
//		this.liked = liked;
//		this.reRevvited = reRevvited;
//		this.followers = followers;
//	}
//
//
//	public User(int id, String fname, String lname, String userName, String email, String password,
//			String profilePicture, List<Revvit> revvits, List<Message> send_messages, List<Message> received_messages,
//			List<Revvit> liked, List<Revvit> reRevvited, List<User> followers, List<User> following) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.userName = userName;
//		this.email = email;
//		this.password = password;
//		this.profilePicture = profilePicture;
//		this.revvits = revvits;
//		this.send_messages = send_messages;
//		this.received_messages = received_messages;
//		this.liked = liked;
//		this.reRevvited = reRevvited;
//		this.followers = followers;
//		this.following = following;
//	}


	
	public int getId() {
		return id;
	}


	
	public void setId(int id) {
		this.id = id;
	}


	
	public String getFname() {
		return fname;
	}


	
	public void setFname(String fname) {
		this.fname = fname;
	}


	
	public String getLname() {
		return lname;
	}


	
	public void setLname(String lname) {
		this.lname = lname;
	}


	
	public String getUserName() {
		return userName;
	}


	
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	
	public void setEmail(String email) {
		this.email = email;
	}


	
	public String getPassword() {
		return password;
	}


	
	public void setPassword(String password) {
		this.password = password;
	}


	
	public String getProfilePicture() {
		return profilePicture;
	}


	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}


	
	public List<Revvit> getRevvits() {
		return revvits;
	}


	public void setRevvits(List<Revvit> revvits) {
		this.revvits = revvits;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", userName=" + userName + ", email="
				+ email + ", password=" + password + ", profilePicture=" + profilePicture + ", revvits=" + revvits
				+ "]";
	}


	
//	public List<Message> getSend_messages() {
//		return send_messages;
//	}
//
//
//	
//	public void setSend_messages(List<Message> send_messages) {
//		this.send_messages = send_messages;
//	}
//
//
//	
//	public List<Message> getReceived_messages() {
//		return received_messages;
//	}
//
//
//	
//	public void setReceived_messages(List<Message> received_messages) {
//		this.received_messages = received_messages;
//	}
//
//
//	
//	public List<Revvit> getLiked() {
//		return liked;
//	}
//
//
//	
//	public void setLiked(List<Revvit> liked) {
//		this.liked = liked;
//	}
//
//
//	
//	public List<Revvit> getReRevvited() {
//		return reRevvited;
//	}
//
//
//	public void setReRevvited(List<Revvit> reRevvited) {
//		this.reRevvited = reRevvited;
//	}
//
//
//	
//	public List<User> getFollowers() {
//		return followers;
//	}
//
//
//	
//	public void setFollowers(List<User> followers) {
//		this.followers = followers;
//	}
//
//
//	public List<User> getFollowing() {
//		return following;
//	}
//
//
//	public void setFollowing(List<User> following) {
//		this.following = following;
//	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(email, fname, followers, following, id, liked, lname, password, profilePicture, reRevvited,
//				received_messages, revvits, send_messages, userName);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof User)) {
//			return false;
//		}
//		User other = (User) obj;
//		return Objects.equals(email, other.email) && Objects.equals(fname, other.fname)
//				&& Objects.equals(followers, other.followers) && Objects.equals(following, other.following)
//				&& id == other.id && Objects.equals(liked, other.liked) && Objects.equals(lname, other.lname)
//				&& Objects.equals(password, other.password) && Objects.equals(profilePicture, other.profilePicture)
//				&& Objects.equals(reRevvited, other.reRevvited)
//				&& Objects.equals(received_messages, other.received_messages) && Objects.equals(revvits, other.revvits)
//				&& Objects.equals(send_messages, other.send_messages) && Objects.equals(userName, other.userName);
//	}
//
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", userName=" + userName + ", email="
//				+ email + ", password=" + password + ", profilePicture=" + profilePicture + ", revvits=" + revvits
//				+ ", send_messages=" + send_messages + ", received_messages=" + received_messages + ", liked=" + liked
//				+ ", reRevvited=" + reRevvited + ", followers=" + followers + ", following=" + following + "]";
//	}
	
	
}
