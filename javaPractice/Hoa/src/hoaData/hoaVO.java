package hoaData;



public class hoaVO implements Comparable<hoaVO> {

	private String nameCode;
	private String time;
	private int price;
	private String total;

	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
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

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}





	

	@Override
	public String toString() {
		return "hoaVO [nameCode=" + nameCode + ", price=" + price + ", total=" + total + "]";
	}

	@Override
	public int compareTo(hoaVO o) {
		
	     if(!this.nameCode.equals(o.nameCode)) {
	         return (this.nameCode.compareTo(o.nameCode));
	      }
	      
	     if(!this.total.equals(o.getTotal())) {
	    	 return (this.total.compareTo(o.total));
	      }

	      if(price > o.getPrice()) {
	          return 1;
	       }else {
	          return -1;
	       }
	       
	    }


	}
	



	

