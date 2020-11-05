package com.bc.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bc.model.dao.ProductDAO;


public class loginChkCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("id");
		String password = request.getParameter("password");
		
		
		System.out.println("userid : " + userid + ", password : " + password);
		
		Map<String, String> map = new HashMap<>();
		map.put("userid", userid);
		map.put("password", password);
		System.out.println("map"+map); 
		
		System.out.println("key 출력>>>" + map.keySet()); 
		System.out.println("value 출력>>>" + map.values());
		System.out.println("키벨류 출력>>>" + map.toString());
		
		
		String result= ProductDAO.loginChk(map);
		System.out.println("result:"+result); 
		
		request.setAttribute("result", result);
		request.setAttribute("userid", userid);
		request.setAttribute("password", password);
		return "common/loginAction.jsp";
	}

}
