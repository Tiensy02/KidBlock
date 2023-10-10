package com.javaSpring.KidBlock.Applications.DTO;


public class ParentInsertDTO {

    
	private String ParentPassword;
	
	private int ParentPassPIN;
	
	private String ParentEmail;
	
	private String ParentName;
	
	private String ParentAvatar;

    public String getParentPassword() {
        return ParentPassword;
    }

    public int getParentPassPIN() {
        return ParentPassPIN;
    }

    public String getParentEmail() {
        return ParentEmail;
    }

    public String getParentName() {
        return ParentName;
    }

    public String getParentAvatar() {
        return ParentAvatar;
    }

    public void setParentPassword(String parentPassword) {
        ParentPassword = parentPassword;
    }

    public void setParentPassPIN(int parentPassPIN) {
        ParentPassPIN = parentPassPIN;
    }

    public void setParentEmail(String parentEmail) {
        ParentEmail = parentEmail;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public void setParentAvatar(String parentAvatar) {
        ParentAvatar = parentAvatar;
    }

   
    
}
