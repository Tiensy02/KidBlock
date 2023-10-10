package com.javaSpring.KidBlock.Domain.Enum;

public enum KidMode {
    block(1),
    child(2),
    defaultValue(3);
    private final int value;
    private KidMode(int value){
       this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
