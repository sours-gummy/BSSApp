package jp.co.skillup.bssapp.dataaccess.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-04-11T02:41:47.401+0900")
public final class _BaseDto extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _BaseDto __singleton = new _BaseDto();

    /** the createDatetime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.sql.Timestamp, java.lang.Object> $createDatetime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.sql.Timestamp, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.BaseDto.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "createDatetime", "CREATE_DATETIME", true, true);

    /** the createUserInfoId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.lang.String, java.lang.Object> $createUserInfoId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.BaseDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "createUserInfoId", "CREATE_USER_INFO_ID", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.lang.Integer, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.BaseDto.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the updateDatetime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.sql.Timestamp, java.lang.Object> $updateDatetime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.sql.Timestamp, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.BaseDto.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updateDatetime", "UPDATE_DATETIME", true, true);

    /** the updateUserInfoId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.lang.String, java.lang.Object> $updateUserInfoId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.BaseDto.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updateUserInfoId", "UPDATE_USER_INFO_ID", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> __entityPropertyTypeMap;

    private _BaseDto() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.skillup.bssapp.dataaccess.dto.BaseDto>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "BaseDto";
        __catalogName = "";
        __schemaName = "";
        __tableName = "BASE_DTO";
        __qualifiedTableName = "BASE_DTO";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>>(5);
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
    public void preInsert(jp.co.skillup.bssapp.dataaccess.dto.BaseDto entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(jp.co.skillup.bssapp.dataaccess.dto.BaseDto entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(jp.co.skillup.bssapp.dataaccess.dto.BaseDto entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(jp.co.skillup.bssapp.dataaccess.dto.BaseDto entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(jp.co.skillup.bssapp.dataaccess.dto.BaseDto entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(jp.co.skillup.bssapp.dataaccess.dto.BaseDto entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.BaseDto, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.BaseDto newEntity() {
        return new jp.co.skillup.bssapp.dataaccess.dto.BaseDto();
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.BaseDto newEntity(java.util.Map<String, Object> __args) {
        return new jp.co.skillup.bssapp.dataaccess.dto.BaseDto();
    }

    @Override
    public Class<jp.co.skillup.bssapp.dataaccess.dto.BaseDto> getEntityClass() {
        return jp.co.skillup.bssapp.dataaccess.dto.BaseDto.class;
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.BaseDto getOriginalStates(jp.co.skillup.bssapp.dataaccess.dto.BaseDto __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.skillup.bssapp.dataaccess.dto.BaseDto __entity) {
    }

    /**
     * @return the singleton
     */
    public static _BaseDto getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _BaseDto newInstance() {
        return new _BaseDto();
    }

}
