package oopIntro;

public class CourseManager {
	public void addToCart(Course course) {
		System.out.println(course.name + " eklendi");
	}
	
	public void findSize(Course[] courses) {
		System.out.println("Toplam kurs sayýsý = " + courses.length);
	}
}
