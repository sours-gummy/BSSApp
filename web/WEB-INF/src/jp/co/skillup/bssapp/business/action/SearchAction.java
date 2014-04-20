package jp.co.skillup.bssapp.business.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.skillup.bssapp.business.form.SearchForm;
import jp.co.skillup.bssapp.business.service.BooksService;
import jp.co.skillup.bssapp.common.constant.SessionKey;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 書籍検索のアクションクラス
 */
public class SearchAction extends Action {

	/** 書籍検索の業務ロジック */
	private BooksService service;

	/**
	 * 書籍検索の業務ロジックを返却します。
	 * @param service 書籍検索の業務ロジック
	 */
	public void setService(BooksService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();

		SearchForm oldSf = (SearchForm) session.getAttribute(SessionKey.SEARCH_INFO.getKey());
		SearchForm sf = (SearchForm) form;
		List<Map<String, Object>> books = null;

		// 戻る処理はセッションの中の情報を使う
		if (oldSf != null && sf.getRtn() == 1) {
			books = service.findBooks(oldSf.getTitle(), oldSf.getAuthorName(), oldSf.getIsbn(), oldSf.getPublisher(), 0);

		// 通常はフォームの情報から検索を行う
		} else {
			books = service.findBooks(sf.getTitle(), sf.getAuthorName(), sf.getIsbn(), sf.getPublisher(), 0);
			session.setAttribute(SessionKey.SEARCH_INFO.getKey(), sf);
		}

		request.setAttribute(SessionKey.BOOKS.getKey(), books);

		return mapping.findForward("success");
	}
}
