package jp.co.skillup.bssapp.business.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.skillup.bssapp.business.form.EditConfirmForm;
import jp.co.skillup.bssapp.common.constant.ParamKey;
import jp.co.skillup.bssapp.common.constant.SessionKey;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 書籍編集確認のアクションクラス
 */
public class EditConfirmAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		EditConfirmForm localForm = (EditConfirmForm) form;

		Map<String, Object> book = new HashMap<>();
		book.put(ParamKey.BOOKS_ID.getKey(), localForm.getBooksId());
		book.put(ParamKey.TITLE.getKey(), localForm.getTitle());
		book.put(ParamKey.AUTHOR_NAME.getKey(), localForm.getAuthorName());
		book.put(ParamKey.AUTHOR_ID.getKey(), localForm.getAuthorId());
		book.put(ParamKey.ISBN.getKey(), localForm.getIsbn());
		book.put(ParamKey.PUBLISHER.getKey(), localForm.getPublisher());
		book.put(ParamKey.PUBLISH_DATE.getKey(), localForm.getPublishDate());
		book.put(ParamKey.VERSION.getKey(), localForm.getVersion());

		request.setAttribute(SessionKey.BOOK.getKey(), book);

		return mapping.findForward("success");
	}
}
