package jp.co.skillup.bssapp.business.service;

import jp.co.skillup.bssapp.common.info.UserContext;

/**
 * ログインを実施する業務ロッククラス
 */
public interface LoginService {
	/**
	 * ログインユーザを検索します。
	 * @param userId ユーザID
	 * @param password パスワード
	 * @return ユーザ情報
	 */
	public UserContext checkUser(String userId, String password);
}
