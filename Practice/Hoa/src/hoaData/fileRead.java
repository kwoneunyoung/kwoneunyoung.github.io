package hoaData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class fileRead {

	public static void main(String[] args) {
	      BufferedReader bufferedReader = null;
	      
	        try {
	            
	            File file = new File("resource/HOADA.txt");
	            FileReader fileReader = new FileReader(file);
	            bufferedReader = new BufferedReader(fileReader);

	            ArrayList<hoaVO> hoaVOList = new ArrayList<hoaVO>();
	            
	            String line = "";
	            while((line = bufferedReader.readLine())!=null ) {
	               
	               String str = line;
	               String time = str.substring(0,15);
	               String nameCode = str.substring(15,21);
	               
	               int price = Integer.parseInt(str.substring(26,35));
	         
	               //String였던 시간으로 형변화
	               String day = null;
	               SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss"); //뒤에 S붙이면 밀리세컨드까지 출력 가능
	               Date to = transFormat.parse(time);
	    
	               Calendar cal = Calendar.getInstance();
	               cal.setTime(to);
	               day = transFormat.format(cal.getTime());
	           
	               hoaVO info = new hoaVO();
	               info.setNameCode(nameCode);
	               info.setTime(day);
	               info.setPrice(price);
	               
	               SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
	               if(cal.get(Calendar.MINUTE) <=30) { //시간(분)이 30분 보다 적거나 같을 때
	                   cal.set(Calendar.MINUTE, 00); //모든 분을 00으로 지정
	                   
	                   info.setTotal(dateFormat.format(cal.getTime()));
	                   
	             
	                } else { //30분을 벗어난 시간
	                   cal.set(Calendar.MINUTE, 30);
	                
	                   info.setTotal(dateFormat.format(cal.getTime()));
	                }
	               
	               hoaVOList.add(info);
	               
	            }
	            
	            
	            Collections.sort(hoaVOList); //종목 > 새 시간 > 가격
	            
	            ArrayList<hoaVO> tempList = new ArrayList<hoaVO>();
	            
	            for(int i=1; i<hoaVOList.size()-1; i++) {
	               
	               hoaVO beforeVO = hoaVOList.get(i-1);
	               hoaVO currentVO = hoaVOList.get(i);
	               
	              if(i==1) {
	                 tempList.add(hoaVOList.get(0));
	              }
	               
	               if(tempList.size() > 0) {
	                  if(!(beforeVO.getTotal().equals(currentVO.getTotal()) && beforeVO.getNameCode().equals(currentVO.getNameCode()))) {
	                     System.out.println(tempList.get(0).getNameCode() + "의 " + tempList.get(0).getTotal() + " 최저가 : " + tempList.get(0).getPrice());
	                     System.out.println(tempList.get(0).getNameCode() + "의 " + tempList.get(0).getTotal() + " 최고가 : " + tempList.get(tempList.size()-1).getPrice());
	                     tempList.clear();
	                     tempList.add(hoaVOList.get(i));
	                  }
	               }
	               
	               if(beforeVO.getTotal().equals(currentVO.getTotal()) && beforeVO.getNameCode().equals(currentVO.getNameCode())) {
	                 tempList.add(hoaVOList.get(i));           
	               }
	               
	            } 
	            
	           
	        } catch (Exception e) {
	           e.printStackTrace();
	           System.out.println("안열림ㅇㅅㅇ");
	        }
	 
	    }




	}