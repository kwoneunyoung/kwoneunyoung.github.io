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
               
               String amount = str.substring(35,47);
               int amount2=Integer.parseInt(amount);
               
               //String였던 시간으로 형변화
               String day = null;
               String day30 = null;
               SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss"); //뒤에 S붙이면 밀리세컨드까지 출력 가능
               Date to = transFormat.parse(time);
    
               Calendar cal = Calendar.getInstance();
               cal.setTime(to);
               day = transFormat.format(cal.getTime());
           
               hoaVO hoaVO1 = new hoaVO();
               hoaVO1.setNameCode(nameCode);
               hoaVO1.setTime(day);
               hoaVO1.setPrice(price);
               hoaVOList.add(hoaVO1);
            }
            
            for(int i=0; i<hoaVOList.size()-1; i++) {//파일을 다 읽어서 만든 리스트만큼 반복문을 돌림
                  if(hoaVOList.get(i).getNameCode().equals(hoaVOList.get(i+1).getNameCode())) {
                	tempList.add(hoaVOList.get(i));
                	} else {
                	  tempList.add(hoaVOList.get(i));
                  } //리스트에 담긴 상태(total값이 안 들어있음)
                  
                  //System.out.println(tempList.get(i));
            } 
            
            for(int i=0; i<hoaVOList.size()-1; i++) {
	            	
	            	String even=null;
	            	String start = tempList.get(i).getTime();
	            	
	            	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	            	Date time = dateFormat.parse(start);
	            	Calendar cal= Calendar.getInstance();
	            	cal.setTime(time);
	            	
	            	even = dateFormat.format(cal.getTime());
	            	
		            	if(cal.get(Calendar.MINUTE) <=30) { //시간(분)이 30분 보다 적거나 같을 때
		            		cal.set(Calendar.MINUTE, 00); //모든 분을 00으로 지정
		            		
		            		hoaVOList.get(i).setTotal(dateFormat.format(cal.getTime()));
		            		
		            
		            	} else { //30분을 벗어난 시간
		            		cal.set(Calendar.MINUTE, 30);
		            	
		            		hoaVOList.get(i+1).setTotal(dateFormat.format(cal.getTime()));
		            	}
            }
            
            
            Collections.sort(hoaVOList, new hoaVO()); //종목 > 새 시간 > 가격
           
           
            for(int i=0; i<hoaVOList.size()-1; i++) {
            	System.out.println(hoaVOList.get(i));
            	 //System.out.println(hoaVOList.get(i).getTotal());
                 
            }
 	

            
        } catch (Exception e) {
           e.printStackTrace();
           System.out.println("안열림ㅇㅅㅇ");
        }
 
    }




}
