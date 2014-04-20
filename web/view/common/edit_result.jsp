<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%--コンテンツ --%>
<content>

	<div data-alert class="alert-box success radius">
		<h4>
			更新が完了しました。
			<a href="#" class="close">&times;</a>
		</h4>
	</div>

	<ul class="pricing-table">
		<li class="title">書籍情報</li>
		<li class="price" >
			<p class="text-left">
				<strong>タイトル</strong><br>
				<bean:write name="book" property="title"/>
			</p>
		</li>
		<li class="price">
			<p class="text-left">
				<strong>著者名</strong><br>
				<bean:write name="book" property="authorName"/>
			</p>
		</li>
		<li class="price">
			<p class="text-left">
				<strong>著者ID</strong><br>
				<bean:write name="book" property="authorId"/>
			</p>
		</li>
		<li class="price">
			<p class="text-left">
				<strong>ISBN</strong><br>
				<bean:write name="book" property="isbn"/>
			</p>
		</li>
		<li class="price">
			<p class="text-left">
				<strong>出版社</strong><br>
				<bean:write name="book" property="publisher"/>
			</p>
		</li>
		<li class="price" >
			<p class="text-left">
				<strong>出版日</strong><br>
				<bean:write name="book" property="publishDate"/>
			</p>
		</li>
		<li class="cta-button">
			<a class="button" href="/BSSApp/search.do">書籍検索画面に戻る</a>
		</li>
	</ul>
<content>