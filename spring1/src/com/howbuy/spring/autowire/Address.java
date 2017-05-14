package com.howbuy.spring.autowire;

public class Address {
	private String street;
	private String room;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", room=" + room + "]";
	}

}
