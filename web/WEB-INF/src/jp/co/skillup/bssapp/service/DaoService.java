package jp.co.skillup.bssapp.service;

import jp.co.skillup.bssapp.dataaccess.dao.BooksDao;

public class DaoService {
	private BooksDao dao;

	public BooksDao getDao() {
		return dao;
	}

	public void setDao(BooksDao dao) {
		this.dao = dao;
	}
}
