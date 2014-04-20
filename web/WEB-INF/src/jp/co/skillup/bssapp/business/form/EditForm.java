package jp.co.skillup.bssapp.business.form;

import org.apache.struts.action.ActionForm;

public class EditForm extends ActionForm {

	/**	シリアルバージョン */
	private static final long serialVersionUID = 2025747220696760365L;

	private Integer booksId;

	public Integer getBooksId() {
		return booksId;
	}

	public void setBooksId(Integer booksId) {
		this.booksId = booksId;
	}
}
