package com.phuocnguyen001.Exercises001;

public class Main {

	public static void main(String[] args) {

		StudentManagementImpl studentManagementImpl = new StudentManagementImpl("testcase.txt");
		System.out.println(studentManagementImpl.getNoOfStudent());
		System.out.println(studentManagementImpl.getNoOfStudent_byGender("male"));
		System.out.println(studentManagementImpl.getNoOfStudent_byMajor("Information System"));
		System.out.println(studentManagementImpl.getNoOfStudent_byGPA(4));
		System.out.println(studentManagementImpl.findStudent_byName("Lindsy Pugsley").toString());
		System.out.println(studentManagementImpl.findStudent_byID("51009070").toString());
		System.out.println(studentManagementImpl.findStudent_byMajor("Computational Intelligent").size());
		System.out.println(studentManagementImpl.findStudent_byGPA(4).size());
		System.out.println(studentManagementImpl.getHighestGPA_byGender("male").toString());
		System.out.println(studentManagementImpl.getHighestGPA_byFName("Ardella").toString());
		System.out.println(studentManagementImpl.getHighestGPA_byMajor("Information System").toString());
		System.out.println(studentManagementImpl.getAvgGPA());
		System.out.println(studentManagementImpl.getLowestGPA().size());
		System.out.println(studentManagementImpl.getLowestGPA().toString());
	}

}
