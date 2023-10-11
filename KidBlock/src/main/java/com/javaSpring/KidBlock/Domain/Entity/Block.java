package com.javaSpring.KidBlock.Domain.Entity;



import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Block  extends BaseEntity {
	@Column
	@Id
	@UuidGenerator
	private String blockId;

	@Column
	private LocalDate  blockTimeBlock;
	@Column
	private LocalDate blockTimeEdit;
	@Column
	private String blockName;
	@Column
	private String blockCode;

	@ManyToOne
	@JoinColumn(name = "parent_Id")
	private AccountParent accountParent;

	@ManyToOne
	@JoinColumn(name = "kid_device_id")
	private KidDevice kidDevice;

	public String getBlockId() {
		return blockId;
	}
	public void setBlockId(String blockId) {
		this.blockId = blockId;
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
	public AccountParent getAccountParent() {
		return accountParent;
	}
	public void setAccountParent(AccountParent accountParent) {
		this.accountParent = accountParent;
	}
	public KidDevice getKidDevice() {
		return kidDevice;
	}
	public void setKidDevice(KidDevice kidDevice) {
		this.kidDevice= kidDevice;
	}
	
	
}
