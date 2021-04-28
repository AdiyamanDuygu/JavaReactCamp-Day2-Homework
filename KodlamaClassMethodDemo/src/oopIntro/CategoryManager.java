package oopIntro;

public class CategoryManager {
	public void addCategory(Category category) {
		System.out.println(category.name + " kategorisi eklendi");
	}

	public void findSize(Category[] categories) {
		System.out.println("Toplam kategori sayýsý = " + categories.length);
	}
}
