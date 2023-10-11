package com.javaSpring.KidBlock.Domain.Entity;

import java.util.List;

import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.javaSpring.KidBlock.Domain.Enum.KidAction;
import com.javaSpring.KidBlock.Domain.Enum.KidMode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class KidDevice extends BaseEntity {
	@Column
	@Id
	@UuidGenerator
	private String kidDeviceId; 
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

	@ManyToOne
	@JoinColumn(name = "parent_Id")
	private AccountParent accountParent;

	@OneToMany(mappedBy = "kidDevice", cascade  = CascadeType.ALL)
	private List<Block> blocks;

	@OneToMany(mappedBy = "kidDevice" , cascade =   CascadeType.ALL)
	private List<Used> useds;

	public String getKidDeviceId() {
		return kidDeviceId;
	}
	public void setKidDeviceId(String kidDeviceId) {
		this.kidDeviceId = kidDeviceId;
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

	public AccountParent getAccountParent() {
		return accountParent;
	}
	public void setAccountParent(AccountParent accountParent) {
		this.accountParent = accountParent;
	}
	public List<Block> getBlocks() {
		return blocks;
	}
	public List<Used> getUseds() {
		return useds;
	}
	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}
	public void setUseds(List<Used> useds) {
		this.useds = useds;
	}
	
}
