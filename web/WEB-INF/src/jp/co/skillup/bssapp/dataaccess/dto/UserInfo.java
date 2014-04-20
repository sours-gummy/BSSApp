package jp.co.skillup.bssapp.dataaccess.dto;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Version;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class UserInfo extends BaseDto {

	@Id
	public Integer userInfoId;

	public String userId;

	public Integer permissionInfoId;

	public String password;

	public Integer failedCount;

	@Version
	public Integer version;
}
