package com.javaSpring.KidBlock.Applications.DTO;

import com.javaSpring.KidBlock.Domain.Enum.KidAction;
import com.javaSpring.KidBlock.Domain.Enum.KidMode;


public class KidDeviceUpdateDTO {
    private String kidDeviceId; 

	private String kidDeviceName;

	private int kidDeviceKidAge;

	private String kidDeviceKidAvatar;

	private KidMode kidDeviceParentMode;

	private KidAction kidDeviceAction;

	private int kidDeviceCode;

    public String getKidDeviceId() {
        return kidDeviceId;
    }

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

    public void setKidDeviceId(String kidDeviceId) {
        this.kidDeviceId = kidDeviceId;
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

    public void setParentID(String parentID) {
    }
    
}
