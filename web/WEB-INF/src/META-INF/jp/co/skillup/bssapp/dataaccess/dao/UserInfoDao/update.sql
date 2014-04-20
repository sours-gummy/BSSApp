update USER_INFO set FAILED_COUNT = /* userInfo.failedCount */1, VERSION = /* userInfo.version */1 + 1
where USER_INFO_ID = /* userInfo.userInfoId */1