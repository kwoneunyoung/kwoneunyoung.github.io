package hoaData;


import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class hoaVO implements Comparator <hoaVO> {

	private String nameCode;
	private String time;
	//private String serialNumber;
	private String price;
	//private String amount;
	private String total;

	public String getTotal() {
		return total;
	}
	public void setTotal(String even) {
		this.total = even;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNameCode() {
		return nameCode;
	}
	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	
//	@Override
//	public int compare(hoaVO o1, hoaVO o2) {
//		
//		return o1.getTime().compareTo(o2.getTime());
//	}



	
	@Override
	public int compare(hoaVO o1, hoaVO o2) {
		int ret =0;
	
		if(o1.nameCode == o2.nameCode) { //종목코드가 같으면
			if(o1.total.compareTo(o2.total)==0) { //시간이 같으면
				
			} else if(o1.total.compareTo(o2.total) < 0) {
				ret = -1;
			} else if(o1.total.compareTo(o2.total) > 0) {
				ret= 1;
			}

			if(o1.nameCode != o2.nameCode) { //종목코드가 다르면 오름차순
				ret = -1;
			}
			
		}
		return ret;
	}
	@Override
	public String toString() {
		return "hoaVO [nameCode=" + nameCode + ", price=" + price + ", total=" + total + "]";
	}
//	@Override
//	public String toString() {
//		return "hoaVO [nameCode=" + nameCode + ", time=" + time + ", price=" + price + ", total=" + total + "]";
//	}

	
}
