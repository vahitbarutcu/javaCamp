package homeWork2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course (1,"C# + Angular", "Engin Demirog", 13);
		Course course2 = new Course (1,"Java + REACT", "Engin Demirog", 7);
		Course course3 = new Course (1,"Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demirog", 0);
		
		Course[] courses = {course1, course2, course3};
		for(Course course : courses) {
				
		
		System.out.println(course.name);
		System.out.println(course.teacher);
		System.out.println(course.complete);
		
		}
		
	}

}
