package com.tcs.interfacedemo;

public interface IStaff {
	int count = 10; // static and final
	// Interface used to implement the contract
	// method cannot be private or protected

	void work();// abstract,public are implicit

	abstract void test1();
}
