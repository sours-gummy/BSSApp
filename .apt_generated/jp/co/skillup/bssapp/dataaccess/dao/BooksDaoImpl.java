package jp.co.skillup.bssapp.dataaccess.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-04-19T02:46:53.974+0900")
public class BooksDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.skillup.bssapp.dataaccess.dao.BooksDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(jp.co.skillup.bssapp.dataaccess.dao.BooksDao.class, "delete", jp.co.skillup.bssapp.dataaccess.dto.Books.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(jp.co.skillup.bssapp.dataaccess.dao.BooksDao.class, "update", jp.co.skillup.bssapp.dataaccess.dto.Books.class);

    /**
     * @param config the config
     */
    public BooksDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int delete(jp.co.skillup.bssapp.dataaccess.dto.Books books) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "delete", books);
        try {
            if (books == null) {
                throw new org.seasar.doma.DomaNullPointerException("books");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery();
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/delete.sql");
            __query.addParameter("books", jp.co.skillup.bssapp.dataaccess.dto.Books.class, books);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("books", books, jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal());
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> selectBooks(java.lang.String title, java.lang.String authorName, java.lang.String isbn, java.lang.String publisher, org.seasar.doma.jdbc.SelectOptions options) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectBooks", title, authorName, isbn, publisher, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/selectBooks.sql");
            __query.setOptions(options);
            __query.addParameter("title", java.lang.String.class, title);
            __query.addParameter("authorName", java.lang.String.class, authorName);
            __query.addParameter("isbn", java.lang.String.class, isbn);
            __query.addParameter("publisher", java.lang.String.class, publisher);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("selectBooks");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.skillup.bssapp.dataaccess.dto.Books>(jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal()));
            java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectBooks", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectBooks", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> selectByAthorName(java.lang.String authorName, org.seasar.doma.jdbc.SelectOptions options) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByAthorName", authorName, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/selectByAthorName.sql");
            __query.setOptions(options);
            __query.addParameter("authorName", java.lang.String.class, authorName);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("selectByAthorName");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.skillup.bssapp.dataaccess.dto.Books>(jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal()));
            java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByAthorName", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByAthorName", __e);
            throw __e;
        }
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.Books selectByBooksId(java.lang.Integer booksId) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByBooksId", booksId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/selectByBooksId.sql");
            __query.addParameter("booksId", java.lang.Integer.class, booksId);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("selectByBooksId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<jp.co.skillup.bssapp.dataaccess.dto.Books> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<jp.co.skillup.bssapp.dataaccess.dto.Books>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.skillup.bssapp.dataaccess.dto.Books>(jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal()));
            jp.co.skillup.bssapp.dataaccess.dto.Books __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByBooksId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByBooksId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> selectByISBN(java.lang.String isbn, org.seasar.doma.jdbc.SelectOptions options) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByISBN", isbn, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/selectByISBN.sql");
            __query.setOptions(options);
            __query.addParameter("isbn", java.lang.String.class, isbn);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("selectByISBN");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.skillup.bssapp.dataaccess.dto.Books>(jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal()));
            java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByISBN", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByISBN", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> selectByPublisher(java.lang.String publisher, org.seasar.doma.jdbc.SelectOptions options) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByPublisher", publisher, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/selectByPublisher.sql");
            __query.setOptions(options);
            __query.addParameter("publisher", java.lang.String.class, publisher);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("selectByPublisher");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.skillup.bssapp.dataaccess.dto.Books>(jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal()));
            java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByPublisher", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByPublisher", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> selectByTitle(java.lang.String title, org.seasar.doma.jdbc.SelectOptions options) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByTitle", title, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/selectByTitle.sql");
            __query.setOptions(options);
            __query.addParameter("title", java.lang.String.class, title);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("selectByTitle");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<jp.co.skillup.bssapp.dataaccess.dto.Books>(jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal()));
            java.util.List<jp.co.skillup.bssapp.dataaccess.dto.Books> __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByTitle", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "selectByTitle", __e);
            throw __e;
        }
    }

    @Override
    public int update(jp.co.skillup.bssapp.dataaccess.dto.Books books) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "update", books);
        try {
            if (books == null) {
                throw new org.seasar.doma.DomaNullPointerException("books");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method7);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/BooksDao/update.sql");
            __query.addParameter("books", jp.co.skillup.bssapp.dataaccess.dto.Books.class, books);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("books", books, jp.co.skillup.bssapp.dataaccess.dto._Books.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.BooksDaoImpl", "update", __e);
            throw __e;
        }
    }

}
