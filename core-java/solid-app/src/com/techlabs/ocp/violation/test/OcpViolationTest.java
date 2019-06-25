package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.FestivalType;
import com.techlabs.ocp.violation.FixedDeposit;

public class OcpViolationTest {

	public static void main(String args[]) {
		FixedDeposit fd=new FixedDeposit(1,"abc",2000,2,FestivalType.NEWYEAR);
		System.out.println(fd.calculateSimpleInterest());
	}
}
