package com.chebyshev.post.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zwk
 * @date 2022/2/6
 * @description TODO
 **/
@Component
public class SecurityInterceptor implements HandlerInterceptor {

    @Value("security.token.name")
    private String tokenName;

    private final TokenParser tokenParser;

    public SecurityInterceptor(TokenParser tokenParser) {
        this.tokenParser = tokenParser;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(this.tokenName);
        CurrentUser currentUser = this.tokenParser.parse(token);
        return true;
    }
}
