package jp.co.skillup.bssapp.business.service;

import jp.co.skillup.bssapp.common.info.UserContext;
import jp.co.skillup.bssapp.dataaccess.dao.PermissionInfoDao;
import jp.co.skillup.bssapp.dataaccess.dao.UserInfoDao;
import jp.co.skillup.bssapp.dataaccess.dto.PermissionInfo;
import jp.co.skillup.bssapp.dataaccess.dto.UserInfo;

public class LoginServiceImpl implements LoginService {

	private UserInfoDao userInfoDao;

	private PermissionInfoDao permissionInfoDao;

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public void setPermissionInfoDao(PermissionInfoDao permissionInfoDao) {
		this.permissionInfoDao = permissionInfoDao;
	}

	@Override
	public UserContext checkUser(String userId, String password) {

		UserInfo user = userInfoDao.selectByUserId(userId);

		// 存在しないユーザID
		if (user == null) {
			return null;
		}

		// TODO ハッシュ化する
		// パスワードが不一致の場合は失敗回数を更新
		if (!password.equals(user.password)) {
			user.failedCount++;
			userInfoDao.update(user);
			return null;
		}

		// 権限を取得
		PermissionInfo permission = permissionInfoDao.selectByPermissionInfoId(user.permissionInfoId);

		// ユーザ情報をメモリ上に保持
		UserContext context = new UserContext();
		context.setUserId(user.userId);
		context.setPermissionId(permission.permissionId);

		userInfoDao.update(user);
		return context;
	}
}
