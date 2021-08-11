package com.tcs.abstraction;

public abstract class Staff {
	private String name;

	public void fillTimesheet() {// partial info
		System.out.println(name + " has filled time sheet");
	}

	public abstract void work();
}

class HR extends Staff {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("HR is Working");
	}
}

class Guard extends Staff {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Guard is Working");
	}

}