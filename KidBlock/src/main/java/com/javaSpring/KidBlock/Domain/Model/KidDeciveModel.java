package com.javaSpring.KidBlock.Domain.Model;

import com.javaSpring.KidBlock.Domain.Enum.KidAction;
import com.javaSpring.KidBlock.Domain.Enum.KidMode;

public class KidDeciveModel {
    private String kidDeviceID;
    private String kidDeviceName;
    private int kidDeviceKidAge;
    private String kidDeviceKidAvatar;
	private KidAction kidDeviceAction;
    private KidMode kidDeviceParentMode;

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

    public KidAction getKidDeviceAction() {
        return kidDeviceAction;
    }

    public void setKidDeviceAction(KidAction kidDeviceAction) {
        this.kidDeviceAction = kidDeviceAction;
    }

    public KidMode getKidDeviceParentMode() {
        return kidDeviceParentMode;
    }

    public void setKidDeviceParentMode(KidMode kidDeviceParentMode) {
        this.kidDeviceParentMode = kidDeviceParentMode;
    }
}