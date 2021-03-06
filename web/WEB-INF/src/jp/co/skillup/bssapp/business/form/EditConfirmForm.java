package jp.co.skillup.bssapp.business.form;

import org.apache.struts.action.ActionForm;

public class EditConfirmForm extends ActionForm {
	/**	シリアルバージョン */
	private static final long serialVersionUID = -1443447527960765954L;

	/** 識別番号 */
	private Integer booksId;

	/** タイトル */
	private String title;

	/** 著者名 */
	private String authorName;

	/** 著者ID */
	private String authorId;

	/** ISBN */
	private String isbn;

	/** 出版社 */
	private String publisher;

	/** 出版日 */
	private String publishDate;

	/** 楽観排他番号 */
	private Integer version;

	/**
	 * 識別番号を返却します。
	 * @return 識別番号
	 */
	public Integer getBooksId() {
		return booksId;
	}

	/**
	 * 識別番号を設定します。
	 * @param booksId 識別番号
	 */
	public void setBooksId(Integer booksId) {
		this.booksId = booksId;
	}

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
	 * 著者IDを返却します。
	 * @return 著者ID
	 */
	public String getAuthorId() {
		return authorId;
	}

	/**
	 * 著者IDを設定します。
	 * @param authorId 著者ID
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
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

	/**
	 * 出版日を返却します。
	 * @return 出版日
	 */
	public String getPublishDate() {
		return publishDate;
	}

	/**
	 * 出版日を設定します。
	 * @param publishDate 出版日
	 */
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * 楽観排他番号を返却します。
	 * @return 楽観はいた番号
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * 楽観排他番号を設定します。
	 * @param version 楽観排他番号
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
}
