package com.javaSpring.KidBlock.Domain.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
@MappedSuperclass
public class BaseEntity {
	@Column
	private LocalDate createDate;
	@Column
	private LocalDate modifyDate;
	@Column
	private String createBy;
	@Column
	private String modifyBy;
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(LocalDate modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	
	 @PrePersist
    public void onCreate() {
        createDate = LocalDate.now(); 
		modifyDate = LocalDate.now();
    }
    

}
