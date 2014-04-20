package jp.co.skillup.bssapp.business.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.skillup.bssapp.business.form.EditExecuteForm;
import jp.co.skillup.bssapp.business.service.BooksService;
import jp.co.skillup.bssapp.common.constant.ParamKey;
import jp.co.skillup.bssapp.common.constant.SessionKey;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 書籍編集実行のアクションクラス
 */
public class EditExecuteAction extends Action {

	/** 書籍編集実行の業務ロジック */
	private BooksService service;

	/**
	 * 書籍編集実行の業務ロジックを返却します。
	 * @param service 書籍編集実行の業務ロジック
	 */
	public void setService(BooksService service) {
		this.service = service;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		EditExecuteForm editExecuteForm = (EditExecuteForm) form;

		Map<String, Object> book = new HashMap<>();

		book.put(ParamKey.TITLE.getKey(), editExecuteForm.getTitle());
		book.put(ParamKey.BOOKS_ID.getKey(), editExecuteForm.getBooksId());
		book.put(ParamKey.AUTHOR_ID.getKey(), editExecuteForm.getAuthorId());
		book.put(ParamKey.AUTHOR_NAME.getKey(), editExecuteForm.getAuthorName());
		book.put(ParamKey.ISBN.getKey(), editExecuteForm.getIsbn());
		book.put(ParamKey.PUBLISHER.getKey(), editExecuteForm.getPublisher());
		book.put(ParamKey.PUBLISH_DATE.getKey(), editExecuteForm.getPublishDate());
		book.put(ParamKey.VERSION.getKey(), editExecuteForm.getVersion());
		service.updateBook(book);

		request.setAttribute(SessionKey.BOOK.getKey(), book);

		return mapping.findForward("success");
	}
}
