package com.techlabs.collection.set;

import java.util.Comparator;

public class SortByStd implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return ((Integer)o1.getStandard()).compareTo(o2.getStandard());
	}

}
