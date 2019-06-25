package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.FixedDeposit;
import com.techlabs.ocp.solution.Holi;

public class OcpSolutionTest {

	public static void main(String args[]) {
	Holi holi=new Holi();
	FixedDeposit fd=new FixedDeposit(1,"abc",2000,2,holi);
	System.out.println(fd.calculateSimpleInterest());
	}
}
