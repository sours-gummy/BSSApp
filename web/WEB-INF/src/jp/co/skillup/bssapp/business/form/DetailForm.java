package jp.co.skillup.bssapp.business.form;

import org.apache.struts.action.ActionForm;

public class DetailForm extends ActionForm {

	/**	シリアルバージョン */
	private static final long serialVersionUID = 5371011730878574323L;

	private Integer booksId;

	public Integer getBooksId() {
		return booksId;
	}

	public void setBooksId(Integer booksId) {
		this.booksId = booksId;
	}
}
