package com.psy.index.biz;

import java.util.List;

import com.psy.index.dao.NewsDao;
import com.psy.index.dao.NewsDaoImpl;
import com.psy.index.vo.NewsVO;

public class NewsBizImpl implements NewsBiz {

	private NewsDao dao;
	
	public NewsBizImpl() {
		dao = new NewsDaoImpl();
	}
	
	
	@Override
	public List<NewsVO> getAllNewsesOF(int categoryId) {
		return dao.getNewsesOf(categoryId);
	}

	@Override
	public boolean addNewNews(NewsVO news) {
		return dao.addNewNews(news);
	}

	@Override
	public NewsVO getNewsAt(int newsId) {
		dao.updateRecommendCount(newsId);
		return dao.getNewsAt(newsId);
	}

	@Override
	public boolean deleteNewsAt(int newsId) {
		dao.deleteNews(newsId);
		return true;
	}

}
