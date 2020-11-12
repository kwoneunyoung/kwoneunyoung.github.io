package com.bc.vo;

public class P_optionVO {
	private int p_inx;
	private String o_name;
	private String o_price;
	private String o_size;
	private int c_num;
	private String userid;
	
	public int getP_inx() {
		return p_inx;
	}
	public void setP_inx(int p_inx) {
		this.p_inx = p_inx;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getO_price() {
		return o_price;
	}
	public void setO_price(String o_price) {
		this.o_price = o_price;
	}
	public String getO_size() {
		return o_size;
	}
	public void setO_size(String o_size) {
		this.o_size = o_size;
	}
	public int getC_num() {
		return c_num;
	}
	
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "P_optionVO [p_inx=" + p_inx + ", o_name=" + o_name + ", o_price=" + o_price + ", o_size=" + o_size
				+ ", c_num=" + c_num + ", userid=" + userid + "]";
	}



}
