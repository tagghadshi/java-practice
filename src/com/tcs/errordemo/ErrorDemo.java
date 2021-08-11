package com.tcs.errordemo;

public class ErrorDemo {
	public static void main(String[] args) {
		new ErrorDemo().infiniteLoop();
	}
	
	public void infiniteLoop() {
//		try {
			infiniteLoop();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
