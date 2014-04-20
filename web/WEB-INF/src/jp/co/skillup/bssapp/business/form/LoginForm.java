package jp.co.skillup.bssapp.business.form;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm {

	/**	シリアルバージョン */
	private static final long serialVersionUID = 4670760652085877539L;

	private String id;

	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
