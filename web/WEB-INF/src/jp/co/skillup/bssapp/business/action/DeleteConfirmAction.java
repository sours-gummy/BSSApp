package jp.co.skillup.bssapp.business.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.skillup.bssapp.business.form.DeleteConfirmForm;
import jp.co.skillup.bssapp.business.service.BooksService;
import jp.co.skillup.bssapp.common.constant.SessionKey;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 削除確認のアクションクラス
 */
public class DeleteConfirmAction extends Action {

	/** 削除の業務ロジック */
	private BooksService service;

	/**
	 * 削除の業務ロジックを設定します
	 * @param service 業務ロジック
	 */
	public void setService(BooksService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		DeleteConfirmForm deleteConfirmForm = (DeleteConfirmForm) form;

		Map<String, Object> result = service.findBook(deleteConfirmForm.getBooksId());

		request.setAttribute(SessionKey.BOOK.getKey(), result);

		return mapping.findForward("success");
	}
}
