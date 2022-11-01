package kodlamaioAppbusiness;

import kodlamaioAppcore.logging.CourseLogger;
import kodlamaioAppdataAccess.BaseCourseDao;
import kodlamaioAppentities.Category;
import kodlamaioAppentities.Course;

public class CourseManager {

	BaseCourseDao baseCourseDao;
	CourseLogger[] courseLogger;

	public CourseManager(BaseCourseDao baseCourseDao, CourseLogger[] loggers) {
		this.baseCourseDao = baseCourseDao;
		this.courseLogger = loggers;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {

			throw new Exception("the price of the course cannot be less than zero");
		}
		for (int i = 0; i < baseCourseDao.courseArrayList.size(); i++) {

			if (course.getCourseName().equals(baseCourseDao.courseArrayList.get(i).getCourseName())) {
				throw new Exception("course name cannot be repeated");
			} else if (baseCourseDao.courseArrayList.get(i).getId() == course.getId()) {
				throw new Exception("course id cannot be repeated ");

			}

		}

		baseCourseDao.add(course);

		for (CourseLogger logging : courseLogger) {
			logging.log(course);
		}

		System.out.println(" ");
	}

	public void delete(Course course) {

		baseCourseDao.delete(course);
	}

	public void getAllCourseList() {

		System.out.println("<<<<<<<<<<All Course List>>>>>>>>>>");
		baseCourseDao.getAllCourseList();
	}

}
