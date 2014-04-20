package jp.co.skillup.bssapp.dataaccess.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-04-11T03:08:15.954+0900")
public class UserInfoDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements jp.co.skillup.bssapp.dataaccess.dao.UserInfoDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(jp.co.skillup.bssapp.dataaccess.dao.UserInfoDao.class, "update", jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class);

    /**
     * @param config the config
     */
    public UserInfoDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public jp.co.skillup.bssapp.dataaccess.dto.UserInfo selectByUserId(java.lang.String userId) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl", "selectByUserId", userId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/UserInfoDao/selectByUserId.sql");
            __query.addParameter("userId", java.lang.String.class, userId);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl");
            __query.setCallerMethodName("selectByUserId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<jp.co.skillup.bssapp.dataaccess.dto.UserInfo> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<jp.co.skillup.bssapp.dataaccess.dto.UserInfo>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<jp.co.skillup.bssapp.dataaccess.dto.UserInfo>(jp.co.skillup.bssapp.dataaccess.dto._UserInfo.getSingletonInternal()));
            jp.co.skillup.bssapp.dataaccess.dto.UserInfo __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl", "selectByUserId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl", "selectByUserId", __e);
            throw __e;
        }
    }

    @Override
    public int update(jp.co.skillup.bssapp.dataaccess.dto.UserInfo userInfo) {
        entering("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl", "update", userInfo);
        try {
            if (userInfo == null) {
                throw new org.seasar.doma.DomaNullPointerException("userInfo");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/jp/co/skillup/bssapp/dataaccess/dao/UserInfoDao/update.sql");
            __query.addParameter("userInfo", jp.co.skillup.bssapp.dataaccess.dto.UserInfo.class, userInfo);
            __query.setCallerClassName("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("userInfo", userInfo, jp.co.skillup.bssapp.dataaccess.dto._UserInfo.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("jp.co.skillup.bssapp.dataaccess.dao.UserInfoDaoImpl", "update", __e);
            throw __e;
        }
    }

}
