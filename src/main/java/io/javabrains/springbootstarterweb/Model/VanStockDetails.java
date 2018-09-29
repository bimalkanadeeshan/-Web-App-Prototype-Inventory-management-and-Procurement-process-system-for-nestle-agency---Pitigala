package io.javabrains.springbootstarterweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="van_stock_details")
public class VanStockDetails {
	
	@Id
	private int van_no;
	private String van;
	
	public int getVan_no() {
		return van_no;
	}
	public void setVan_no(int van_no) {
		this.van_no = van_no;
	}
	public String getVan() {
		return van;
	}
	public void setVan(String van) {
		this.van = van;
	}
	
	public VanStockDetails(int van_no, String van) {
		super();
		this.van_no = van_no;
		this.van = van;
	}
	
	@Override
	public String toString() {
		return "VanStockDetails [van_no=" + van_no + ", van=" + van + "]";
	}
	
	

}
