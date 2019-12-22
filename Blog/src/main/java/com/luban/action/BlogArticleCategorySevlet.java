package com.luban.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luban.po.BlogArticleCategory;
import com.luban.service.BlogArticleCategoryService;
import com.luban.service.impl.BlogArticleCategoryServiceImpl;
/**
 * BlogArticleCategorySevlet.java
 *describe:
 *2019 年 下午9:36:47
 *小张
 */
@WebServlet(urlPatterns = "*.abc")
public class BlogArticleCategorySevlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 处理编码
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 获取URI
		String uri = req.getRequestURI();
		// 载取
		String url = (String) uri.subSequence(uri.lastIndexOf("/") + 1,
				uri.lastIndexOf("."));
		System.out.println(url);
		// 1.创建业务层对象
		BlogArticleCategoryService bacServ = new BlogArticleCategoryServiceImpl();

		if ("queiry".equals(url)) {
			
			// 2.调用业务层方法
			List<BlogArticleCategory> list = bacServ.query();
			// 3.把对象存入request作用域中
			req.setAttribute("list", list);
			// 4.转发到blogClass.jsp
			req.getRequestDispatcher("blogClass.jsp").forward(req, resp);
			System.out.println("queiry");
		} else if ("delete".equals(url)) {
			//1获得请求参数
			Integer bacChildId = Integer.parseInt(req.getParameter("bacIdChild"));
			Integer bacParentId = Integer.parseInt(req.getParameter("bacParentId"));
			//2.调用业务层的删除方法
			int i = bacServ.delete(bacChildId,bacParentId);
			if(i>0){
				out.print("删除成功");
			}else{
				out.print("删除失败");
			}
			
			System.out.println("DELET");
		} else if ("update".equals(url)) {
			System.out.println("UPDATE");
		} else if ("findByID".equals(url)) {
			System.out.println("FINDbYID");
		} else if ("blogClassAddGo".equals(url)) {
			//2.调用业务层方法
			List<BlogArticleCategory> parentList = bacServ.queryParent();
			//3.把对象存入request作用域中 
			req.setAttribute("parentList", parentList);
			//4.转发到blogClass-add.jsp
			req.getRequestDispatcher("blogClass-add.jsp").forward(req, resp);
		} else if ("save".equals(url)) {
			//获取请求参数
			Integer parentId = Integer.parseInt(req.getParameter("parentId"));
			String className = req.getParameter("className");
			
			//把值存入对象中
			BlogArticleCategory articleCategory = new BlogArticleCategory();
			articleCategory.setBacParentId(parentId);
			articleCategory.setBacName(className);
			//调用业务层方法
			int i= bacServ.save(articleCategory);
			//转发到查询分类servlet
			if(i>0){
				out.print("<script type='text/javascript'>alert('添加成功');window.location.href='queiry.abc';</script>");
			}
		} 

	}
}
