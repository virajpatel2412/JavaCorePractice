package Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		Student viraj = new Student("Viraj", 1, 21);
		Student mitesh = new Student("Mitesh", 2, 23);
		
		List<Student> students = new ArrayList<>();
		students.add(mitesh);
		students.add(viraj);
		
		System.out.println("Before Sort");
		
		for(Student student : students) {
			System.out.println(student);
		}
		
		Collections.sort(students);
		System.out.println("After Sort");
		
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
