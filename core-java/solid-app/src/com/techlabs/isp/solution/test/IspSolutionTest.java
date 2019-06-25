package com.techlabs.isp.solution.test;

import com.techlabs.isp.soln.IEat;
import com.techlabs.isp.soln.IWork;
import com.techlabs.isp.soln.IWorkEat;
import com.techlabs.isp.soln.Manager;
import com.techlabs.isp.soln.Robot;

public class IspSolutionTest {

	public static void main(String args[]) {
		atWorkStation(new Manager());
		atCafeteria(new Manager());
		atWorkStation(new Robot());
	}
	
	public static void atWorkStation(IWork w) {
		System.out.println("at the workstation");
		w.startWork();
		w.stopWork();
	}
	public static void atCafeteria(IEat w) {
		System.out.println("at the cafeteria");
		w.startEat();
		w.stopEat();
	}
}
