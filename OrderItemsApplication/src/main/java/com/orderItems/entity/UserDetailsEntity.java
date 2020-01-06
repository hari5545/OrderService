package com.orderItems.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetail")
public class UserDetailsEntity implements Serializable {
	
	private static final long serialVersionUID = 6107030955363124530L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	protected String first_name;
	protected String last_name;
	protected String middle_name;
	protected String address;

	/*
	 * @OneToMany(mappedBy = "userDetailsEntity", cascade = CascadeType.ALL)
	 * protected List<OrderDetailsEntity> orderdetails;
	 */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDetailsEntity [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", middle_name=" + middle_name + ", address=" + address + "]";
	}


}
