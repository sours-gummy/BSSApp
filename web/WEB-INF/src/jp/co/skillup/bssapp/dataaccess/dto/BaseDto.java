package jp.co.skillup.bssapp.dataaccess.dto;

import java.sql.Timestamp;

import org.seasar.doma.Entity;
import org.seasar.doma.jdbc.entity.NamingType;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
public class BaseDto {
	public Integer deleteFlag;
	public String createUserInfoId;
	public String updateUserInfoId;
	public Timestamp createDatetime;
	public Timestamp updateDatetime;
}
