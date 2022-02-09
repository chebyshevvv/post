package com.chebyshev.post.controller;

import com.chebyshev.post.security.TokenParseFailedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author zwk
 * @date 2022/2/7
 * @description TODO
 **/
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public String handle(TokenParseFailedException e){
        return "error_401";
    }
}
