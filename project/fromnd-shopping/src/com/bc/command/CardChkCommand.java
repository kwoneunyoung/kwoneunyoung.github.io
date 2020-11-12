package com.bc.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.model.dao.ProductDAO;

public class CardChkCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cardNum1 = request.getParameter("cardNum1");
		String cardNum2 = request.getParameter("cardNum2");
		String cardNum3 = request.getParameter("cardNum3");
		String cardNum4 = request.getParameter("cardNum4");
		String cardNum = cardNum1+"-"+cardNum2+"-"+cardNum3+"-"+cardNum4;
		String cardPw = request.getParameter("cardPw");
		
		Map<String, String> map = new HashMap<>();
		map.put("cardNum", cardNum);
		map.put("cardPw", cardPw);
		
		int result = ProductDAO.cardChk(map);
		
		System.out.println("결과값 : " + result);
		
		
	
		String userid = request.getParameter("userid");
		String insertName = request.getParameter("insertName");
		String a_address1 = request.getParameter("addr1");
		String a_address2 = request.getParameter("addr2");
		
		String a_address = a_address1 + " " + a_address2;
		
		String a_email1 = request.getParameter("email1");
		String a_email2 = request.getParameter("email2");
		
		String a_email = a_email1 + "@" + a_email2;
		
		String a_phone1 = request.getParameter("phone1");
		String a_phone2 = request.getParameter("phone2");
		String a_phone3 = request.getParameter("phone3");
		
		String a_phone = a_phone1 + "-" + a_phone2 + "-" + a_phone3;
		
		String a_message = request.getParameter("message");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("userid", userid);
		map2.put("a_address", a_address);
		map2.put("a_email", a_email);
		map2.put("a_phone", a_phone);
		map2.put("a_message", a_message);
		map2.put("insertName", insertName);
		
		System.out.println("값 확인 : " + map);
		
		int result2 = ProductDAO.insertArrive(map2);
		
		System.out.println("insert된 값 확인 : " + result2);
		
		return "25.Shop_cart3.jsp";
	}

}
