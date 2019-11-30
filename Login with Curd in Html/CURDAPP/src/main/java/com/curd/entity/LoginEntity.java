package com.curd.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import lombok.Data;

//@Data
@Entity(name = "loginuser")
public class LoginEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String phoneNo;
	private String seatNo;
	private LocalDateTime createdTimestamp;
	private LocalDateTime modifiedTimestamp;
	private boolean login;
	private String media;
	private String advertisement;
	private String currentMedia;
	private String currentMediaPosition;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public LocalDateTime getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	public LocalDateTime getModifiedTimestamp() {
		return modifiedTimestamp;
	}
	public void setModifiedTimestamp(LocalDateTime modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getAdvertisement() {
		return advertisement;
	}
	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}
	public String getCurrentMedia() {
		return currentMedia;
	}
	public void setCurrentMedia(String currentMedia) {
		this.currentMedia = currentMedia;
	}
	public String getCurrentMediaPosition() {
		return currentMediaPosition;
	}
	public void setCurrentMediaPosition(String currentMediaPosition) {
		this.currentMediaPosition = currentMediaPosition;
	}
	
	

}
