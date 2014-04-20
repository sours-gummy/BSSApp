<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%--コンテンツ --%>
<content>
	<ul class="pricing-table">
		<li class="title">詳細</li>
		<li class="bullet-item">
			<ul class="button-group even-2">
				<li><button class="button disabled">タイトル</button></li>
				<li><button class="button disabled [radius secondary label]"><bean:write name="book" property="title"/></button></li>
			</ul>

			<ul class="button-group even-2">
				<li><button class="button disabled">著者名</button></li>
				<li><button class="button disabled [radius secondary label]"><bean:write name="book" property="authorName"/></button></li>
			</ul>

			<ul class="button-group even-2">
				<li><button class="button disabled">著者ID</button></li>
				<li><button class="button disabled [radius secondary label]"><bean:write name="book" property="authorId"/></button></li>
			</ul>

			<ul class="button-group even-2">
				<li><button class="button disabled">ISBN</button></li>
				<li><button class="button disabled [radius secondary label]"><bean:write name="book" property="isbn"/></button></li>
			</ul>

			<ul class="button-group even-2">
				<li><button class="button disabled">出版社</button></li>
				<li><button class="button disabled [radius secondary label]"><bean:write name="book" property="publisher"/></button></li>
			</ul>

			<ul class="button-group even-2">
				<li><button class="button disabled">出版日</button></li>
				<li><button class="button disabled [radius secondary label]"><bean:write name="book" property="publishDate"/></button></li>
			</ul>
		</li>
		<li class="cta-button">
			<div class="row">
				<div class="small-6 small-centered columns">
					<div class="row">
						<div class="large-6 columns">
							<html:form action="/search/execute">
								<html:hidden property="rtn" value="1" />
								<input type="submit" class="button" value="戻る" />
							</html:form>
						</div>
						<div class="large-6 columns">
							<a class="button" href="/BSSApp/search.do">書籍検索画面に戻る</a>
						</div>
					</div>
				</div>
			</div>
		</li>
	</ul>
<content>