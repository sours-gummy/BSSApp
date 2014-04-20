package jp.co.skillup.bssapp.business.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.skillup.bssapp.business.form.ControllDispatchForm;
import jp.co.skillup.bssapp.business.form.DeleteConfirmForm;
import jp.co.skillup.bssapp.business.form.DetailForm;
import jp.co.skillup.bssapp.business.form.EditForm;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

/**
 * 編集、削除、詳細画面への遷移を操作するクラスです。
 */
public class ControllDispatchAction extends LookupDispatchAction {

	@Override
	protected Map<String, String> getKeyMethodMap() {
		Map<String, String> map = new HashMap<>();

		// 編集画面
		map.put("label.edit", "edit");
		// 削除画面
		map.put("label.delete", "delete");
		// 詳細画面
		map.put("label.detail", "detail");

		return map;
	}

	/**
	 * 詳細画面への遷移を行います。
	 */
	public ActionForward detail(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ControllDispatchForm localForm = (ControllDispatchForm) form;
		DetailForm detailForm = new DetailForm();

		detailForm.setBooksId(localForm.getBooksId());

		request.setAttribute("DetailForm", detailForm);

		return mapping.findForward("detail");
	}

	/**
	 * 編集画面への遷移を行います。
	 */
	public ActionForward edit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ControllDispatchForm localForm = (ControllDispatchForm) form;

		EditForm editForm = new EditForm();
		editForm.setBooksId(localForm.getBooksId());

		request.setAttribute("EditForm", editForm);

		return mapping.findForward("edit");
	}

	/**
	 * 削除画面への遷移を行います。
	 */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ControllDispatchForm localForm = (ControllDispatchForm) form;
		DeleteConfirmForm deleteConfirmForm = new DeleteConfirmForm();
		deleteConfirmForm.setBooksId(localForm.getBooksId());

		request.setAttribute("DeleteConfirmForm", deleteConfirmForm);

		return mapping.findForward("delete");
	}
}
