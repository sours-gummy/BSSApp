package jp.co.skillup.bssapp.business.form;

import org.apache.struts.action.ActionForm;

public class SearchForm extends ActionForm {

	/**	シリアルバージョン */
	private static final long serialVersionUID = -7473366654088683654L;

	/** タイトル */
	private String title;

	/** 著者名 */
	private String authorName;

	/** ISBN */
	private String isbn;

	/** 出版社 */
	private String publisher;

	/** 戻るボタン用 */
	private Integer rtn;

	/**
	 * タイトルを返却します。
	 * @return タイトル
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * タイトルを設定します。
	 * @param title タイトル
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 著者名を返却します。
	 * @return 著者名
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * 著者名を設定します。
	 * @param auhtorName 著者名
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * ISBNを返却します。
	 * @return ISBN
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * ISBNを設定します。
	 * @param isbn ISBN
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * 出版社を返却します。
	 * @return 出版社
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * 出版社を設定します。
	 * @param publisher 出版社
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getRtn() {
		return rtn;
	}

	public void setRtn(Integer rtn) {
		this.rtn = rtn;
	}
}
