package jp.co.skillup.bssapp.dataaccess.dao;

import jp.co.skillup.bssapp.dataaccess.dto.PermissionInfo;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
public interface PermissionInfoDao {

	@Select
	public PermissionInfo selectByPermissionInfoId(Integer permissionInfoId);
}
