package com.javaSpring.KidBlock.Domain.Enum;

public enum KidAction {
    preventInstall(1), // ngăn tải về 
    preventSet(0); // ngăn cài đặt

    private final int value;

    private KidAction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
