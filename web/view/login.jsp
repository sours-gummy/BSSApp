<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta name="Viewport" content="width=device-width, initial-scale=1.0" />
		<title>ログイン画面</title>
		<link rel="stylesheet" href="/BSSApp/view/common/foundation-5.1.1/css/normalize.css" />
		<link rel="stylesheet" href="/BSSApp/view/common/foundation-5.1.1/css/foundation.css" />
	    <script src="/BSSApp/view/common/foundation-5.1.1/js/vendor/modernizr.js"></script>
	</head>
	<body>
		<header>
			<div class="row">
				<div class="large-12 columns">
					<h2>ログイン</h2>
				</div>
			</div>

			<%--ナビゲーションバー --%>
			<div class="row">
				<div class="large-12 columns">

					<%--ナビバーは固定 --%>
					<div class="fixed">
					<nav class="top-bar" data-topbar>
						<ul class="title-area">
							<li class="name">
								<h1><a href="#">書籍管理システム</a></h1>
							</li>
							<li class="toggle-topbar menu-icon"><a href="#">Menu</a></li>
						</ul>
					</nav>
					</div>
				</div>
			</div>
		</header>
		<html:errors />

		<div class="row">
			<div class="small-6 small-centered columns">
				<html:form action="/login/execute" focus="id">
					<fieldset>
					<legend>ログインフォーム</legend>
					<bean:message key="login.id" />
					<input type="text" name="id" placeholder="ログインIDを入力してください。" />
					<br>

					<bean:message key="login.password" />
					<input type="password" name="password" placeholder="パスワードを入力してください。"  />
					<br>
					<div class="row">
						<div class="large-6 columns">
							<input type="submit" class="button postfix" value="送信" />
						</div>
						<div class="large-6 columns">
							<input type="reset" class="button postfix" value="リセット">
						</div>
					</div>
					</fieldset>
				</html:form>
			</div>
		</div>

		<footer>
			<div class="row">
				<div class="large-12 columns">
					Copyright © 2014 ayabe All Rights Reserved.
				</div>
			</div>
			<script src="/BSSApp/view/common/foundation-5.1.1/js/vendor/jquery.js"></script>
			<script src="/BSSApp/view/common/foundation-5.1.1/js/foundation.min.js"></script>
			<script>
				$(document).foundation();
			</script>
		</footer>
	</body>
</html>