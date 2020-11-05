package com.bc.vo;

public class P_inquiryVO {
	private int i_idx;
	private int p_idx;
	private String userid;
	private int s_idx;
	private String i_category;
	private String i_content;
	private String i_answer;
	private String i_date;
	public int getI_idx() {
		return i_idx;
	}
	public void setI_idx(int i_idx) {
		this.i_idx = i_idx;
	}
	public int getP_idx() {
		return p_idx;
	}
	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
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
	public String getI_category() {
		return i_category;
	}
	public void setI_category(String i_category) {
		this.i_category = i_category;
	}
	public String getI_content() {
		return i_content;
	}
	public void setI_content(String i_content) {
		this.i_content = i_content;
	}
	public String getI_answer() {
		return i_answer;
	}
	public void setI_answer(String i_answer) {
		this.i_answer = i_answer;
	}
	public String getI_date() {
		return i_date;
	}
	public void setI_date(String i_date) {
		this.i_date = i_date;
	}
	@Override
	public String toString() {
		return "P_inquiryVO [i_idx=" + i_idx + ", p_idx=" + p_idx + ", userid=" + userid + ", s_idx=" + s_idx
				+ ", i_category=" + i_category + ", i_content=" + i_content + ", i_answer=" + i_answer + ", i_date="
				+ i_date + "]";
	}
	
	
}
