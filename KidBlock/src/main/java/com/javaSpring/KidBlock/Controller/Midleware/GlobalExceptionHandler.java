package com.javaSpring.KidBlock.Controller.Midleware;

import com.javaSpring.KidBlock.Applications.DTO.ErrorResponseDTO;
import com.javaSpring.KidBlock.Domain.Exception.BaseException;
import com.javaSpring.KidBlock.Domain.Exception.ConflictException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<Object> handleBaseException(BaseException ex, WebRequest request) {
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR; // Mã trạng thái mặc định là 500
        if (ex.getErrorCode() >= 400 && ex.getErrorCode() < 500) {
            httpStatus = HttpStatus.valueOf(ex.getErrorCode()); 
        }
        return new ResponseEntity<>(ex, httpStatus);
    }
    @ExceptionHandler(ConflictException.class)
public ResponseEntity<ErrorResponseDTO> handleConflictException(ConflictException ex, WebRequest request) {
    HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR; // Mã trạng thái mặc định là 500
    if (ex.getErrorCode() >= 400 && ex.getErrorCode() < 500) {
        httpStatus = HttpStatus.valueOf(ex.getErrorCode()); 
    }

    ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
    errorResponseDTO.setErrorCode(ex.getErrorCode());
    errorResponseDTO.setUserMess(ex.getUserMess());
    errorResponseDTO.setDevMess(ex.getDevMess());
    errorResponseDTO.setError(ex.getError());
    errorResponseDTO.setMoreInfo(ex.getMoreInfo());

    return new ResponseEntity<>(errorResponseDTO, httpStatus);
}
}


