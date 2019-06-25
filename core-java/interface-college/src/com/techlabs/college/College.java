package com.techlabs.college;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class College {

		private List students;
		private List professors;
		private static int totalStudents=0;
		
		public College() {
			students=new LinkedList();
			professors=new LinkedList();
		}
		
		public void addStudents(Student s) {
			//for(int i=0;i<s.length;i++) {
					students.add(s);
					totalStudents++;
			//}
		}
		public void addProfessor(Professor[] p) {
			for(int i=0;i<p.length;i++) {
				professors.add(p[i]);
			}
		}
		public List getStudents() {
			return students;
		}
		public List getProfessors() {
			return professors;
		}
		public int totalStudents() {
			return totalStudents;
		}
}
