package kazuhiro;

public class Main {

	public static void main(String[]args) {
		String[] name = {"aさん","bさん","cさん","dさん","eさん"};
		Student[] student = new Student[5];
		School sc = new School();

		for (int i = 0; i < 5; i++) {
			student[i] = new Student(name[i]);
			sc.enterStudent(student[i]);
		}

		sc.showStudents();
	}
}
