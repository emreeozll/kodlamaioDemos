package kodlamaioAppcore.logging;

import kodlamaioAppentities.Category;
import java.util.Date;

public class CategoryDatabaseLogger implements CategoryLogger {

	@Override
	public void log(Category category) {

		Date date = new Date();
		System.out.println(category.getCategoryName() + " logged to category in Database" + " - Time: " + date);

	}

}
