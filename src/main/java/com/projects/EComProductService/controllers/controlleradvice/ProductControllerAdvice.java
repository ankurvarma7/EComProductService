package com.projects.EComProductService.controllers.controlleradvice;

import com.projects.EComProductService.dtos.ErrorResponseDto;
import com.projects.EComProductService.exceptions.ProductNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductControllerAdvice {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> productNotFoundExceptionHandler(ProductNotFoundException pnfe){
        ErrorResponseDto errorResponseDto=new ErrorResponseDto();
        errorResponseDto.setCode(404);
        errorResponseDto.setMessage(pnfe.getMessage());
        return ResponseEntity.ok(errorResponseDto);
    }
}
