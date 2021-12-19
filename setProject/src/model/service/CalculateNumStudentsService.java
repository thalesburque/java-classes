package model.service;

import java.util.HashSet;
import java.util.Set;

import model.entities.Course;
import model.entities.Professor;
import model.entities.Student;

public class CalculateNumStudentsService {

	public int calculateNumStudents(Professor p) {

		Set<Student> students = new HashSet<>();
		for (Course c : p.getCourses()) {
			for (Student s : c.getStudents()) {
				students.add(s);
			}

		}

		return students.size();

	}

}
