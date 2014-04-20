package jp.co.skillup.bssapp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	private String charset;

	@Override
	public void init(FilterConfig config) throws ServletException {
		config.getServletContext().log("EncodingFilter START!!");
		charset = config.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		req.setCharacterEncoding(charset);
		chain.doFilter(req, resp);
	}

	@Override
	public void destroy() {
	}
}
