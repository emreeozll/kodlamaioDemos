package kodlamaioAppbusiness;

import kodlamaioAppcore.logging.CategoryLogger;
import kodlamaioAppdataAccess.BaseCategoryDao;
import kodlamaioAppentities.Category;

public class CategoryManager {

	BaseCategoryDao baseCategoryDao;
	CategoryLogger[] categoryLoggers;

	public CategoryManager(BaseCategoryDao baseCategoryDao, CategoryLogger[] loggers) {
		this.baseCategoryDao = baseCategoryDao;
		this.categoryLoggers = loggers;
	}

	public void add(Category category) throws Exception {

		for (int i = 0; i < baseCategoryDao.categoryArrayList.size(); i++) {

			if (category.getCategoryName().equals(baseCategoryDao.categoryArrayList.get(i).getCategoryName())) {

				throw new Exception("category name cannot be repeated");

			} else if (baseCategoryDao.categoryArrayList.get(i).getId() == category.getId()) {
				
				throw new Exception("category id cannot be repeated");
			}

		}

		baseCategoryDao.add(category);

		for (CategoryLogger categoryLogger : categoryLoggers) {

			categoryLogger.log(category);
		}

		System.out.println(" ");

	}

	public void delete(Category category) {

		baseCategoryDao.delete(category);
	}

	public void getAllCategoryList() {

		System.out.println("<<<<<<<<<<All Category List>>>>>>>>>>");
		baseCategoryDao.getAllCategoryList();
	}

}
