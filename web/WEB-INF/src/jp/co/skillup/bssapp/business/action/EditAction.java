package jp.co.skillup.bssapp.business.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.skillup.bssapp.business.form.EditForm;
import jp.co.skillup.bssapp.business.service.BooksService;
import jp.co.skillup.bssapp.common.constant.SessionKey;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 書籍編集のアクションクラス
 */
public class EditAction extends Action {

	/** 書籍編集の業務ロジック */
	private BooksService service;

	/**
	 * 書籍編集の業務ロジックを返却します。
	 * @param service 書籍編集の業務ロジック
	 */
	public void setService(BooksService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		EditForm localForm = (EditForm) form;

		Map<String, Object> book = service.findBook(localForm.getBooksId());

		request.setAttribute(SessionKey.BOOK.getKey(), book);

		return mapping.findForward("success");
	}
}
