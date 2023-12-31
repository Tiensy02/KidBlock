package com.javaSpring.KidBlock.Applications.DTO;

import java.time.LocalDate;


public class UsedInsertDTO {
    
	private String kidDeviceID;
	
	private LocalDate usedTimeStart;
	
    private String usedCode;
	
	private String usedName;

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
