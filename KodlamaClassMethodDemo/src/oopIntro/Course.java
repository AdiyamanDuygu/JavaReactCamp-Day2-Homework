package oopIntro;

public class Course {
	int id;
	String name;
	String explanation;
	String instructor;
	double price; 
	
	public Course(int id, String name, String explanation, String instructor, double price) {
		this.id = id;
		this.name = name;
		this.explanation = explanation;
		this.instructor = instructor;
		this.price = price;
	}
}
