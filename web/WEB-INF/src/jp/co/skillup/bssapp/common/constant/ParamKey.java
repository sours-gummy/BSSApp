package jp.co.skillup.bssapp.common.constant;

/**
 * リクエストパラメータに設定するキーを定義
 */
public enum ParamKey {
	/** 著者ID */
	AUTHOR_ID("authorId"),
	/** 著者名 */
	AUTHOR_NAME("authorName"),
	/** ISBN */
	ISBN("isbn"),
	/** 出版日 */
	PUBLISH_DATE("publishDate"),
	/** 出版社 */
	PUBLISHER("publisher"),
	/** タイトル */
	TITLE("title"),
	/** 書籍ID */
	BOOKS_ID("booksId"),
	/** 楽観排他情報 */
	VERSION("version");

	private String key;

	private ParamKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
