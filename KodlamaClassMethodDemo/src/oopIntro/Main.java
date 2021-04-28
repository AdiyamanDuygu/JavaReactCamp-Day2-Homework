package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Programlamaya Giri� i�in Temel Kurs", "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin", "Engin Demiro�", 0.00);
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip ,d�k�man ve duyurular�n� buradan yapaca��z", "Engin Demiro�", 0.00);
		Course course3 = new Course(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip ,d�k�man ve duyurular�n� buradan yapaca��z", "Engin Demiro�", 0.00);

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
