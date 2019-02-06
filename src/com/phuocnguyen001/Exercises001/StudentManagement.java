package com.phuocnguyen001.Exercises001;

import java.util.ArrayList;

public interface StudentManagement {

	public int getNoOfStudent();

	public int getNoOfStudent_byGender(String gender);

	public int getNoOfStudent_byMajor(String major);

	public int getNoOfStudent_byGPA(double gpa);

	public Student findStudent_byName(String name);

	public Student findStudent_byID(String id);

	public Student getHighestGPA_byGender(String gender);

	public Student getHighestGPA_byFName(String fname);

	public Student getHighestGPA_byMajor(String major);

	public ArrayList<Student> findStudent_byMajor(String major);

	public ArrayList<Student> findStudent_byGPA(double GPA);

	public double getAvgGPA();
	
	public ArrayList<Student> getLowestGPA();

}
