package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testV {
	public static void main(String[] args) {
		String today = null;
		 
		 
		Date date = new Date();
		 
		System.out.println(date);
		 
		// 포맷변경 ( 년월일 시분초)
		SimpleDateFormat sdformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); 
		 
		// Java 시간 더하기
		 
		Calendar cal = Calendar.getInstance();
		 
		cal.setTime(date);
		 
		today = sdformat.format(cal.getTime());  
		System.out.println("지금 : " + today);
		 
		// 3분 더하기
		cal.add(Calendar.MINUTE, 3);
		 
		today = sdformat.format(cal.getTime());  
		System.out.println("3분전 : " + today);
		 
		cal.setTime(date);
		// 1시간 전
		cal.add(Calendar.HOUR, -1);
		 
		today = sdformat.format(cal.getTime());  
		System.out.println("1시간 전 : " + today);
		 
		cal.setTime(date);
		// 하루 전
		cal.add(Calendar.DATE, -1);
		 
		today = sdformat.format(cal.getTime());  
		System.out.println("1일 전 : " + today);
	}
}
