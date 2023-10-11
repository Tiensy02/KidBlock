package com.javaSpring.KidBlock.Domain.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

import org.hibernate.annotations.UuidGenerator;

@Entity
public class AccountParent extends BaseEntity {
	@Column()
	@Id
	@UuidGenerator
	private String parentId;
	@Column
	private String parentPassword;
	@Column
	private int parentPassPin;
	@Column
	private String parentEmail;
	@Column
	private String parentName;
	@Column
	private String parentAvatar;

	@OneToMany(mappedBy = "accountParent", cascade =  CascadeType.ALL)
	private List<KidDevice> kidDevices ;

	@OneToMany(mappedBy = "accountParent", cascade  = CascadeType.ALL)
	private List<Block> blocks;

	public void setKidDevices(List<KidDevice> kidDevices) {
		this.kidDevices = kidDevices;
	}
	public List<KidDevice> getKidDevices() {
		return kidDevices;
	}
	public String getParentID() {
		return parentId;
	}
	public void setParentID(String parentID) {
		this.parentId = parentID;
	}
	public String getParentPassword() {
		return parentPassword;
	}
	public void setParentPassword(String parentPassword) {
		this.parentPassword = parentPassword;
	}
	public int getParentPassPin() {
		return parentPassPin;
	}
	public void setParentPassPin(int parentPassPIN) {
		this.parentPassPin = parentPassPIN;
	}
	public String getParentEmail() {
		return parentEmail;
	}
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentAvatar() {
		return parentAvatar;
	}
	public void setParentAvatar(String parentAvatar) {
		this.parentAvatar = parentAvatar;
	}
}

    

