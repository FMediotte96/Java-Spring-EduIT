
package com.educacionit.spring.beginning.class03.configuration;



import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Service;

import com.educacionit.spring.beginning.class03.ILogger;
import com.educacionit.spring.beginning.class03.LoggerSlf4Support;





@Service
public class CORSFilter implements Filter {
	
	
	private final ILogger  logger = new LoggerSlf4Support (CORSFilter.class);
	
	
	
	public CORSFilter () {
		
		// Call to super class.
		super ();
	}

	
	
	@Override
	public void doFilter (ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		
		logger.debug (() -> "RU :: Filtering On ...........................................................");
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept");
		filterChain.doFilter (servletRequest, servletResponse);		
	}

	
	@Override
	public void destroy () {}

	@Override
	public void init (FilterConfig arg0) throws ServletException {}
	
	
}