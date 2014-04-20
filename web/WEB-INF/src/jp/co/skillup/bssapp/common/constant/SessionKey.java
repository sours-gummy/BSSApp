package jp.co.skillup.bssapp.common.constant;

/**
 * セッションに保持する情報のキーを定義
 */
public enum SessionKey {
	/** ユーザ情報 */
	USER("user"),
	/** 検索情報 */
	SEARCH_INFO("search_info"),
	/** 書籍情報 */
	BOOK("book"),
	/** 書籍情報集合 */
	BOOKS("books");

	private String key;

	private SessionKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
