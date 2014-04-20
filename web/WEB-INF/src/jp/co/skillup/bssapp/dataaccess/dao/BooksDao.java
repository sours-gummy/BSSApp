package jp.co.skillup.bssapp.dataaccess.dao;

import java.util.List;

import jp.co.skillup.bssapp.dataaccess.dto.Books;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.jdbc.SelectOptions;

@Dao
public interface BooksDao {

	@Select
	Books selectByBooksId(Integer booksId);

	@Select
	List<Books> selectByTitle(String title, SelectOptions options);

	@Select
	List<Books> selectByAthorName(String authorName, SelectOptions options);

	@Select
	List<Books> selectByISBN(String isbn, SelectOptions options);

	@Select
	List<Books> selectByPublisher(String publisher, SelectOptions options);

	@Select
	List<Books> selectBooks(String title, String authorName, String isbn, String publisher, SelectOptions options);

	@Update(sqlFile = true)
	int update(Books books);

	@Delete(sqlFile = true)
	int delete(Books books);
}
