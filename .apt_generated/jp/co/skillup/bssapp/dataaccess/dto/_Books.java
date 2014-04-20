package jp.co.skillup.bssapp.dataaccess.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-04-11T02:41:47.404+0900")
public final class _Books extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.skillup.bssapp.dataaccess.dto.Books> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _Books __singleton = new _Books();

    /** the createDatetime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.sql.Timestamp, java.lang.Object> $createDatetime = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.sql.Timestamp, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$createDatetime, null, "createDatetime", "CREATE_DATETIME", true, true);

    /** the createUserInfoId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $createUserInfoId = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$createUserInfoId, null, "createUserInfoId", "CREATE_USER_INFO_ID", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.Integer, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$deleteFlag, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the updateDatetime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.sql.Timestamp, java.lang.Object> $updateDatetime = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.sql.Timestamp, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$updateDatetime, null, "updateDatetime", "UPDATE_DATETIME", true, true);

    /** the updateUserInfoId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $updateUserInfoId = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$updateUserInfoId, null, "updateUserInfoId", "UPDATE_USER_INFO_ID", true, true);

    /** the authorId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $authorId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "authorId", "AUTHOR_ID", true, true);

    /** the authorName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $authorName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "authorName", "AUTHOR_NAME", true, true);

    /** the booksId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.Integer, java.lang.Object> $booksId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "booksId", "BOOKS_ID");

    /** the isbn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $isbn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "isbn", "ISBN", true, true);

    /** the publishDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $publishDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "publishDate", "PUBLISH_DATE", true, true);

    /** the publisher */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $publisher = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "publisher", "PUBLISHER", true, true);

    /** the title */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object> $title = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "title", "TITLE", true, true);

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.Integer, java.lang.Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.Books.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "version", "VERSION");

    private final org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.skillup.bssapp.dataaccess.dto.Books> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> __entityPropertyTypeMap;

    private _Books() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.skillup.bssapp.dataaccess.dto.Books>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "Books";
        __catalogName = "";
        __schemaName = "";
        __tableName = "BOOKS";
        __qualifiedTableName = "BOOKS";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>>(13);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>>(13);
        __list.add($createDatetime);
        __map.put("createDatetime", $createDatetime);
        __list.add($createUserInfoId);
        __map.put("createUserInfoId", $createUserInfoId);
        __list.add($deleteFlag);
        __map.put("deleteFlag", $deleteFlag);
        __list.add($updateDatetime);
        __map.put("updateDatetime", $updateDatetime);
        __list.add($updateUserInfoId);
        __map.put("updateUserInfoId", $updateUserInfoId);
        __list.add($authorId);
        __map.put("authorId", $authorId);
        __list.add($authorName);
        __map.put("authorName", $authorName);
        __idList.add($booksId);
        __list.add($booksId);
        __map.put("booksId", $booksId);
        __list.add($isbn);
        __map.put("isbn", $isbn);
        __list.add($publishDate);
        __map.put("publishDate", $publishDate);
        __list.add($publisher);
        __map.put("publisher", $publisher);
        __list.add($title);
        __map.put("title", $title);
        __list.add($version);
        __map.put("version", $version);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(jp.co.skillup.bssapp.dataaccess.dto.Books entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.skillup.bssapp.dataaccess.dto.Books> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(jp.co.skillup.bssapp.dataaccess.dto.Books entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.skillup.bssapp.dataaccess.dto.Books> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(jp.co.skillup.bssapp.dataaccess.dto.Books entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.skillup.bssapp.dataaccess.dto.Books> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(jp.co.skillup.bssapp.dataaccess.dto.Books entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.skillup.bssapp.dataaccess.dto.Books> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(jp.co.skillup.bssapp.dataaccess.dto.Books entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.skillup.bssapp.dataaccess.dto.Books> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(jp.co.skillup.bssapp.dataaccess.dto.Books entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.skillup.bssapp.dataaccess.dto.Books> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.Books, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.Books, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.Books newEntity() {
        return new jp.co.skillup.bssapp.dataaccess.dto.Books();
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.Books newEntity(java.util.Map<String, Object> __args) {
        return new jp.co.skillup.bssapp.dataaccess.dto.Books();
    }

    @Override
    public Class<jp.co.skillup.bssapp.dataaccess.dto.Books> getEntityClass() {
        return jp.co.skillup.bssapp.dataaccess.dto.Books.class;
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.Books getOriginalStates(jp.co.skillup.bssapp.dataaccess.dto.Books __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.skillup.bssapp.dataaccess.dto.Books __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Books getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Books newInstance() {
        return new _Books();
    }

}
