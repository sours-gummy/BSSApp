package jp.co.skillup.bssapp.business.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.skillup.bssapp.business.form.LoginForm;
import jp.co.skillup.bssapp.business.service.LoginService;
import jp.co.skillup.bssapp.common.constant.SessionKey;
import jp.co.skillup.bssapp.common.info.UserContext;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * ログインのアクションクラス
 */
public class LoginAction extends Action {

	/** ログインの業務ロジック */
	private LoginService service;

	/**
	 * ログインの業務ロジックを返却します。
	 * @param service ログインの業務ロジック
	 */
	public void setService(LoginService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		LoginForm lf = (LoginForm) form;


		UserContext user = service.checkUser(lf.getId(), lf.getPassword());

		if (user == null) {
			return mapping.findForward("failure");
		}

		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.USER.getKey(), user);

		return mapping.findForward("success");
	}
}
