package jp.co.skillup.bssapp.dataaccess.dto;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-04-11T02:41:47.396+0900")
public final class _UserInfo extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _UserInfo __singleton = new _UserInfo();

    /** the createDatetime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.sql.Timestamp, java.lang.Object> $createDatetime = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.sql.Timestamp, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$createDatetime, null, "createDatetime", "CREATE_DATETIME", true, true);

    /** the createUserInfoId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object> $createUserInfoId = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$createUserInfoId, null, "createUserInfoId", "CREATE_USER_INFO_ID", true, true);

    /** the deleteFlag */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object> $deleteFlag = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$deleteFlag, null, "deleteFlag", "DELETE_FLAG", true, true);

    /** the updateDatetime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.sql.Timestamp, java.lang.Object> $updateDatetime = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.sql.Timestamp, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$updateDatetime, null, "updateDatetime", "UPDATE_DATETIME", true, true);

    /** the updateUserInfoId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object> $updateUserInfoId = new org.seasar.doma.jdbc.entity.BasicPropertyType<jp.co.skillup.bssapp.dataaccess.dto.BaseDto, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, jp.co.skillup.bssapp.dataaccess.dto._BaseDto.getSingletonInternal().$updateUserInfoId, null, "updateUserInfoId", "UPDATE_USER_INFO_ID", true, true);

    /** the failedCount */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object> $failedCount = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "failedCount", "FAILED_COUNT", true, true);

    /** the password */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object> $password = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "password", "PASSWORD", true, true);

    /** the permissionInfoId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object> $permissionInfoId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "permissionInfoId", "PERMISSION_INFO_ID", true, true);

    /** the userId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object> $userId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.String, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "userId", "USER_ID", true, true);

    /** the userInfoId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object> $userInfoId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "userInfoId", "USER_INFO_ID");

    /** the version */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object> $version = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, java.lang.Integer, java.lang.Object>(jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "version", "VERSION");

    private final org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> __entityPropertyTypeMap;

    private _UserInfo() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<jp.co.skillup.bssapp.dataaccess.dto.UserInfo>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "UserInfo";
        __catalogName = "";
        __schemaName = "";
        __tableName = "USER_INFO";
        __qualifiedTableName = "USER_INFO";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>>(11);
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
        __list.add($failedCount);
        __map.put("failedCount", $failedCount);
        __list.add($password);
        __map.put("password", $password);
        __list.add($permissionInfoId);
        __map.put("permissionInfoId", $permissionInfoId);
        __list.add($userId);
        __map.put("userId", $userId);
        __idList.add($userInfoId);
        __list.add($userInfoId);
        __map.put("userInfoId", $userInfoId);
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
    public void preInsert(jp.co.skillup.bssapp.dataaccess.dto.UserInfo entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(jp.co.skillup.bssapp.dataaccess.dto.UserInfo entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(jp.co.skillup.bssapp.dataaccess.dto.UserInfo entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(jp.co.skillup.bssapp.dataaccess.dto.UserInfo entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(jp.co.skillup.bssapp.dataaccess.dto.UserInfo entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(jp.co.skillup.bssapp.dataaccess.dto.UserInfo entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.skillup.bssapp.dataaccess.dto.UserInfo, ?, ?> getVersionPropertyType() {
        return $version;
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.UserInfo newEntity() {
        return new jp.co.skillup.bssapp.dataaccess.dto.UserInfo();
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.UserInfo newEntity(java.util.Map<String, Object> __args) {
        return new jp.co.skillup.bssapp.dataaccess.dto.UserInfo();
    }

    @Override
    public Class<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> getEntityClass() {
        return jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class;
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.UserInfo getOriginalStates(jp.co.skillup.bssapp.dataaccess.dto.UserInfo __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.skillup.bssapp.dataaccess.dto.UserInfo __entity) {
    }

    /**
     * @return the singleton
     */
    public static _UserInfo getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _UserInfo newInstance() {
        return new _UserInfo();
    }

}
