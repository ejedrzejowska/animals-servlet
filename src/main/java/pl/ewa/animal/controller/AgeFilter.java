package pl.ewa.animal.controller;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by ej on 03/02/2019.
 */
@WebFilter(filterName = "ageFilter")
public class AgeFilter implements Filter {

    private static Logger LOG = Logger.getLogger(AgeFilter.class);
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        int age = 0;
        if(req.getParameter("age") != null) {
            age = Integer.parseInt(req.getParameter("age"));
        }
        String name = req.getParameter("name");
        if (age > 10) {
            LOG.info("ANIMAL OLDER THAN 10YRS");
            LOG.info(req.getRemoteAddr() + "::Request Params::{" + name + "=" + age + "}");
        }

        // pass the request along the filter chain
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }


}
