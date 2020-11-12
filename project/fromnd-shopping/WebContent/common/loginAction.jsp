<%@page import="java.io.PrintWriter"%>
<%@page import="com.bc.model.dao.ProductDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


	String userid = (String)request.getAttribute("userid");
	String password= (String)request.getAttribute("password");
	String result = (String)request.getAttribute("result");
	
	
	if(result==null) { //아이디가 없으면
		
        PrintWriter script = response.getWriter();

        script.println("<script>");
        script.println("alert('아이디가 없습니다.')");
        script.println("history.back()");
        script.println("</script>");
        out.flush();
        
	} else {
		session.setAttribute("userid", userid);
		PrintWriter script = response.getWriter();

        script.println("<script>");
        script.println("location.href='01.main.jsp'");
        script.println("</script>");
	}
%>