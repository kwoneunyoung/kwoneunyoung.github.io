package com.bc.vo;

public class P_boardVO {
	private int p_idx;
	private int c_num;
	private String sellerid;
	private int s_idx;
	private String p_name;
	private int p_price;
	private String p_content;
	private String p_image;
	private int p_discount;
	private String p_date;
	
	@Override
	public String toString() {
		return "P_boardVO [p_idx=" + p_idx + ", c_num=" + c_num + ", sellerid=" + sellerid + ", s_idx=" + s_idx
				+ ", p_name=" + p_name + ", p_price=" + p_price + ", p_content=" + p_content + ", p_image=" + p_image
				+ ", p_discount=" + p_discount + ", p_date=" + p_date + ", p_thumbnail=" + p_thumbnail + "]";
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
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public int getS_idx() {
		return s_idx;
	}
	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public String getP_image() {
		return p_image;
	}
	public void setP_image(String p_image) {
		this.p_image = p_image;
	}
	public int getP_discount() {
		return p_discount;
	}
	public void setP_discount(int p_discount) {
		this.p_discount = p_discount;
	}
	public String getP_date() {
		return p_date;
	}
	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
	public String getP_thumbnail() {
		return p_thumbnail;
	}
	public void setP_thumbnail(String p_thumbnail) {
		this.p_thumbnail = p_thumbnail;
	}
	private String p_thumbnail;
	
}
