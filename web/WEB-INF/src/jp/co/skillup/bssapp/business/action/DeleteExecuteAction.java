package jp.co.skillup.bssapp.business.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.skillup.bssapp.business.form.DeleteExecuteForm;
import jp.co.skillup.bssapp.business.service.BooksService;
import jp.co.skillup.bssapp.common.constant.ParamKey;
import jp.co.skillup.bssapp.common.constant.SessionKey;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 削除実行のアクションクラス
 */
public class DeleteExecuteAction extends Action {

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

		DeleteExecuteForm deleteExecuteForm = (DeleteExecuteForm) form;

		Map<String, Object> book = new HashMap<>();

		book.put(ParamKey.TITLE.getKey(), deleteExecuteForm.getTitle());
		book.put(ParamKey.BOOKS_ID.getKey(), deleteExecuteForm.getBooksId());
		book.put(ParamKey.AUTHOR_ID.getKey(), deleteExecuteForm.getAuthorId());
		book.put(ParamKey.AUTHOR_NAME.getKey(), deleteExecuteForm.getAuthorName());
		book.put(ParamKey.ISBN.getKey(), deleteExecuteForm.getIsbn());
		book.put(ParamKey.PUBLISHER.getKey(), deleteExecuteForm.getPublisher());
		book.put(ParamKey.PUBLISH_DATE.getKey(), deleteExecuteForm.getPublishDate());
		book.put(ParamKey.VERSION.getKey(), deleteExecuteForm.getVersion());

		service.deleteBook(deleteExecuteForm.getBooksId(), deleteExecuteForm.getVersion());

		request.setAttribute(SessionKey.BOOK.getKey(), book);

		return mapping.findForward("success");
	}
}
