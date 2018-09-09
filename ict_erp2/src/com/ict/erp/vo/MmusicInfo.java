package com.ict.erp.vo;

public class MmusicInfo {
	
	private int mcNum;
	private String mcName;
	private String mcSinger;
	private String mcVendor;
	private int mcLike;
	private int mcDisLike;
	private String mcCredat;
	private String mcDesc;
	

	public MmusicInfo() {}


	public MmusicInfo(int mcNum, String mcName, String mcSinger, String mcVendor, int mcLike, int mcDisLike,
			String mcCredat, String mcDesc) {
		super();
		this.mcNum = mcNum;
		this.mcName = mcName;
		this.mcSinger = mcSinger;
		this.mcVendor = mcVendor;
		this.mcLike = mcLike;
		this.mcDisLike = mcDisLike;
		this.mcCredat = mcCredat;
		this.mcDesc = mcDesc;
	}


	@Override
	public String toString() {
		return "MmusicInfo [mcNum=" + mcNum + ", mcName=" + mcName + ", mcSinger=" + mcSinger + ", mcVendor=" + mcVendor
				+ ", mcLike=" + mcLike + ", mcDisLike=" + mcDisLike + ", mcCredat=" + mcCredat + ", mcDesc=" + mcDesc
				+ "]";
	}


	public int getMcNum() {
		return mcNum;
	}


	public void setMcNum(int mcNum) {
		this.mcNum = mcNum;
	}


	public String getMcName() {
		return mcName;
	}


	public void setMcName(String mcName) {
		this.mcName = mcName;
	}


	public String getMcSinger() {
		return mcSinger;
	}


	public void setMcSinger(String mcSinger) {
		this.mcSinger = mcSinger;
	}


	public String getMcVendor() {
		return mcVendor;
	}


	public void setMcVendor(String mcVendor) {
		this.mcVendor = mcVendor;
	}


	public int getMcLike() {
		return mcLike;
	}


	public void setMcLike(int mcLike) {
		this.mcLike = mcLike;
	}


	public int getMcDisLike() {
		return mcDisLike;
	}


	public void setMcDisLike(int mcDisLike) {
		this.mcDisLike = mcDisLike;
	}


	public String getMcCredat() {
		return mcCredat;
	}


	public void setMcCredat(String mcCredat) {
		this.mcCredat = mcCredat;
	}


	public String getMcDesc() {
		return mcDesc;
	}


	public void setMcDesc(String mcDesc) {
		this.mcDesc = mcDesc;
	}
	
	
}
