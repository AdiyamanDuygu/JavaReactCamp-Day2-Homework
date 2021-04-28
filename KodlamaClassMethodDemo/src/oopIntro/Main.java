package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Programlamaya Giriþ için Temel Kurs", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin", "Engin Demiroð", 0.00);
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip ,döküman ve duyurularýný buradan yapacaðýz", "Engin Demiroð", 0.00);
		Course course3 = new Course(3, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip ,döküman ve duyurularýný buradan yapacaðýz", "Engin Demiroð", 0.00);

		Course[] courses = {course1, course2, course3};
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		courseManager.addToCart(course2);
		courseManager.addToCart(course3);
		
		courseManager.findSize(courses);
		
		Category category1 = new Category(1, "Programlama", 3);
		
		Category[] categories = {category1};
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category1);
		
		categoryManager.findSize(categories);
	}

}
