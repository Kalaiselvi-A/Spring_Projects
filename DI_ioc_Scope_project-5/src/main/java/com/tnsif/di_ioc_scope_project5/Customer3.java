package com.tnsif.di_ioc_scope_project5;

import org.springframework.stereotype.Component;

@Component
public class Customer3 {
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
		System.out.println("Customer 3 object");
	}

}
