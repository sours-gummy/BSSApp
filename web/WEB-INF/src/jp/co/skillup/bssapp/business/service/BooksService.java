package jp.co.skillup.bssapp.business.service;

import java.util.List;
import java.util.Map;

/**
 * 書籍情報操作の業務ロジッククラス
 */
public interface BooksService {
	/**
	 * 書籍を1件検索します。
	 * @param booksId 書籍ID
	 * @return 書籍情報
	 */
	public Map<String, Object> findBook(Integer booksId);

	/**
	 * 指定された条件から書籍情報を検索します。
	 * @param title タイトル
	 * @param authorName 著者名
	 * @param isbn ISBN
	 * @param publisher 出版社
	 * @param offset 表示ページ
	 * @return 書籍情報
	 */
	public List<Map<String, Object>> findBooks(String title, String authorName, String isbn, String publisher, int offset);

	/**
	 * 書籍情報を削除します。
	 * @param booksId 書籍ID
	 * @param version 楽観ロック情報
	 */
	public void deleteBook(Integer booksId, Integer version);

	/**
	 * 書籍情報を更新します。
	 * @param book 書籍ID
	 */
	public void updateBook(Map<String, Object> book);
}
