package hoaData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class fileRead {

   public static void main(String[] args) {
        
        try {
            
            File file = new File("resource/HOADA.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            ArrayList<hoaVO> hoaVOList = new ArrayList<hoaVO>();
            ArrayList<hoaVO> tempList = new ArrayList<hoaVO>(); //임시리스트
            ArrayList<hoaVO> tempPriceList = new ArrayList<hoaVO>();
            
            String line = "";
            while((line = bufferedReader.readLine())!=null ) {
            	
               String str = line;
               String time = str.substring(0,15);
               String nameCode = str.substring(15,21);
               String serialNumber = str.substring(21,26);
               
               String price = str.substring(26,35);
               int price2=Integer.parseInt(price);
               //String price3 = Integer.toString(price2);
               
               String amount = str.substring(35,47);
               int amount2=Integer.parseInt(amount);
               //String amount3 = Integer.toString(amount2);
               
               //System.out.println("시간 : " + time +" 종목코드 :" + nameCode + " 일련번호 : " + serialNumber + " 가격 : " + price2 +" 수량 : " + amount2);
               
               //String였던 시간으로 형변화
               String day = null;
               String day30 = null;
               SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss"); //뒤에 S붙이면 밀리세컨드까지 출력 가능
               Date to = transFormat.parse(time);
               
               //파일 시간 --Thu Jan 01 14:50:13 KST 1970
               //System.out.println(to);
               
               Calendar cal = Calendar.getInstance();
               cal.setTime(to);
               day = transFormat.format(cal.getTime());
               
               //30분 더하기
               //cal.add(Calendar.MINUTE, 30);
               //day30=transFormat.format(cal.getTime());
               //System.out.println("30분씩" + day30);
               
               hoaVO hoaVO1 = new hoaVO();
               hoaVO1.setNameCode(nameCode);
               hoaVO1.setTime(day);
               hoaVO1.setSerialNumber(serialNumber);
               hoaVO1.setPrice(price);
               hoaVO1.setAmount(amount);
               hoaVOList.add(hoaVO1);
            }
            
            Collections.sort(tempList, new hoaVO()); //종목별 정렬
            for(int i=0; i<hoaVOList.size()-1; i++) {//파일을 다 읽어서 만든 리스트만큼 반복문을 돌림
            	
                  if(hoaVOList.get(i).getNameCode().equals(hoaVOList.get(i+1).getNameCode())) {
                	tempList.add(hoaVOList.get(i));
                	} else {
                	  tempList.add(hoaVOList.get(i));
                  } //리스트에 담긴 상태
                  //System.out.println(tempList.get(i));
            } 
            
            
            for(int i=0; i<tempList.size()-1; i++) {
	            	Collections.sort(tempList, new hoaVO()); //시간별 정렬 
	            	
	            	hoaVO hoaVO1 = new hoaVO();
	            	String even=null;
	            	String start = tempList.get(i).getTime();
	            	
	            	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	            	Date time = dateFormat.parse(start);
	            	Calendar cal= Calendar.getInstance();
	            	cal.setTime(time);
	            	
	            	even = dateFormat.format(cal.getTime());
	            	
		            	if(cal.get(Calendar.MINUTE) <=30) { //시간(분)이 30분 보다 적거나 같을 때
		            		cal.set(Calendar.MINUTE, 00);
		            		hoaVO1.setTotal(dateFormat.format(cal.getTime()));
		            		hoaVOList.add(hoaVO1);
		            		System.out.println(hoaVO1);
		            		//System.out.println(dateFormat.format(cal.getTime()));
		            		
		            	} else { //30분을 벗어난 시간
		            		cal.set(Calendar.MINUTE, 30);
		            		hoaVO1.setTotal(dateFormat.format(cal.getTime()));
		            		hoaVOList.add(hoaVO1);
		            		//System.out.println(dateFormat.format(cal.getTime()));
		            	}
		            		System.out.println(hoaVO1.getTotal());
		            	}
	         
            	
            	//System.out.println(tempList.get(i).getNameCode() + " "+even + " " +tempList.get(i).getPrice()); //시간 오름 차순 정렬 되어있는 상태
//            	System.out.println(even);
//            	System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //시간 가져왔음
//            	System.out.println(cal.get(Calendar.MINUTE)); //분 가져왔음
//            	System.out.println(cal.get(Calendar.SECOND)); //분 가져왔음
            	
           
            
           int firstPrice; //처음 거래 가격
           int lastPrice; //마지막 거래 가격
           int lowPirce; //최저가
           int highPrice; //최고가
        
            
        } catch (Exception e) {
           e.printStackTrace();
           System.out.println("안열림ㅇㅅㅇ");
        }
 
    }




}
