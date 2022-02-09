package com.chebyshev.post.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @author zwk
 * @date 2022/2/6
 * token拦截器配置
 **/
@Configuration
public class SecurityConfig extends WebMvcConfigurationSupport {

    private final SecurityInterceptor interceptor;

    public SecurityConfig(SecurityInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.interceptor);
        super.addInterceptors(registry);
    }

    @Bean
    public HandlerExceptionResolver getHandlerExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();
        properties.setProperty("TokenParseFailedException","error_401");
        resolver.setExceptionMappings(properties);
        return resolver;
    }
}
