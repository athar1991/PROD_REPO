package com.ahss.model;

public class ProductModel {
	
	private int pid;
	private String pcode;
	private double pcost;
	public ProductModel() {
		super();
	}
	public ProductModel(int pid, String pcode, double pcost) {
		super();
		this.pid = pid;
		this.pcode = pcode;
		this.pcost = pcost;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "ProductModel [pid=" + pid + ", pcode=" + pcode + ", pcost=" + pcost + "]";
	}
	
}
