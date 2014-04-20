<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%--コンテンツ --%>
<content>
	<dl class="accordion" data-accordion>
	  <dd>
	    <a href="#search"></a>
	    <div id="search" class="content active">
	    	<html:form action="/search/execute">
	    		<html:hidden property="rtn" value="0" />
	    		<fieldset>
					<legend>検索条件</legend>
					<%-- タイトル --%>
					<div class="row">
						<div class="large-12 columns">
							<div class="row collapse">
								<div class="large-2 columns">
									<span class="prefix radius">タイトル</span>
								</div>
								<div class="large-10 columns">
									<input type="text" name="title" placeholder="検索するタイトルを入力してください。" />
						    	</div>
							</div>
						</div>
					</div>
					<%-- 著者名 --%>
					<div class="row">
						<div class="large-12 columns">
							<div class="row collapse">
								<div class="large-2 columns">
									<span class="prefix radius">著者名</span>
								</div>
								<div class="large-10 columns">
									<input type="text" name="authorName" placeholder="検索する著者名を入力してください。" />
						    	</div>
							</div>
						</div>
					</div>
					<%-- ISBN --%>
					<div class="row">
						<div class="large-12 columns">
							<div class="row collapse">
								<div class="large-2 columns">
									<span class="prefix radius">ISBN</span>
								</div>
								<div class="large-10 columns">
									<input type="text" name="isbn" placeholder="検索するISBNを入力してください。" />
						    	</div>
							</div>
						</div>
					</div>
					<%-- 出版社 --%>
					<div class="row">
						<div class="large-12 columns">
							<div class="row collapse">
								<div class="large-2 columns">
									<span class="prefix radius">出版社</span>
								</div>
								<div class="large-10 columns">
									<input type="text" name="publisher" placeholder="検索する出版社を入力してください。" />
						    	</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="large-12 columns">
							<input type="submit" class="button postfix" value="検索" />
						</div>
					</div>
			  	</fieldset>
			</html:form>
      	</div>
	  </dd>
	</dl>
</content>
