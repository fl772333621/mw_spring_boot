package com.mfanw.test.mw_spring_boot.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityInterceptor implements AsyncHandlerInterceptor {

    private static final Logger LOGGER = Logger.getLogger(SecurityInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        LOGGER.warn("requestURI=" + request.getRequestURI());
        return true;
    }
}
