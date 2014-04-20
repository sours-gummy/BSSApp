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
		<title><tiles:getAsString name="title_name" /></title>
		<link rel="stylesheet" href="/BSSApp/view/common/foundation-5.1.1/css/normalize.css" />
		<link rel="stylesheet" href="/BSSApp/view/common/foundation-5.1.1/css/foundation.css" />
	    <script src="/BSSApp/view/common/foundation-5.1.1/js/vendor/modernizr.js"></script>
	</head>
	<body>
		<%-- ヘッダー --%>
		<tiles:insert attribute="header" >
			<tiles:put name="title_name"><tiles:getAsString name="title_name" /></tiles:put>
		</tiles:insert>

		<%-- コンテンツ --%>
		<tiles:insert attribute="content" />

		<%-- フッター --%>
		<tiles:insert attribute="footer" />
	</body>
</html>