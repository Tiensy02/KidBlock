package com.javaSpring.KidBlock.Applications.DTO;

import java.time.LocalDate;
import java.util.UUID;


public class UsedInsertDTO {
    
	private UUID KidDeviceID;
	
	private LocalDate UsedTimeStart;
	
    private String UsedCode;
	
	private String UsedName;

    public void setKidDeviceID(UUID kidDeviceID) {
        KidDeviceID = kidDeviceID;
    }

    public void setUsedTimeStart(LocalDate usedTimeStart) {
        UsedTimeStart = usedTimeStart;
    }

    public void setUsedCode(String usedCode) {
        UsedCode = usedCode;
    }

    public void setUsedName(String usedName) {
        UsedName = usedName;
    }

    public UUID getKidDeviceID() {
        return KidDeviceID;
    }

    public LocalDate getUsedTimeStart() {
        return UsedTimeStart;
    }

    public String getUsedCode() {
        return UsedCode;
    }

    public String getUsedName() {
        return UsedName;
    }
    
}
