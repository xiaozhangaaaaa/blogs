/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-21 10:41:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>首页_无涯个人博客 </title>\r\n");
      out.write("<meta name=\"keywords\" content=\"个人博客,无涯个人博客,个人博客模板,无涯\" />\r\n");
      out.write("<meta name=\"description\" content=\"无涯个人博客，8年IT行业经验,曾就职于蓝盾股份、广发银行、XX知名学校教学。\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link href=\"css/base.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/m.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"js/modernizr.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script>\r\n");
      out.write("window.onload = function ()\r\n");
      out.write("{\r\n");
      out.write("\tvar oH2 = document.getElementsByTagName(\"h2\")[0];\r\n");
      out.write("\tvar oUl = document.getElementsByTagName(\"ul\")[0];\r\n");
      out.write("\toH2.onclick = function ()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar style = oUl.style;\r\n");
      out.write("\t\tstyle.display = style.display == \"block\" ? \"none\" : \"block\";\r\n");
      out.write("\t\toH2.className = style.display == \"block\" ? \"open\" : \"\"\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("  <div class=\"tophead\">\r\n");
      out.write("    <div class=\"logo\"><a href=\"/\">无涯个人博客</a></div>\r\n");
      out.write("    <div id=\"mnav\">\r\n");
      out.write("      <h2><span class=\"navicon\"></span></h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"index.jsp\">网站首页</a></li>\r\n");
      out.write("        <li><a href=\"about.jsp\">关于我</a></li>\r\n");
      out.write("        <li><a href=\"query.ba\">学无止境</a></li>\r\n");
      out.write("        <li><a href=\"query.cuba\">留言</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <nav class=\"topnav\" id=\"topnav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"index.jsp\">网站首页</a></li>\r\n");
      out.write("        <li><a href=\"about.jsp\">关于我</a></li>\r\n");
      out.write("        <li><a href=\"query.ba\">学无止境</a></li>\r\n");
      out.write("        <li><a href=\"query.cuba\">留言</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\t\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"picshow\">\r\n");
      out.write("  <ul>\r\n");
      out.write("    <li><a href=\"/\"><i><img src=\"images/b01.jpg\"></i>\r\n");
      out.write("      <div class=\"font\">\r\n");
      out.write("        <h3>个人博客《模板1》</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      </a></li>\r\n");
      out.write("    <li><a href=\"/\"><i><img src=\"images/b02.jpg\"></i>\r\n");
      out.write("      <div class=\"font\">\r\n");
      out.write("        <h3>个人博客《模板1》</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      </a></li>\r\n");
      out.write("    <li><a href=\"/\"><i><img src=\"images/b03.jpg\"></i>\r\n");
      out.write("      <div class=\"font\">\r\n");
      out.write("        <h3>个人博客《模板1》</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      </a></li>\r\n");
      out.write("    <li><a href=\"/\"><i><img src=\"images/b04.jpg\"></i>\r\n");
      out.write("      <div class=\"font\">\r\n");
      out.write("        <h3>个人博客《模板1》</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      </a></li>\r\n");
      out.write("    <li><a href=\"/\"><i><img src=\"images/b05.jpg\"></i>\r\n");
      out.write("      <div class=\"font\">\r\n");
      out.write("        <h3>个人博客《模板1》</h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      </a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<article>\r\n");
      out.write("  <div class=\"blogs\">\r\n");
      out.write("    <div class=\"mt20\"></div>\r\n");
      out.write("    <li> \r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">陌上花开，可缓缓归矣</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li> \r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li> \r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li>\r\n");
      out.write("      <h3 class=\"blogtitle\"><a href=\"/\">网页中图片属性固定宽度，如何用js改变大小</a></h3>\r\n");
      out.write("      <div class=\"bloginfo\">\r\n");
      out.write("        <p>用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板，...</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"autor\"><span class=\"lm\"><a href=\"/\" title=\"CSS3|Html5\" target=\"_blank\" class=\"classname\">CSS3|Html5</a></span><span class=\"dtime\">2018-05-04</span><span class=\"viewnum\">浏览（<a href=\"/\">0</a>）</span><span class=\"readmore\"><a href=\"/\">阅读原文</a></span></div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <div class=\"pagelist\"><a title=\"Total record\">&nbsp;<b>45</b> </a>&nbsp;&nbsp;&nbsp;<b>1</b>&nbsp;<a href=\"/download/index_2.jsp\">2</a>&nbsp;<a href=\"/download/index_2.jsp\">下一页</a>&nbsp;<a href=\"/download/index_2.jsp\">尾页</a></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"sidebar\">\r\n");
      out.write("    <div class=\"about\">\r\n");
      out.write("      <div class=\"avatar\"> <img src=\"images/avatar.jpg\" alt=\"\"> </div>\r\n");
      out.write("      <p class=\"abname\">adam | 无涯</p>\r\n");
      out.write("      <p class=\"abposition\">JAVA高级讲师</p>\r\n");
      out.write("      <div class=\"abtext\"> 无涯个人博客，8年IT行业经验,曾就职于蓝盾股份、广发银行、XX知名学校教学。 </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"search\">\r\n");
      out.write("      <form action=\"/e/search/index.php\" method=\"post\" name=\"searchform\" id=\"searchform\">\r\n");
      out.write("        <input name=\"keyboard\" id=\"keyboard\" class=\"input_text\" value=\"请输入关键字\" style=\"color: rgb(153, 153, 153);\" onfocus=\"if(value=='请输入关键字'){this.style.color='#000';value=''}\" onblur=\"if(value==''){this.style.color='#999';value='请输入关键字'}\" type=\"text\">\r\n");
      out.write("        <input name=\"show\" value=\"title\" type=\"hidden\">\r\n");
      out.write("        <input name=\"tempid\" value=\"1\" type=\"hidden\">\r\n");
      out.write("        <input name=\"tbname\" value=\"news\" type=\"hidden\">\r\n");
      out.write("        <input name=\"Submit\" class=\"input_submit\" value=\"搜索\" type=\"submit\">\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"cloud\">\r\n");
      out.write("      <h2 class=\"hometitle\">标签云</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <a href=\"/\">陌上花开</a> <a href=\"/\">校园生活</a> <a href=\"/\">html5</a> <a href=\"/\">SumSung</a> <a href=\"/\">青春</a> <a href=\"/\">温暖</a> <a href=\"/\">阳光</a> <a href=\"/\">三星</a><a href=\"/\">索尼</a> <a href=\"/\">华维荣耀</a> <a href=\"/\">三星</a> <a href=\"/\">索尼</a>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"paihang\">\r\n");
      out.write("      <h2 class=\"hometitle\">点击排行</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><b><a href=\"/download/div/2015-04-10/746.jsp\" target=\"_blank\">【活动作品】柠檬绿兔小白个人博客模板30...</a></b>\r\n");
      out.write("          <p>展示的是首页html，博客页面布局格式简单，没有复杂的背景，色彩局部点缀，动态的幻灯片展示，切换卡，标...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2014-02-19/649.jsp\" target=\"_blank\"> 个人博客模板（2014草根寻梦）30...</a></b>\r\n");
      out.write("          <p>2014第一版《草根寻梦》个人博客模板简单、优雅、稳重、大气、低调。专为年轻有志向却又低调的草根站长设...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2013-08-08/571.jsp\" target=\"_blank\">黑色质感时间轴html5个人博客模板30...</a></b>\r\n");
      out.write("          <p>黑色时间轴html5个人博客模板颜色以黑色为主色，添加了彩色作为网页的一个亮点，导航高亮显示、banner图片...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2014-09-18/730.jsp\" target=\"_blank\">情侣博客模板系列之《回忆》Html30...</a></b>\r\n");
      out.write("          <p>Html5+css3情侣博客模板，主题《回忆》，使用css3技术实现网站动画效果，主题《回忆》,分为四个主要部分，...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2014-04-17/661.jsp\" target=\"_blank\">黑色Html5个人博客模板主题《如影随形》30...</a></b>\r\n");
      out.write("          <p>014第二版黑色Html5个人博客模板主题《如影随形》，如精灵般的影子会给人一种神秘的感觉。一张剪影图黑白...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/jstt/bj/2015-01-09/740.jsp\" target=\"_blank\">【匆匆那些年】总结个人博客经历的这四年…30...</a></b>\r\n");
      out.write("          <p>博客从最初的域名购买，到上线已经有四年的时间了，这四年的时间，有笑过，有怨过，有悔过，有执着过，也...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("    <div class=\"paihang\">\r\n");
      out.write("      <h2 class=\"hometitle\">站长推荐</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><b><a href=\"/download/div/2015-04-10/746.jsp\" target=\"_blank\">【活动作品】柠檬绿兔小白个人博客模板30...</a></b>\r\n");
      out.write("          <p>展示的是首页html，博客页面布局格式简单，没有复杂的背景，色彩局部点缀，动态的幻灯片展示，切换卡，标...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2014-02-19/649.jsp\" target=\"_blank\"> 个人博客模板（2014草根寻梦）30...</a></b>\r\n");
      out.write("          <p>2014第一版《草根寻梦》个人博客模板简单、优雅、稳重、大气、低调。专为年轻有志向却又低调的草根站长设...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2013-08-08/571.jsp\" target=\"_blank\">黑色质感时间轴html5个人博客模板30...</a></b>\r\n");
      out.write("          <p>黑色时间轴html5个人博客模板颜色以黑色为主色，添加了彩色作为网页的一个亮点，导航高亮显示、banner图片...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2014-09-18/730.jsp\" target=\"_blank\">情侣博客模板系列之《回忆》Html30...</a></b>\r\n");
      out.write("          <p>Html5+css3情侣博客模板，主题《回忆》，使用css3技术实现网站动画效果，主题《回忆》,分为四个主要部分，...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/download/div/2014-04-17/661.jsp\" target=\"_blank\">黑色Html5个人博客模板主题《如影随形》30...</a></b>\r\n");
      out.write("          <p>014第二版黑色Html5个人博客模板主题《如影随形》，如精灵般的影子会给人一种神秘的感觉。一张剪影图黑白...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><b><a href=\"/jstt/bj/2015-01-09/740.jsp\" target=\"_blank\">【匆匆那些年】总结个人博客经历的这四年…30...</a></b>\r\n");
      out.write("          <p>博客从最初的域名购买，到上线已经有四年的时间了，这四年的时间，有笑过，有怨过，有悔过，有执着过，也...</p>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"links\">\r\n");
      out.write("      <h2 class=\"hometitle\">友情链接</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"http://www.yangqq.com\" title=\"无涯个人博客\">无涯个人博客</a></li>\r\n");
      out.write("        <li><a href=\"http://www.yangqq.com\" title=\"无涯个人博客\">无涯个人博客</a></li>\r\n");
      out.write("        <li><a href=\"http://www.yangqq.com\" title=\"无涯个人博客\">无涯个人博客</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"weixin\">\r\n");
      out.write("      <h2 class=\"hometitle\">官方微信</h2>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <img src=\"images/wx.jpg\">\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</article>\r\n");
      out.write("<div class=\"blank\"></div>\r\n");
      out.write("<footer>\r\n");
      out.write("  <p>Design by <a href=\"/\">无涯个人博客</a> <a href=\"/\">蜀ICP备11002373号-1</a></p>\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"js/nav.js\"></script>\r\n");
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
}
