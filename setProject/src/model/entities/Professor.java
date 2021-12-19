package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person{
	
	private List<Course> courses = new ArrayList<>();

	public Professor(String name) {
		super(name);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
}
