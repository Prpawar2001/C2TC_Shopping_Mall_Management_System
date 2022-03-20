package com.cg.smms.exception;

public class OrderCancelException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public OrderCancelException(String str) {
		super(str);
	}
}
