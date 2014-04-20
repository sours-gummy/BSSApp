package jp.co.skillup.bssapp.dataaccess.dao;

import jp.co.skillup.bssapp.dataaccess.dto.UserInfo;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

@Dao
public interface UserInfoDao {

	@Select
	public UserInfo selectByUserId(String userId);

	@Update(sqlFile = true)
	public int update(UserInfo userInfo);
}
