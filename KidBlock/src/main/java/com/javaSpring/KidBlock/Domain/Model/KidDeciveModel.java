package com.javaSpring.KidBlock.Domain.Model;


import com.javaSpring.KidBlock.Domain.Enum.KidAction;
import com.javaSpring.KidBlock.Domain.Enum.KidMode;


public class KidDeciveModel {
    private String kidDeviceId;
    private String kidDeviceName;
    private int kidDeviceKidAge;
    private String kidDeviceKidAvatar;
	private KidAction kidDeviceAction;
    private KidMode kidDeviceParentMode;
    
    public KidDeciveModel(String kidDeviceId, String kidDeviceName, int kidDeviceKidAge, String kidDeviceKidAvatar,
            KidAction kidDeviceAction, KidMode kidDeviceParentMode) {
        this.kidDeviceId = kidDeviceId;
        this.kidDeviceName = kidDeviceName;
        this.kidDeviceKidAge = kidDeviceKidAge;
        this.kidDeviceKidAvatar = kidDeviceKidAvatar;
        this.kidDeviceAction = kidDeviceAction;
        this.kidDeviceParentMode = kidDeviceParentMode;
    }
    public KidDeciveModel(){
        
    }
    public String getKidDeviceID() {
        return kidDeviceId;
    }

    public void setKidDeviceID(String kidDeviceId) {
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