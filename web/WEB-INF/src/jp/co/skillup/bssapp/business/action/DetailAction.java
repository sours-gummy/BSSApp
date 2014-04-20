package jp.co.skillup.bssapp.business.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.skillup.bssapp.business.form.DetailForm;
import jp.co.skillup.bssapp.business.service.BooksService;
import jp.co.skillup.bssapp.common.constant.SessionKey;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 書籍詳細のアクションクラス
 */
public class DetailAction extends Action {

	/** 書籍詳細の業務ロジック */
	private BooksService service;

	/**
	 * 書籍詳細の業務ロジックを返却します。
	 * @param service 書籍詳細のロジック
	 */
	public void setService(BooksService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		DetailForm detailForm = (DetailForm) form;

		Map<String, Object> book = service.findBook(detailForm.getBooksId());

		request.setAttribute(SessionKey.BOOK.getKey(), book);

		return mapping.findForward("success");
	}
}
