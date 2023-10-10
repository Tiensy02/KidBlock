package com.javaSpring.KidBlock.Domain.Entity;



import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Block  extends BaseEntity {
	@Column
	@Id
	@UuidGenerator
	private String blockID;
	@Column
	private String kidDeviceID;
	@Column
	private LocalDate  blockTimeBlock;
	@Column
	private LocalDate blockTimeEdit;
	@Column
	private String parentID;
	@Column
	private String blockName;
	@Column
	private String blockCode;
	public String getBlockID() {
		return blockID;
	}
	public void setBlockID(String blockID) {
		this.blockID = blockID;
	}
	public String getKidDeviceID() {
		return kidDeviceID;
	}
	public void setKidDeviceID(String kidDeviceID) {
		this.kidDeviceID = kidDeviceID;
	}
	public LocalDate getBlockTimeBlock() {
		return blockTimeBlock;
	}
	public void setBlockTimeBlock(LocalDate blockTimeBlock) {
		this.blockTimeBlock = blockTimeBlock;
	}
	public LocalDate getBlockTimeEdit() {
		return blockTimeEdit;
	}
	public void setBlockTimeEdit(LocalDate blockTimeEdit) {
		this.blockTimeEdit = blockTimeEdit;
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	
	
}
