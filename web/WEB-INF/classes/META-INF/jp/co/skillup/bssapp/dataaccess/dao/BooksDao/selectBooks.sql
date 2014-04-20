select * from BOOKS where
/*%if title == null || !title.isEmpty() */
	TITLE like /* "%" + title + "%" */'test'
/*%end */

/*%if authorName == null || !authorName.isEmpty() */
	and AUTHOR_NAME like /* "%" + authorName + "%" */'test'
/*%end */

/*%if isbn == null || !isbn.isEmpty() */
	and ISBN like /* "%" + isbn + "%" */'test'
/*%end */

/*%if publisher == null || !publisher.isEmpty() */
	and PUBLISHER like /* "%" + publisher + "%" */'test'
/*%end */