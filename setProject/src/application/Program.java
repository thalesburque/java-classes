package application;

import java.util.Scanner;

import model.entities.Course;
import model.entities.Professor;
import model.entities.Student;
import model.service.CalculateNumStudentsService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor professor = new Professor("Alex");

		Course courseA = new Course("Course A");
		Course courseB = new Course("Course B");
		Course courseC = new Course("Course C");

		try (Scanner sc = new Scanner(System.in)) {

			int numStudent;

			System.out.print("How many students for course A? ");
			numStudent = sc.nextInt();

			for (int i = 0; i < numStudent; i++) {
				sc.nextLine();
				System.out.print("Student code: ");
				int id = sc.nextInt();

				courseA.addStudent(new Student(id));
			}

			professor.addCourse(courseA);

			System.out.print("How many students for course B? ");
			numStudent = sc.nextInt();

			for (int i = 0; i < numStudent; i++) {
				sc.nextLine();
				System.out.print("Student code: ");
				int id = sc.nextInt();

				courseB.addStudent(new Student(id));
			}

			professor.addCourse(courseB);

			System.out.print("How many students for course C? ");
			numStudent = sc.nextInt();

			for (int i = 0; i < numStudent; i++) {
				sc.nextLine();
				System.out.print("Student code: ");
				int id = sc.nextInt();

				courseC.addStudent(new Student(id));
			}

			professor.addCourse(courseC);

			CalculateNumStudentsService calculateNumStudentsService = new CalculateNumStudentsService();

			System.out.println("Total students: " + calculateNumStudentsService.calculateNumStudents(professor));

		} catch (RuntimeException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
