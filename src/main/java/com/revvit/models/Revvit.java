package com.revvit.models;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="revvits")
public class Revvit implements Serializable{

	private static final long serialVersionUID = 8582247694397145962L;
	
	@Id
	@Column(name="revvit_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="text", nullable=true)
	private String text;
	
	@Column(name="imageUrl", nullable=true)
	private String imageUrl;
		
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="user_fk")
	private User author;
	
//	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(
//	        name = "revvit_likes", 
//	        joinColumns = { @JoinColumn(name = "revvit_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "user_id") }
//	    )
//	private List<User> likedBy;
//	
//	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(
//	        name = "revvit_reRevvited", 
//	        joinColumns = { @JoinColumn(name = "revvit_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "user_id") }
//	    )
//	private List<User> reRevvitedBy;
//	
//	
//	@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinTable(
//	        name = "revvit_hastags", 
//	        joinColumns = { @JoinColumn(name = "revvit_id") }, 
//	        inverseJoinColumns = { @JoinColumn(name = "hastag_id") }
//	    )
//	private List<HashTags> hashtags;


	public Revvit() {
		super();
	}


	
	public Revvit(String text, User author) {
		super();
		this.text = text;
		this.author = author;
	}



	public Revvit(String text, String imageUrl, User author) {
		super();
		this.text = text;
		this.imageUrl = imageUrl;
		this.author = author;
	}

	

	public Revvit(int id, String text, String imageUrl, User author) {
		super();
		this.id = id;
		this.text = text;
		this.imageUrl = imageUrl;
		this.author = author;
	}



//	public Revvit(int id, String text, String imageUrl, User author, List<User> likedBy) {
//		super();
//		this.id = id;
//		this.text = text;
//		this.imageUrl = imageUrl;
//		this.author = author;
//		this.likedBy = likedBy;
//	}
//
//
//	public Revvit(int id, String text, String imageUrl, User author, List<User> likedBy, List<User> reRevvitedBy) {
//		super();
//		this.id = id;
//		this.text = text;
//		this.imageUrl = imageUrl;
//		this.author = author;
//		this.likedBy = likedBy;
//		this.reRevvitedBy = reRevvitedBy;
//	}
//
//
//	public Revvit(int id, String text, String imageUrl, User author, List<User> likedBy, List<User> reRevvitedBy,
//			List<HashTags> hashtags) {
//		super();
//		this.id = id;
//		this.text = text;
//		this.imageUrl = imageUrl;
//		this.author = author;
//		this.likedBy = likedBy;
//		this.reRevvitedBy = reRevvitedBy;
//		this.hashtags = hashtags;
//	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}


	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}


	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	/**
	 * @return the author
	 */
	public User getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(User author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Revvit [id=" + id + ", text=" + text + ", imageUrl=" + imageUrl + ", author=" + author + "]";
	}


//	/**
//	 * @return the likedBy
//	 */
//	public List<User> getLikedBy() {
//		return likedBy;
//	}
//
//
//	/**
//	 * @param likedBy the likedBy to set
//	 */
//	public void setLikedBy(List<User> likedBy) {
//		this.likedBy = likedBy;
//	}
//
//
//	/**
//	 * @return the reRevvitedBy
//	 */
//	public List<User> getReRevvitedBy() {
//		return reRevvitedBy;
//	}
//
//
//	/**
//	 * @param reRevvitedBy the reRevvitedBy to set
//	 */
//	public void setReRevvitedBy(List<User> reRevvitedBy) {
//		this.reRevvitedBy = reRevvitedBy;
//	}
//
//
//	/**
//	 * @return the hashtags
//	 */
//	public List<HashTags> getHashtags() {
//		return hashtags;
//	}
//
//
//	/**
//	 * @param hashtags the hashtags to set
//	 */
//	public void setHashtags(List<HashTags> hashtags) {
//		this.hashtags = hashtags;
//	}


	
	
	
	
}
