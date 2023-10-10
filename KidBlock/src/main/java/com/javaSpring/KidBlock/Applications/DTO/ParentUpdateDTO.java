package com.javaSpring.KidBlock.Applications.DTO;

public class ParentUpdateDTO {

    private String parentEmail;
    private String parentPassword;
    private String newParentPassword;
    private String newParentName;
    private String newParentAvatar;
    private int parentPIN;

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getParentPassword() {
        return parentPassword;
    }

    public void setParentPassword(String parentPassword) {
        this.parentPassword = parentPassword;
    }

    public String getNewParentPassword() {
        return newParentPassword;
    }

    public void setNewParentPassword(String newParentPassword) {
        this.newParentPassword = newParentPassword;
    }

    public String getNewParentName() {
        return newParentName;
    }

    public void setNewParentName(String newParentName) {
        this.newParentName = newParentName;
    }

    public String getNewParentAvatar() {
        return newParentAvatar;
    }

    public void setNewParentAvatar(String newParentAvatar) {
        this.newParentAvatar = newParentAvatar;
    }

    public int getParentPIN() {
        return parentPIN;
    }

    public void setParentPIN(int parentPIN) {
        this.parentPIN = parentPIN;
    }
}


