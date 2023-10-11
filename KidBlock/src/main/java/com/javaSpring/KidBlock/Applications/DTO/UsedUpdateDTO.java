package com.javaSpring.KidBlock.Applications.DTO;

import java.time.LocalDate;

public class UsedUpdateDTO {
    private String usedId;
    private LocalDate usedTimeEnd;
    public String getUsedId() {
        return usedId;
    }
    public void setUsedId(String usedId) {
        this.usedId = usedId;
    }
    public LocalDate getUsedTimeEnd() {
        return usedTimeEnd;
    }
    public void setUsedTimeEnd(LocalDate usedTimeEnd) {
        this.usedTimeEnd = usedTimeEnd;
    }
    
}
