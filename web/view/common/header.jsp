<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%--ヘッダー --%>
<header>
	<div class="row">
		<div class="large-12 columns">
			<h2><tiles:getAsString name="title_name" /></h2>
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

				<section class="top-bar-section">
					<!--Right Nav Section -->
					<ul class="right">
						<li><a href="/BSSApp/logout.do">ログアウト</a></li>
					</ul>
				</section>
			</nav>
			<%-- TODO
			<nav class="breadcrumbs">
				<a href="#">書籍検索</a>
				<a href="#">1</a>
				<a class="unavailable" href="#">2</a>
				<a class="current" href="#">3</a>
			</nav>
			--%>
			</div>
		</div>
	</div>
</header>