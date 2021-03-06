package com.luban.dao;

import java.util.List;

import com.luban.po.BlogArticleCategory;

/**
 * BlogArticleCategoryDao.java
 *describe:
 *2019 年 上午8:08:56
 *小张
 */
public interface BlogArticleCategoryDao {

	/**
	 * 查询 文章分类信息
	 * @return List<BlogArticleCategory>
	 */
	public List<BlogArticleCategory> query();
	
	
	
	/**
	 * 添加文章分类
	 * @param articleCategory
	 * @return int
	 */
	public int save(BlogArticleCategory articleCategory);
	
	
	/**
	 * 查询父分类
	 * @return
	 */
	public List<BlogArticleCategory> queryParent();
	
	
	
	
	/**
	 * 根据id查询分类信息
	 */
	public BlogArticleCategory findById(int id);
	
	
	
	/**
	 * 
	 * 修改
	 */
	public int update(BlogArticleCategory articleCategory);
	
	
	
	
	/**
	 * 删除  
	 * 1.删除分类信息的时候必需 通过 id去查询文章信息
	 */
	public int delete(int bacChildId, int bacParentId);
	
}
