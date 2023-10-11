package com.javaSpring.KidBlock.Domain.Entity;


import java.time.LocalDate;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Used extends BaseEntity {
	@Column
	@Id 
	@UuidGenerator
	private String usedId;

	@Column
	private LocalDate usedTimeStart;
	@Column
	private LocalDate usedTimeEnd;
	@Column
	private String usedCode;
	@Column
	private String usedName;

	@ManyToOne()
	@JoinColumn(name = "kid_device_id")
	private KidDevice kidDevice;
	

	public String getUsedId() {
		return usedId;
	}
	public void setUsedId(String usedId) {
		this.usedId = usedId;
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
	public KidDevice getKidDevice() {
		return kidDevice;
	}
	public void setKidDevice(KidDevice kidDevice) {
		this.kidDevice = kidDevice;
	}
	
}
