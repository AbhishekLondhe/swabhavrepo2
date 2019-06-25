package com.techlabs.presentation;

import com.techlabs.business.EmployeeDTO;
import com.techlabs.dataaccess.DiskLoader;
import com.techlabs.hierarchy.HierarchyBuilder;
import com.techlabs.hierarchy.HierarchyMap;
import com.techlabs.hierarchy.XmlHierarchy;

public class HierarchyTest {

	public static void main(String args[]) {
		
		
		DiskLoader dl=new DiskLoader();
		HierarchyBuilder hb=new HierarchyBuilder(dl);
		hb.displayHierarchy();
		
		//DiskLoader dl=new DiskLoader();
		//XmlHierarchy hb=new XmlHierarchy(dl);
		//hb.displayHierarchy();
		//hb.writing();
		//HierarchyMap mapTest=new HierarchyMap(new DiskLoader());
		//mapTest.addEmployee();
		//mapTest.displayEmployee();
		//mapTest.addReportee();
	}
}
