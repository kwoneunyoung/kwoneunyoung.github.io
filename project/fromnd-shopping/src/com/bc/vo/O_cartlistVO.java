package com.bc.vo;

public class O_cartlistVO {
	
	private int cart_id;
	private String userid;
	private String cart_product;
	private int cart_count;
	private int p_idx;
	private int c_num;
	private int s_idx;
	private String p_thumbnail;
	private String p_name;
	private String o_option;
	private int c_quantity;
	private int p_price;
	
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public int getC_quantity() {
		return c_quantity;
	}
	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCart_product() {
		return cart_product;
	}
	public void setCart_product(String cart_product) {
		this.cart_product = cart_product;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	public int getP_idx() {
		return p_idx;
	}
	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public int getS_idx() {
		return s_idx;
	}
	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
	}
	public String getP_thumbnail() {
		return p_thumbnail;
	}
	
	public void setP_thumbnail(String p_thumbnail) {
		this.p_thumbnail = p_thumbnail;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getO_option() {
		return o_option;
	}
	public void setO_option(String o_option) {
		this.o_option = o_option;
	}
	@Override
	public String toString() {
		return "O_cartlistVO [cart_id=" + cart_id + ", userid=" + userid + ", cart_product=" + cart_product
				+ ", cart_count=" + cart_count + ", p_idx=" + p_idx + ", c_num=" + c_num + ", s_idx=" + s_idx
				+ ", p_thumbnail=" + p_thumbnail + ", p_name=" + p_name + ", o_option=" + o_option + ", c_quantity="
				+ c_quantity + ", p_price=" + p_price + "]";
	}
	
	
}
