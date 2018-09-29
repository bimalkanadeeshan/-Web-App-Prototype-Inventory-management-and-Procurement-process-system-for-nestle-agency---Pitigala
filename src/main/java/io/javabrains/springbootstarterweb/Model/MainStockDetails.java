package io.javabrains.springbootstarterweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="main_stock_details")
public class MainStockDetails {
	
	@Id
	private int item_no;
	private String item;
	
	public MainStockDetails(int item_no, String item) {
		super();
		this.item_no = item_no;
		this.item = item;
	}
	
	@Override
	public String toString() {
		return "MainStockDetails [item_no=" + item_no + ", item=" + item + "]";
	}
	
	public int getItem_no() {
		return item_no;
	}
	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	

}
