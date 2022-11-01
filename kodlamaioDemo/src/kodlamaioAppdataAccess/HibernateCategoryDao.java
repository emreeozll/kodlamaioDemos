package kodlamaioAppdataAccess;

import kodlamaioAppentities.Category;

public class HibernateCategoryDao implements BaseCategoryDao {

	@Override
	public void add(Category category) {

		System.out.println(
				"category succesfuly added to Hibernate : " + category.getId() + "-)" + category.getCategoryName());
		BaseCategoryDao.categoryArrayList.add(category);

	}

	@Override
	public void delete(Category category) {
		System.out.println(
				"category succesfuly removed to Hibernate : " + category.getId() + "-)" + category.getCategoryName());
		BaseCategoryDao.categoryArrayList.remove(category);
	}

	@Override
	public void update(Category category) {
		System.out.println(
				"category succesfuly uptaded to Hibernate : " + category.getId() + "-)" + category.getCategoryName());

	}

	@Override
	public void getAllCategoryList() {

		for (int i = 0; i < BaseCategoryDao.categoryArrayList.size(); i++) {
			System.out.println(BaseCategoryDao.categoryArrayList.get(i).getCategoryName());
		}

	}

}
