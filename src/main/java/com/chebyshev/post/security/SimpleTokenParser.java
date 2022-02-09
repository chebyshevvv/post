package com.chebyshev.post.security;

import org.springframework.stereotype.Component;

/**
 * @author zwk
 * @date 2022/2/7
 * @description TODO
 **/
@Component
public class SimpleTokenParser implements TokenParser{
    @Override
    public CurrentUser parse(String token) {
        if (token == null)
        throw new TokenParseFailedException();
        return null;
    }
}
