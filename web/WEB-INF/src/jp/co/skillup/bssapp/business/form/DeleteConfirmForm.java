package jp.co.skillup.bssapp.business.form;

import org.apache.struts.action.ActionForm;

public class DeleteConfirmForm extends ActionForm {

	/**	シリアルバージョン */
	private static final long serialVersionUID = -1564449733354858087L;

	private Integer booksId;

	public Integer getBooksId() {
		return booksId;
	}

	public void setBooksId(Integer booksId) {
		this.booksId = booksId;
	}
}
