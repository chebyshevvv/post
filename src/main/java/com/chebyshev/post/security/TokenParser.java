package com.chebyshev.post.security;

/**
 * @author zwk
 * @date 2022/2/6
 * @description TODO
 **/
public interface TokenParser {
    CurrentUser parse(String token);
}
