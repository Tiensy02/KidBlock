package com.javaSpring.KidBlock.Applications.DTO;

public class ErrorResponseDTO {
    private int errorCode;
    private String devMess;
    private String userMess;
    private String moreInfo;
    private Object error;

    public int getErrorCode() {
        return errorCode;
    }

    public String getDevMess() {
        return devMess;
    }

    public String getUserMess() {
        return userMess;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public Object getError() {
        return error;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setDevMess(String devMess) {
        this.devMess = devMess;
    }

    public void setUserMess(String userMess) {
        this.userMess = userMess;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public void setError(Object error) {
        this.error = error;
    }

    // Các getter và setter cho các trường này

}
