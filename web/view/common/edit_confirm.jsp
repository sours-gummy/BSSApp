<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%--コンテンツ --%>
<content>

	<div data-alert class="alert-box info radius">
		<h4>以下の内容で更新します。よろしいですか？</h4>
	</div>

	<html:form action="/edit/execute">
		<html:hidden name="book" property="booksId"/>
		<html:hidden name="book" property="version"/>
		<html:hidden name="book" property="title"/>
		<html:hidden name="book" property="authorName"/>
		<html:hidden name="book" property="authorId"/>
		<html:hidden name="book" property="isbn"/>
		<html:hidden name="book" property="publisher"/>
		<html:hidden name="book" property="publishDate"/>

		<ul class="pricing-table">
			<li class="title">書籍情報</li>
			<li class="bullet-item" >
				<p class="text-left">
					<strong>タイトル</strong><br>
					<bean:write name="book" property="title"/>
				</p>
			</li>
			<li class="bullet-item">
				<p class="text-left">
					<strong>著者名</strong><br>
					<bean:write name="book" property="authorName"/>
				</p>
			</li>
			<li class="bullet-item">
				<p class="text-left">
					<strong>著者ID</strong><br>
					<bean:write name="book" property="authorId"/>
				</p>
			</li>
			<li class="bullet-item">
				<p class="text-left">
					<strong>ISBN</strong><br>
					<bean:write name="book" property="isbn"/>
				</p>
			</li>
			<li class="bullet-item">
				<p class="text-left">
					<strong>出版社</strong><br>
					<bean:write name="book" property="publisher"/>
				</p>
			</li>
			<li class="bullet-item" >
				<p class="text-left">
					<strong>出版日</strong><br>
					<bean:write name="book" property="publishDate"/>
				</p>
			</li>
			<li class="cta-button">
				<div class="row">
					<div class="small-6 small-centered columns">
						<div class="row">
							<div class="large-6 columns">
								<a onclick="return doPost()" class="button" href="#">キャンセル</a>
								<script>
									function doPost() {
										var form = document.EditExecuteForm;
										form.setAttribute("action", "/BSSApp/edit.do");
										form.setAttribute("method", "post");
										form.style.display = "none";
										document.body.appendChild(form);
										form.submit();
										return false;
									}
								</script>
							</div>
							<div class="large-6 columns">
								<input type="submit" class="button" value="OK" />
							</div>
						</div>
					</div>
				</div>
			</li>
		</ul>
	</html:form>
<content>