package jp.co.skillup.bssapp.dataaccess.dto;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class PermissionInfo extends BaseDto {

	@Id
	public Integer permissionInfoId;

	public String permissionId;
}
