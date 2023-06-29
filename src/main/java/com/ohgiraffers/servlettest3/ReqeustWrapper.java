package com.ohgiraffers.servlettest3;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class ReqeustWrapper extends HttpServletRequestWrapper {
    public ReqeustWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {

        String value = "";
        if("password".equals(name)){
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            value = passwordEncoder.encode(super.getParameter(name));
        }else {
            value = super.getParameter(name);
        }
        return value;
    }
}
