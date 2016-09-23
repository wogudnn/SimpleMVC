package com.psy.index.biz;

import java.util.List;

import com.psy.index.vo.NewsVO;

public interface NewsBiz {

	public List<NewsVO> getAllNewsesOF(int categoryId);
	
	public boolean addNewNews(NewsVO news);
	
	public NewsVO getNewsAt(int newsId);
	
	public boolean deleteNewsAt(int newsId);
	
}
