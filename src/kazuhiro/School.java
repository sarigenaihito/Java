package kazuhiro;

import java.util.ArrayList;

public class School {
	private ArrayList<Student> customer = new ArrayList<Student>();

	public void enterStudent(Student stu) {
		customer.add(stu);
	}

	public void showStudents() {
		for(Student s : customer) {
			System.out.println(s.getName());
		}
	}
}
