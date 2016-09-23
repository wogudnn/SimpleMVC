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


public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public IndexServlet() {
        super();
      
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numberOne = Integer.parseInt(request.getParameter("n1"));
		int numberTwo = Integer.parseInt(request.getParameter("n2"));
		
		//JSP에 전달할 값
		int result = numberOne + numberTwo;
		
		CalcVO calc = new CalcVO(numberOne, numberTwo, result);
		List<CalcVO> calcList = new ArrayList<CalcVO>();
		calcList.add(new CalcVO(10,20,10+20));
		calcList.add(new CalcVO(50,60,50+60));
		calcList.add(new CalcVO(20,70,20+70));
		
		
		String viewPath = "/WEB-INF/view/index.jsp";
		
		//Forward 처리를 할 수 있는 객체를 생성한다.
		RequestDispatcher rd = request.getRequestDispatcher(viewPath);
		
		// JSP에 데이터를 전당한다
		
		request.setAttribute("name", "이재형");
		request.setAttribute("result", result);
		request.setAttribute("calc", calc);
		request.setAttribute("calcList", calcList);
		
		//view를 포워드 한다.
		rd.forward(request, response);
		
		
	}

}
