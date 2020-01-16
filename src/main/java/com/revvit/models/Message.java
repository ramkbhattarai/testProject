//package com.revvit.models;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="messages", schema = "project2")
//public class Message implements Serializable{
//	
//	
//	private static final long serialVersionUID = -4897418483230042644L;
//	
//	@Id
//	@Column(name="message_id")
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	
//	@Column(name="text", nullable=true)
//	private String text;
//	
//	@Column(name="imageUrl", nullable=true)
//	private String imageUrl;
//	
//	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name="user_fk", insertable = false, updatable = false)
//	private User sender;
//	
//	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name="user_fk", insertable = false, updatable = false)
//	private User receiver;
//
//	public Message() {
//		super();
//	}
//
//	public Message(String text, User sender, User receiver) {
//		super();
//		this.text = text;
//		this.sender = sender;
//		this.receiver = receiver;
//	}
//
//	public Message(String text, String imageUrl, User sender, User receiver) {
//		super();
//		this.text = text;
//		this.imageUrl = imageUrl;
//		this.sender = sender;
//		this.receiver = receiver;
//	}
//
//	public Message(int id, String text, User sender, User receiver) {
//		super();
//		this.id = id;
//		this.text = text;
//		this.sender = sender;
//		this.receiver = receiver;
//	}
//
//	public Message(int id, String text, String imageUrl, User sender, User receiver) {
//		super();
//		this.id = id;
//		this.text = text;
//		this.imageUrl = imageUrl;
//		this.sender = sender;
//		this.receiver = receiver;
//	}
//
//	/**
//	 * @return the id
//	 */
//	public int getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the text
//	 */
//	public String getText() {
//		return text;
//	}
//
//	/**
//	 * @param text the text to set
//	 */
//	public void setText(String text) {
//		this.text = text;
//	}
//
//	/**
//	 * @return the imageUrl
//	 */
//	public String getImageUrl() {
//		return imageUrl;
//	}
//
//	/**
//	 * @param imageUrl the imageUrl to set
//	 */
//	public void setImageUrl(String imageUrl) {
//		this.imageUrl = imageUrl;
//	}
//
//	/**
//	 * @return the sender
//	 */
//	public User getSender() {
//		return sender;
//	}
//
//	/**
//	 * @param sender the sender to set
//	 */
//	public void setSender(User sender) {
//		this.sender = sender;
//	}
//
//	/**
//	 * @return the receiver
//	 */
//	public User getReceiver() {
//		return receiver;
//	}
//
//	/**
//	 * @param receiver the receiver to set
//	 */
//	public void setReceiver(User receiver) {
//		this.receiver = receiver;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, imageUrl, receiver, sender, text);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Message)) {
//			return false;
//		}
//		Message other = (Message) obj;
//		return id == other.id && Objects.equals(imageUrl, other.imageUrl) && Objects.equals(receiver, other.receiver)
//				&& Objects.equals(sender, other.sender) && Objects.equals(text, other.text);
//	}
//
//	@Override
//	public String toString() {
//		return "Message [id=" + id + ", text=" + text + ", imageUrl=" + imageUrl + ", sender=" + sender + ", receiver="
//				+ receiver + "]";
//	}
//	
//	
//}
