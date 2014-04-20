package jp.co.skillup.bssapp.business.form;

import org.apache.struts.action.ActionForm;

public class ControllDispatchForm extends ActionForm {

	/**	シリアルバージョン */
	private static final long serialVersionUID = 8335895182255430336L;

	private String method;

	private Integer booksId;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Integer getBooksId() {
		return booksId;
	}

	public void setBooksId(Integer booksId) {
		this.booksId = booksId;
	}
}
