package com.darshan;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Filter used to test SourceMap HTTP header.
 */
@WebFilter(filterName = "SourceMapFilter", urlPatterns = { "/resource/js/combined.min.js" })
public class SourceMapFilter implements Filter {

    /**
     * {@inheritDoc}
     */
    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    /**
     * <p>
     * Set SourceMap header.
     * </p>
     * {@inheritDoc}
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
//        httpServletResponse.setHeader("SourceMap", "combined.min.js.map");
        filterChain.doFilter(req, httpServletResponse);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void destroy() {
    }
}