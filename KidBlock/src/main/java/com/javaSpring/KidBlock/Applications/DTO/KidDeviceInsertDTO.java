package com.javaSpring.KidBlock.Applications.DTO;

import com.javaSpring.KidBlock.Domain.Enum.KidAction;
import com.javaSpring.KidBlock.Domain.Enum.KidMode;


public class KidDeviceInsertDTO {
    private String kidDeviceName;
	
	private int kidDeviceKidAge;
	
	private String kidDeviceKidAvatar;
	
	private KidMode kidDeviceParentMode;
	
	private KidAction kidDeviceAction;
	
	private int kidDeviceCode;

    private String parentId;

    public String getKidDeviceName() {
        return kidDeviceName;
    }

    public int getKidDeviceKidAge() {
        return kidDeviceKidAge;
    }

    public String getKidDeviceKidAvatar() {
        return kidDeviceKidAvatar;
    }

    public KidMode getKidDeviceParentMode() {
        return kidDeviceParentMode;
    }

    public KidAction getKidDeviceAction() {
        return kidDeviceAction;
    }

    public int getKidDeviceCode() {
        return kidDeviceCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setKidDeviceName(String kidDeviceName) {
        this.kidDeviceName = kidDeviceName;
    }

    public void setKidDeviceKidAge(int kidDeviceKidAge) {
        this.kidDeviceKidAge = kidDeviceKidAge;
    }

    public void setKidDeviceKidAvatar(String kidDeviceKidAvatar) {
        this.kidDeviceKidAvatar = kidDeviceKidAvatar;
    }

    public void setKidDeviceParentMode(KidMode kidDeviceParentMode) {
        this.kidDeviceParentMode = kidDeviceParentMode;
    }

    public void setKidDeviceAction(KidAction kidDeviceAction) {
        this.kidDeviceAction = kidDeviceAction;
    }

    public void setKidDeviceCode(int kidDeviceCode) {
        this.kidDeviceCode = kidDeviceCode;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    
}
