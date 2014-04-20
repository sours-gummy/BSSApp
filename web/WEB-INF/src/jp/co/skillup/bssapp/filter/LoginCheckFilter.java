package jp.co.skillup.bssapp.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.co.skillup.bssapp.common.constant.SessionKey;
import jp.co.skillup.bssapp.common.info.UserContext;

public class LoginCheckFilter implements Filter {

	private List<String> throughPath;

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
		String path = filterconfig.getInitParameter("uncheckPath");
		throughPath = Arrays.asList(path.split(","));
	}

	@Override
	public void doFilter(ServletRequest servletrequest,
			ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) servletrequest;

		if (throughPath.contains(req.getServletPath())) {
			filterchain.doFilter(servletrequest, servletresponse);
			return ;
		}

		for (String s : throughPath) {
			if (req.getServletPath().startsWith(s)) {
				filterchain.doFilter(servletrequest, servletresponse);
				return ;
			}
		}

		HttpSession session = req.getSession(false);

		if (session == null || session.isNew()) {
			throw new ServletException("ログインしてください");
		}

		UserContext user = (UserContext) session.getAttribute(SessionKey.USER.getKey());

		if (user == null) {
			throw new ServletException("ログインしてください");
		}

		filterchain.doFilter(servletrequest, servletresponse);
	}

	@Override
	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
