package jp.co.skillup.bssapp.common.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * システムの初期処理を行うクラス
 */
public class Initializer extends HttpServlet {
	/** シリアルバージョン */
	private static final long serialVersionUID = 3603313463458119108L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		config.getServletContext().log("初期化を開始");
		config.getServletContext().log("書籍検索システムを開始します。");
	}
}
