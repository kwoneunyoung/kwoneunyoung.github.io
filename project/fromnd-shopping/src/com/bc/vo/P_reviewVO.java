package com.bc.vo;

public class P_reviewVO {
	private int r_idx;
	private int p_idx;
	private String userid;
	private int s_idx;
	private String r_size;
	private String r_colorsimiliarity;
	private String r_satisfaction;
	private String r_content;
	private String r_date;
	
	public int getR_idx() {
		return r_idx;
	}
	public void setR_idx(int r_idx) {
		this.r_idx = r_idx;
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
	public String getR_size() {
		return r_size;
	}
	public void setR_size(String r_size) {
		this.r_size = r_size;
	}
	public String getR_colorsimiliarity() {
		return r_colorsimiliarity;
	}
	public void setR_colorsimiliarity(String r_colorsimiliarity) {
		this.r_colorsimiliarity = r_colorsimiliarity;
	}
	public String getR_satisfaction() {
		return r_satisfaction;
	}
	public void setR_satisfaction(String r_satisfaction) {
		this.r_satisfaction = r_satisfaction;
	}
	
	public String getR_content() {
		return r_content;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	@Override
	public String toString() {
		return "P_reviewVO [r_idx=" + r_idx + ", p_idx=" + p_idx + ", userid=" + userid + ", s_idx=" + s_idx
				+ ", r_size=" + r_size + ", r_colorsimiliarity=" + r_colorsimiliarity + ", r_satisfaction="
				+ r_satisfaction + ", r_content=" + r_content + ", r_date=" + r_date + "]";
	}
	
}
