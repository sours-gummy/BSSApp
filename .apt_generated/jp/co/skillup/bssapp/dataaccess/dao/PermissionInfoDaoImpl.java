package jp.co.skillup.bssapp.dataaccess.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-04-19T02:46:49.994+0900")
public class PermissionInfoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.skillup.bssapp.dataaccess.dao.PermissionInfoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /**
     * @param config the config
     */
    public PermissionInfoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.PermissionInfo selectByPermissionInfoId(java.lang.Integer permissionInfoId) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.PermissionInfoDaoImpl", "selectByPermissionInfoId", permissionInfoId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/PermissionInfoDao/selectByPermissionInfoId.sql");
            __query.addParameter("permissionInfoId", java.lang.Integer.class, permissionInfoId);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.PermissionInfoDaoImpl");
            __query.setCallerMethodName("selectByPermissionInfoId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<jp.co.skillup.bssapp.dataaccess.dto.PermissionInfo> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<jp.co.skillup.bssapp.dataaccess.dto.PermissionInfo>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.skillup.bssapp.dataaccess.dto.PermissionInfo>(jp.co.skillup.bssapp.dataaccess.dto._PermissionInfo.getSingletonInternal()));
            jp.co.skillup.bssapp.dataaccess.dto.PermissionInfo __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.PermissionInfoDaoImpl", "selectByPermissionInfoId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.PermissionInfoDaoImpl", "selectByPermissionInfoId", __e);
            throw __e;
        }
    }

}
