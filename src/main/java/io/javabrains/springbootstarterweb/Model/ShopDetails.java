package io.javabrains.springbootstarterweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_details")
public class ShopDetails {
	
	@Id
	private int shop_id;
	private String name;
	private float longtitude;
	private float latitude;
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(float longtitude) {
		this.longtitude = longtitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public ShopDetails(String name, float longtitude, float latitude) {
		super();
		this.name = name;
		this.longtitude = longtitude;
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "ShopDetails [shop_id=" + shop_id + ", name=" + name + ", longtitude=" + longtitude + ", latitude="
				+ latitude + "]";
	}
	
	

}
