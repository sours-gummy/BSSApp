<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%--コンテンツ --%>
<content>
	<div class="row">
		<div class="large-12 columns">

	<table>
		<thead>
			<tr>
				<th>タイトル</th>
				<th>著者名</th>
				<th>ISBN</th>
				<th>出版社</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<logic:iterate id="book" name="books">
				<tr>
					<html:form action="/dispatch">
						<html:hidden name="book" property="booksId" />
						<td><bean:write name="book" property="title"/></td>
						<td><bean:write name="book" property="authorName"/></td>
						<td><bean:write name="book" property="isbn"/></td>
						<td><bean:write name="book" property="publisher"/></td>
						<td>
							<ul class="button-group">
								<bean:define id="permission" name="user" property="permissionId" />
								<li><input type="submit" name="method" class="button [tiny small large] [radius secondary label]" value="<bean:message key="label.detail" />" /></li>

								<logic:equal name="permission" value="999">
									<li><input type="submit" name="method" class="button [tiny small large] [radius secondary label]" value="<bean:message key="label.edit" />" /></li>
									<li><input type="submit" name="method" class="button [tiny small large] [radius secondary label]" value="<bean:message key="label.delete" />" /></li>
								</logic:equal>
							</ul>
						</td>
					</html:form>
				</tr>
			</logic:iterate>
		</tbody>
	</table>
	</div>
	</div>
	<a class="button" href="/BSSApp/search.do">書籍検索画面に戻る</a>
</content>