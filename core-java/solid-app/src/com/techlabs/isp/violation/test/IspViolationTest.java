package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Manager;
import com.techlabs.isp.violation.Robot;

public class IspViolationTest {

	public static void main(String args[]) {
		atWorkStation(new Manager());
		atCafeteria(new Manager());
		atWorkStation(new Robot());
		atCafeteria(new Robot());
	}
	
	public static void atWorkStation(IWorker w) {
		System.out.println("at the workstation");
		w.startWork();
		w.stopWork();
	}
	public static void atCafeteria(IWorker w) {
		System.out.println("at the cafeteria");
		w.startEat();
		w.stopEat();
	}	
}
