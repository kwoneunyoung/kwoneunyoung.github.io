package com.bc.vo;

public class O_OrderVO {
	private int o_num;
	private String userid;
	private int s_idx;
	private int p_idx;
	private String o_product;
	private String o_place;
	private String o_order;
	private String o_account;
	private String o_pay;
	private String o_date;
	private String o_con;
	
	public int getO_num() {
		return o_num;
	}
	public void setO_num(int o_num) {
		this.o_num = o_num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getS_idx() {
		return s_idx;
	}
	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
	}
	public int getP_idx() {
		return p_idx;
	}
	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}
	public String getO_product() {
		return o_product;
	}
	public void setO_product(String o_product) {
		this.o_product = o_product;
	}
	public String getO_place() {
		return o_place;
	}
	public void setO_place(String o_place) {
		this.o_place = o_place;
	}
	public String getO_order() {
		return o_order;
	}
	public void setO_order(String o_order) {
		this.o_order = o_order;
	}
	public String getO_account() {
		return o_account;
	}
	public void setO_account(String o_account) {
		this.o_account = o_account;
	}
	public String getO_pay() {
		return o_pay;
	}
	public void setO_pay(String o_pay) {
		this.o_pay = o_pay;
	}
	public String getO_date() {
		return o_date;
	}
	public void setO_date(String o_date) {
		this.o_date = o_date;
	}
	public String getO_con() {
		return o_con;
	}
	public void setO_con(String o_con) {
		this.o_con = o_con;
	}
	@Override
	public String toString() {
		return "O_OrderVO [o_num=" + o_num + ", userid=" + userid + ", s_idx=" + s_idx + ", p_idx=" + p_idx
				+ ", o_product=" + o_product + ", o_place=" + o_place + ", o_order=" + o_order + ", o_account="
				+ o_account + ", o_pay=" + o_pay + ", o_date=" + o_date + ", o_con=" + o_con + "]";
	}
	
	
	
}
