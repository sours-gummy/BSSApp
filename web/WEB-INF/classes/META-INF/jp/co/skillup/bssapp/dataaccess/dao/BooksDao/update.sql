update BOOKS
set AUTHOR_NAME = /* books.authorName */'test',
AUTHOR_ID = /* books.authorId */'test',
PUBLISHER = /* books.publisher */'test',
VERSION = /* books.version */1 + 1
where BOOKS_ID = /* books.booksId */1
and VERSION = /* books.version */1