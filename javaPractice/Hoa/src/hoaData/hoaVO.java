package hoaData;


import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class hoaVO implements Comparator <hoaVO>{

	private String nameCode;
	private String time;
	private String serialNumber;
	private String price;
	private String amount;
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
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "hoaVO [nameCode=" + nameCode + ", time=" + time + ", serialNumber=" + serialNumber + ", price=" + price
				+ ", amount=" + amount + ", total=" + total + "]";
	}

	@Override
	public int compare(hoaVO o1, hoaVO o2) {
		
		return o1.getTime().compareTo(o2.getTime());
	}




	
}
