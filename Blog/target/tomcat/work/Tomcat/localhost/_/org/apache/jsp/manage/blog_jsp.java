/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-20 11:49:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>后台管理 - 博客网</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/function-manage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction del(baId){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(confirm(\"确认删除吗\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\twindow.location=\"");
      out.print(request.getContextPath());
      out.write("/delete.ba?baId=\"+baId;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"logo\"><img src=\"../images/logo.gif\" /></div>\r\n");
      out.write("\t<div class=\"help\"><a href=\"../index.jsp\">返回前台页面</a></div>\r\n");
      out.write("\t<div class=\"navbar\">\r\n");
      out.write("\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t<li class=\"current\"><a href=\"index.jsp\">首页</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"user.jsp\">用户</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"blog.jsp\">文章</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"guestbook.jsp\">留言</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"childNav\">\r\n");
      out.write("\t<div class=\"welcome wrap\">\r\n");
      out.write("\t\t管理员pillys您好，今天是2012-12-21，欢迎回到管理后台。\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"position\" class=\"wrap\">\r\n");
      out.write("\t您现在的位置：<a href=\"index.jsp\">博客网</a> &gt; 管理后台\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"menu-mng\" class=\"lefter\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>用户管理</dt>\r\n");
      out.write("\t\t\t\t<dd><em><a href=\"user-add.jsp\">新增</a></em><a href=\"user.jsp\">用户管理</a></dd>\r\n");
      out.write("\t\t\t\t<dt>博文管理</dt>\r\n");
      out.write("\t\t\t\t<dd><em><a href=\"\">新增</a></em><a href=\"blogClass.jsp\">分类管理</a></dd>\r\n");
      out.write("\t\t\t\t<dd><em><a href=\"blogClassAddGo.ba\">新增</a></em><a href=\"queiry.ba\">文章管理</a></dd>\r\n");
      out.write("\t\t\t\t<dt>留言管理</dt>\r\n");
      out.write("\t\t\t\t<dd><a href=\"guestbook.jsp\">留言管理</a></dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<h2>文章管理</h2>\r\n");
      out.write("\t\t<div class=\"manage\">\r\n");
      out.write("\t\t\t<table class=\"list\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t\t<th>文章标题</th>\r\n");
      out.write("\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\tCopyright &copy; 2010  All Rights Reserved. 京ICP证1000001号\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /manage/blog.jsp(66,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("li");
    // /manage/blog.jsp(66,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/manage/blog.jsp(66,4) '${list }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${list }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>  \r\n");
          out.write("\t\t\t\t\t<td class=\"first w4 c\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${li.baId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td class=\"thumb\"><a href=\"../blog-view.jsp\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${li.baTitle }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t\t<td class=\"w1 c\"><a href=\"findById.ba?idddd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${li.baId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">修改</a> \r\n");
          out.write("\t\t\t\t\t<a href=\"javascript:del('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${li.baId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("');\">删除</a></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
