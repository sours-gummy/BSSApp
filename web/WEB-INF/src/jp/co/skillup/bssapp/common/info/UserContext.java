package jp.co.skillup.bssapp.common.info;

/**
 * ユーザ情報を保持したクラス
 */
public class UserContext {
	/** ユーザID */
	private String userId;
	/** 権限 */
	private String permissionId;

	/**
	 * ユーザIDを返却します。
	 * @return ユーザID
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * ユーザIDを設定します。
	 * @param userId ユーザID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 権限を返却します。
	 * @return 権限
	 */
	public String getPermissionId() {
		return permissionId;
	}
	/**
	 * 権限を設定します。
	 * @param permissionId 権限
	 */
	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}
}
