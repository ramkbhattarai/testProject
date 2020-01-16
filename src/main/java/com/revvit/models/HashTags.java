//package com.revvit.models;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="hashTags", schema = "project2")
//public class HashTags implements Serializable{
//	
//	private static final long serialVersionUID = -7663635029902555398L;
//
//	@Id
//	@Column(name="hashtage_id")
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	
//	@Column(name="text", nullable=false)
//	private String text;
//
//	public HashTags() {
//		super();
//	}
//
//	public HashTags(String text) {
//		super();
//		this.text = text;
//	}
//
//	public HashTags(int id, String text) {
//		super();
//		this.id = id;
//		this.text = text;
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
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, text);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof HashTags)) {
//			return false;
//		}
//		HashTags other = (HashTags) obj;
//		return id == other.id && Objects.equals(text, other.text);
//	}
//
//	@Override
//	public String toString() {
//		return "HashTags [id=" + id + ", text=" + text + "]";
//	}
//	
//	
//
//}
