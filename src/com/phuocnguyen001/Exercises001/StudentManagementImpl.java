package com.phuocnguyen001.Exercises001;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class StudentManagementImpl implements StudentManagement {

	ArrayList<Student> students;

	public StudentManagementImpl() {
		this.students = new ArrayList<>();
	}

	public StudentManagementImpl(String dataPath) {
		this.students = new ArrayList<>();
		readData(dataPath);
	}

	private void readData(String filePath) {
		try {
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));

			String readLine;
			while ((readLine = br.readLine()) != null) {
				String[] info = readLine.split("\t");
				Student s = new Student(info[0], info[1], info[2], Double.parseDouble(info[3]), info[4]);
				this.students.add(s);
			}

			br.close();
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
	}

	@Override
	public int getNoOfStudent() {
		int count = 0;
		for (int i = 0; i < students.size(); i++) {
			count++;
		}
		return count;
	}

	@Override
	public int getNoOfStudent_byGender(String gender) {
		int count = 0;
		for (int i = 0; i < students.size(); i++) {
			if (gender.equals(students.get(i).getGender())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int getNoOfStudent_byMajor(String major) {
		int count = 0;
		for (int i = 0; i < students.size(); i++) {
			if (major.equals(students.get(i).getMajor())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int getNoOfStudent_byGPA(double gpa) {

		int count = 0;
		for (int i = 0; i < students.size(); i++) {
			if (gpa > students.get(i).getGpa()) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Student findStudent_byName(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (name.equals(students.get(i).getName())) {
				return students.get(i);
			}
		}
		return null;
	}

	@Override
	public Student findStudent_byID(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (id.equals(students.get(i).getId())) {
				return students.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Student> findStudent_byMajor(String major) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getMajor().trim().equalsIgnoreCase(major)) {
				studentList.add(students.get(i));
			}
		}

		return studentList;

	}

	@Override
	public ArrayList<Student> findStudent_byGPA(double GPA) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getGpa() < GPA) {
				studentList.add(students.get(i));
			}
		}

		return studentList;
	}

	@Override
	public double getAvgGPA() {
		int count = 0;
		double average = 0;
		double rounding = 0;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		for (int i = 0; i < students.size(); i++) {
			average += students.get(i).getGpa();
			count++;
		}
		rounding = Double.valueOf(decimalFormat.format(average / count));
		return rounding;
	}

	@Override
	public Student getHighestGPA_byGender(String gender) {
		Student student = new Student();
		double max = 0;
		for (int i = 0; i < students.size(); i++) {

			if (this.students.get(i).getGender().equalsIgnoreCase(gender) && max < students.get(i).getGpa()) {
				max = students.get(i).getGpa();
				student = students.get(i);
			}
		}
		return student;

	}

	@Override
	public Student getHighestGPA_byFName(String fname) {
		Student student = new Student();
		double max = 0;
		for (int i = 0; i < students.size(); i++) {

			if (this.students.get(i).getName().split(" ")[0].equalsIgnoreCase(fname)
					&& max < students.get(i).getGpa()) {
				max = students.get(i).getGpa();
				student = students.get(i);
			}
		}
		return student;
	}

	@Override
	public Student getHighestGPA_byMajor(String major) {

		Student student = new Student();
		double max = 0;
		for (int i = 0; i < students.size(); i++) {
			if (this.students.get(i).getMajor().trim().equalsIgnoreCase(major) && max < this.students.get(i).getGpa()) {
				max = students.get(i).getGpa();
				student = students.get(i);
			}
		}
		return student;
	}

	@Override
	public ArrayList<Student> getLowestGPA() {
		ArrayList<Student> studentList = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getGpa() < getAvgGPA()
					&& students.get(i).getName().split("")[0].equalsIgnoreCase("a")) {

				studentList.add(students.get(i));
			}
		}

		return studentList;
	}
}
