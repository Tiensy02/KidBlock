package com.javaSpring.KidBlock.Domain.Entity;

import org.hibernate.annotations.UuidGenerator;

import com.javaSpring.KidBlock.Domain.Enum.KidAction;
import com.javaSpring.KidBlock.Domain.Enum.KidMode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class KidDevice extends BaseEntity {
	@Column
	@Id
	@UuidGenerator
	private String kidDeviceID;
	@Column
	private String kidDeviceName;
	@Column
	private int kidDeviceKidAge;
	@Column
	private String kidDeviceKidAvatar;
	@Column
	private KidMode kidDeviceParentMode;
	@Column
	private KidAction kidDeviceAction;
	@Column
	private int kidDeviceCode;
	@Column
	private String parentID;


	public String getKidDeviceID() {
		return kidDeviceID;
	}
	public void setKidDeviceID(String kidDeviceID) {
		this.kidDeviceID = kidDeviceID;
	}
	public String getKidDeviceName() {
		return kidDeviceName;
	}
	public void setKidDeviceName(String kidDeviceName) {
		this.kidDeviceName = kidDeviceName;
	}
	public int getKidDeviceKidAge() {
		return kidDeviceKidAge;
	}
	public void setKidDeviceKidAge(int kidDeviceKidAge) {
		this.kidDeviceKidAge = kidDeviceKidAge;
	}
	public String getKidDeviceKidAvatar() {
		return kidDeviceKidAvatar;
	}
	public void setKidDeviceKidAvatar(String kidDeviceKidAvatar) {
		this.kidDeviceKidAvatar = kidDeviceKidAvatar;
	}
	public KidMode getKidDeviceParentMode() {
		return kidDeviceParentMode;
	}
	public void setKidDeviceParentMode(KidMode kidDeviceParentMode) {
		this.kidDeviceParentMode = kidDeviceParentMode;
	}
	public KidAction getKidDeviceAction() {
		return kidDeviceAction;
	}
	public void setKidDeviceAction(KidAction kidDeviceAction) {
		this.kidDeviceAction = kidDeviceAction;
	}
	public int getKidDeviceCode() {
		return kidDeviceCode;
	}
	public void setKidDeviceCode(int kidDeviceCode) {
		this.kidDeviceCode = kidDeviceCode;
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	
	
}
