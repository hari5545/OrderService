package com.orderItems.entity;

public class Form {
	protected String first_name;
	protected String middle_name;
	protected String last_name;
	protected String address;
	protected String itemName;
	protected int qty;
	protected String orderedby;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getOrderedby() {
		return orderedby;
	}
	public void setOrderedby(String orderedby) {
		this.orderedby = orderedby;
	}
	@Override
	public String toString() {
		return "Form [first_name=" + first_name + ", middle_name=" + middle_name + ", last_name=" + last_name
				+ ", address=" + address + ", itemName=" + itemName + ", qty=" + qty + ", orderedby=" + orderedby + "]";
	}
	
	
}
