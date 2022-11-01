package kodlamaioAppdataAccess;

import kodlamaioAppentities.Course;

public class HibernateCourseDao implements BaseCourseDao {

	@Override
	public void add(Course course) {
		System.out.println("course succesfuly added to Hibernate : " + course.getId() + "-)" + course.getCourseName());
		BaseCourseDao.courseArrayList.add(course);

	}

	@Override
	public void delete(Course course) {
		System.out.println("course succesfuly removed to Hibernate : " + course.getId() + "-)" + course.getCourseName());
		BaseCourseDao.courseArrayList.remove(course);

	}

	@Override
	public void update(Course course) {
		System.out.println("course succesfuly uptaded to Hibernate : " + course.getId() + "-)" + course.getCourseName());

	}

	@Override
	public void getAllCourseList() {

		for (int i = 0; i < BaseCourseDao.courseArrayList.size(); i++) {
			System.out.println(BaseCourseDao.courseArrayList.get(i).getCourseName());
		}

	}

}
