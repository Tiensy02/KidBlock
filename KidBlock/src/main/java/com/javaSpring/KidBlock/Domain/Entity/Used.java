package com.javaSpring.KidBlock.Domain.Entity;


import java.time.LocalDate;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Used extends BaseEntity {
	@Column
	@Id 
	@UuidGenerator
	private String usedID;
	@Column
	private String kidDeviceID;
	@Column
	private LocalDate usedTimeStart;
	@Column
	private LocalDate usedTimeEnd;
	@Column
	private String usedCode;
	@Column
	private String usedName;
	public String getUsedID() {
		return usedID;
	}
	public void setUsedID(String usedID) {
		this.usedID = usedID;
	}
	public String getKidDeviceID() {
		return kidDeviceID;
	}
	public void setKidDeviceID(String kidDeviceID) {
		this.kidDeviceID = kidDeviceID;
	}
	public LocalDate getUsedTimeStart() {
		return usedTimeStart;
	}
	public void setUsedTimeStart(LocalDate usedTimeStart) {
		this.usedTimeStart = usedTimeStart;
	}
	public LocalDate getUsedTimeEnd() {
		return usedTimeEnd;
	}
	public void setUsedTimeEnd(LocalDate usedTimeEnd) {
		this.usedTimeEnd = usedTimeEnd;
	}
	public String getUsedCode() {
		return usedCode;
	}
	public void setUsedCode(String usedCode) {
		this.usedCode = usedCode;
	}
	public String getUsedName() {
		return usedName;
	}
	public void setUsedName(String usedName) {
		this.usedName = usedName;
	}
	
}
