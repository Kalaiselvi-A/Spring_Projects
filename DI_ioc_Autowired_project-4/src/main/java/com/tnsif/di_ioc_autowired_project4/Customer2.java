package com.tnsif.di_ioc_autowired_project4;

import org.springframework.stereotype.Component;

@Component
public class Customer2 {
	private int c_id;
	private String c_name;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	public void show() {
		System.out.println("Customer 2 object");
	}

}
