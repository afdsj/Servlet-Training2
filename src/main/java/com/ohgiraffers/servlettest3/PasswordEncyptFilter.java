package com.ohgiraffers.servlettest3;

import com.ohgiraffers.servlettest3.ReqeustWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/member/*")
public class PasswordEncyptFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hreqeust = (HttpServletRequest) request;
        ReqeustWrapper wrapper = new ReqeustWrapper(hreqeust);

        chain.doFilter(wrapper, response);
    }

    @Override
    public void destroy() {}

}
