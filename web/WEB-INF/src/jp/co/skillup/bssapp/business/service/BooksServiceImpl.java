package jp.co.skillup.bssapp.business.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jp.co.skillup.bssapp.common.constant.ParamKey;
import jp.co.skillup.bssapp.dataaccess.dao.BooksDao;
import jp.co.skillup.bssapp.dataaccess.dto.Books;

import org.seasar.doma.jdbc.SelectOptions;

public class BooksServiceImpl implements BooksService {

	private BooksDao booksDao;

	public void setBooksDao(BooksDao booksDao) {
		this.booksDao = booksDao;
	}

	@Override
	public Map<String, Object> findBook(Integer booksId) {

		Books books = booksDao.selectByBooksId(booksId);

		return createResultMap(books);
	}

	@Override
	public List<Map<String, Object>> findBooks(String title, String authorName, String isbn, String publisher, int offset) {

		SelectOptions options = SelectOptions.get().offset(offset).limit(10);
		List<Books> books = booksDao.selectBooks(title, authorName, isbn, publisher, options);

		List<Map<String, Object>> results = new LinkedList<>();

		for (Books book : books) {
			results.add(createResultMap(book));
		}
		return results;
	}

	@Override
	public void deleteBook(Integer booksId, Integer version) {
		Books books = booksDao.selectByBooksId(booksId);
		books.setVersion(version);
		booksDao.delete(books);
	}

	@Override
	public void updateBook(Map<String, Object> book) {

		Books b = new Books();
		b.setBooksId(Integer.parseInt(book.get(ParamKey.BOOKS_ID.getKey()).toString()));
		b.setAuthorId(book.get(ParamKey.AUTHOR_ID.getKey()).toString());
		b.setAuthorName(book.get(ParamKey.AUTHOR_NAME.getKey()).toString());
		b.setPublisher(book.get(ParamKey.PUBLISHER.getKey()).toString());
		b.setVersion(Integer.parseInt(book.get(ParamKey.VERSION.getKey()).toString()));

		booksDao.update(b);

	}

	private Map<String, Object> createResultMap(Books books) {
		Map<String, Object> result = new HashMap<>();
		result.put(ParamKey.AUTHOR_ID.getKey(), books.getAuthorId());
		result.put(ParamKey.AUTHOR_NAME.getKey(), books.getAuthorName());
		result.put(ParamKey.ISBN.getKey(), books.getIsbn());
		result.put(ParamKey.PUBLISH_DATE.getKey(), books.getPublishDate());
		result.put(ParamKey.PUBLISHER.getKey(), books.getPublisher());
		result.put(ParamKey.TITLE.getKey(), books.getTitle());
		result.put(ParamKey.BOOKS_ID.getKey(), books.getBooksId());
		result.put(ParamKey.VERSION.getKey(), books.getVersion());
		return result;
	}
}
