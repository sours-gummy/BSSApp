/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.26
 * Generated at: 2014-04-18 08:50:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/tld/struts-logic.tld", Long.valueOf(1393255447327L));
    _jspx_dependants.put("/WEB-INF/tld/struts-tiles.tld", Long.valueOf(1394975472869L));
    _jspx_dependants.put("/WEB-INF/tld/struts-html.tld", Long.valueOf(1393255447314L));
    _jspx_dependants.put("/WEB-INF/tld/struts-bean.tld", Long.valueOf(1393255447305L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005fput_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005fput_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute.release();
    _005fjspx_005ftagPool_005ftiles_005fput_0026_005fname.release();
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t\t<meta name=\"Viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\t<title>");
      if (_jspx_meth_tiles_005fgetAsString_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/BSSApp/view/common/foundation-5.1.1/css/normalize.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/BSSApp/view/common/foundation-5.1.1/css/foundation.css\" />\r\n");
      out.write("\t    <script src=\"/BSSApp/view/common/foundation-5.1.1/js/vendor/modernizr.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsert_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsert_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_005finsert_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tiles_005fgetAsString_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.struts.tiles.taglib.GetAttributeTag _jspx_th_tiles_005fgetAsString_005f0 = (org.apache.struts.tiles.taglib.GetAttributeTag) _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetAttributeTag.class);
    _jspx_th_tiles_005fgetAsString_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005fgetAsString_005f0.setParent(null);
    // /view/common/main.jsp(11,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fgetAsString_005f0.setName("title_name");
    int _jspx_eval_tiles_005fgetAsString_005f0 = _jspx_th_tiles_005fgetAsString_005f0.doStartTag();
    if (_jspx_th_tiles_005fgetAsString_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005fgetAsString_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005fgetAsString_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_005finsert_005f0 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_005finsert_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f0.setParent(null);
    // /view/common/main.jsp(18,2) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f0.setAttribute("header");
    int _jspx_eval_tiles_005finsert_005f0 = _jspx_th_tiles_005finsert_005f0.doStartTag();
    if (_jspx_eval_tiles_005finsert_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_tiles_005fput_005f0(_jspx_th_tiles_005finsert_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_tiles_005finsert_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute.reuse(_jspx_th_tiles_005finsert_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute.reuse(_jspx_th_tiles_005finsert_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005fput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_005finsert_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.tiles.taglib.PutTag _jspx_th_tiles_005fput_005f0 = (org.apache.struts.tiles.taglib.PutTag) _005fjspx_005ftagPool_005ftiles_005fput_0026_005fname.get(org.apache.struts.tiles.taglib.PutTag.class);
    _jspx_th_tiles_005fput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005fput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_005finsert_005f0);
    // /view/common/main.jsp(19,3) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fput_005f0.setName("title_name");
    int _jspx_eval_tiles_005fput_005f0 = _jspx_th_tiles_005fput_005f0.doStartTag();
    if (_jspx_eval_tiles_005fput_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tiles_005fput_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tiles_005fput_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tiles_005fput_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_tiles_005fgetAsString_005f1(_jspx_th_tiles_005fput_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_tiles_005fput_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tiles_005fput_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_tiles_005fput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005fput_0026_005fname.reuse(_jspx_th_tiles_005fput_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005fput_0026_005fname.reuse(_jspx_th_tiles_005fput_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005fgetAsString_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_005fput_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.struts.tiles.taglib.GetAttributeTag _jspx_th_tiles_005fgetAsString_005f1 = (org.apache.struts.tiles.taglib.GetAttributeTag) _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody.get(org.apache.struts.tiles.taglib.GetAttributeTag.class);
    _jspx_th_tiles_005fgetAsString_005f1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005fgetAsString_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_005fput_005f0);
    // /view/common/main.jsp(19,32) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fgetAsString_005f1.setName("title_name");
    int _jspx_eval_tiles_005fgetAsString_005f1 = _jspx_th_tiles_005fgetAsString_005f1.doStartTag();
    if (_jspx_th_tiles_005fgetAsString_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005fgetAsString_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005fgetAsString_005f1);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_005finsert_005f1 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_005finsert_005f1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f1.setParent(null);
    // /view/common/main.jsp(23,2) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f1.setAttribute("content");
    int _jspx_eval_tiles_005finsert_005f1 = _jspx_th_tiles_005finsert_005f1.doStartTag();
    if (_jspx_th_tiles_005finsert_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f1);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_005finsert_005f2 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_005finsert_005f2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f2.setParent(null);
    // /view/common/main.jsp(26,2) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsert_005f2.setAttribute("footer");
    int _jspx_eval_tiles_005finsert_005f2 = _jspx_th_tiles_005finsert_005f2.doStartTag();
    if (_jspx_th_tiles_005finsert_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f2);
    return false;
  }
}
