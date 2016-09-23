package com.psy.index.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psy.index.vo.CalcVO;

public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<CalcVO> calcList = new ArrayList<CalcVO>();
		calcList.add(new CalcVO(50, 60, 50+60));
		calcList.add(new CalcVO(60, 70, 60+70));
		calcList.add(new CalcVO(70, 80, 70+80));
		
		String viewPath = "/WEB-INF/view/calcList.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(viewPath);
		
		request.setAttribute("calcList", calcList);
		
		rd.forward(request, response);
	}

}
