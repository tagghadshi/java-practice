package com.tcs.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		IStaff staff = new Guard();
		staff.work();
		IStaff staff1 = new HR();
		List<IStaff> allStaff = new ArrayList<IStaff>();
		allStaff.add(staff);
		allStaff.add(staff1);
		allStaff.add(staff1);
		System.out.println(allStaff.size());
//		Staff s = new Staff();//Not allowed
	}
}
