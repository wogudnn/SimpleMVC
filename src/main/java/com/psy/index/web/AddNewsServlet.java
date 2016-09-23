package com.psy.index.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psy.index.biz.NewsBiz;
import com.psy.index.biz.NewsBizImpl;
import com.psy.index.vo.NewsVO;

public class AddNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsBiz biz;
   
	public AddNewsServlet() {
        super();
        biz = new NewsBizImpl();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String subJect = request.getParameter("subject");
		String content = request.getParameter("content");
		
		NewsVO news = new NewsVO();
		news.setSubject(subJect);
		news.setContents(content);
		news.setCategoryId(20);
		news.setJournalistId(13);
		
		biz.addNewNews(news);
		
		response.sendRedirect("/SimpleMVC/news");
	}

}
