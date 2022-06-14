package Interfaces;

public class Student implements Comparable<Student> {
	private int roll_no;
	private String name;
	private int age;

	Student(String name, int roll_no, int age) {
		this.name = name;
		this.roll_no = roll_no;
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the roll_no
	 */
	public int getRoll_no() {
		return roll_no;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param roll_no the roll_no to set
	 */
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	/**
	 * Compare based on the roll_No of the student
	 */
	public int compareTo(Student o) {
		return this.roll_no - o.roll_no;
	}

	@Override
	public String toString() {
		return "Student[ Roll_NO : " + this.roll_no + " Name : " + this.name + " Age : " + this.age + " ]";
	}
}
