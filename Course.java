package homeWork2;

public class Course {
	
	public Course() {
		
	}
	
	public Course (int id, String name, String teacher, int complete) {
		this();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.complete = complete;
	}
	
	int id;
	String name;
	String teacher;
	int complete;
}
