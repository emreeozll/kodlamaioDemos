package kodlamaioAppdataAccess;

import java.util.ArrayList;
import kodlamaioAppentities.Category;

public interface BaseCategoryDao {

	public static ArrayList<Category> categoryArrayList = new ArrayList<Category>();

	void add(Category category);

	void delete(Category category);

	void update(Category category);

	void getAllCategoryList();

}
