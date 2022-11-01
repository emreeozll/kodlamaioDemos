package kodlamaioAppcore.logging;

import java.util.Date;

import kodlamaioAppentities.Category;

public class CategoryMailLogger implements CategoryLogger {

	@Override
	public void log(Category category) {

		Date date = new Date();
		System.out.println(category.getCategoryName() + " logged to mail in Database" + " - Time: " + date);

	}

}
