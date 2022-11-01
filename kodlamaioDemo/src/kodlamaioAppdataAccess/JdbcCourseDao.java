package kodlamaioAppdataAccess;

import kodlamaioAppentities.Course;

public class JdbcCourseDao implements BaseCourseDao {

	@Override
	public void add(Course course) {
		System.out.println("course succesfuly added to JDBC : " + course.getId() + "-)" + course.getCourseName());
		BaseCourseDao.courseArrayList.add(course);

	}

	@Override
	public void delete(Course course) {
		System.out.println("course succesfuly removed to JDBC : " + course.getId() + "-)" + course.getCourseName());
		BaseCourseDao.courseArrayList.remove(course);

	}

	@Override
	public void update(Course course) {
		System.out.println("course succesfuly uptaded to JDBC : " + course.getId() + "-)" + course.getCourseName());

	}

	@Override
	public void getAllCourseList() {

		for (int i = 0; i < BaseCourseDao.courseArrayList.size(); i++) {

			System.out.println("get to JDBC:" + BaseCourseDao.courseArrayList.get(i));

		}
	}

}
