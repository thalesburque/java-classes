package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String name;

	private List<Student> students = new ArrayList<>();

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

}
