package Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Viraj", 2, 20));
		students.add(new Student("Mitesh",1, 22));
		
		
		System.out.println("Student list before Sort ");
		for(Student s : students) {
			System.out.println(s);
		}
		
//		Sort Students based on the roll_no
		Comparator<Student> c = new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				return a.getRoll_no() - b.getRoll_no();
			}
		};
		
		
		System.out.println("Student list after Sort By Roll_NO");
		Collections.sort(students, c);
		for(Student s : students) {
			System.out.println(s);
		}
		
		
		System.out.println("Student list after Sort By Age");
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student a, Student b) {
				return a.getAge()-b.getAge();
			}
		});
		for(Student s:students) {
			System.out.println(s);
		}
		
		
	}

}
