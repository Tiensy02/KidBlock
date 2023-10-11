package com.javaSpring.KidBlock.Domain.Model;

import java.time.LocalDate;


public class UsedModel {
    private String usedId;

	private LocalDate usedTimeStart;
	private LocalDate usedTimeEnd;
	
	private String usedCode;
	
	private String usedName;

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
    

}
