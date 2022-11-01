package kodlamaioApp;

import kodlamaioAppbusiness.CategoryManager;
import kodlamaioAppbusiness.CourseManager;
import kodlamaioAppbusiness.InstructorManager;
import kodlamaioAppcore.logging.CategoryDatabaseLogger;
import kodlamaioAppcore.logging.CategoryFileLogger;
import kodlamaioAppcore.logging.CategoryLogger;
import kodlamaioAppcore.logging.CategoryMailLogger;
import kodlamaioAppcore.logging.CourseDatabaseLogger;
import kodlamaioAppcore.logging.CourseFileLogger;
import kodlamaioAppcore.logging.CourseLogger;
import kodlamaioAppcore.logging.CourseMailLogger;
import kodlamaioAppcore.logging.InstructorDatabaseLogger;
import kodlamaioAppcore.logging.InstructorFileLogger;
import kodlamaioAppcore.logging.InstructorLogger;
import kodlamaioAppcore.logging.InstructorMailLogger;
import kodlamaioAppdataAccess.HibernateCategoryDao;
import kodlamaioAppdataAccess.HibernateCourseDao;
import kodlamaioAppdataAccess.HibernateInstructorDao;
import kodlamaioAppdataAccess.JdbcCategoryDao;
import kodlamaioAppentities.Category;
import kodlamaioAppentities.Course;
import kodlamaioAppentities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course(1, "Java Programming", "Engin Demirog", 250, "Back-end Software");

		CourseLogger[] loggers = { new CourseDatabaseLogger(), new CourseFileLogger(), new CourseMailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);

		Course course2 = new Course(2, "C# Programming", "Murat Yücedag", 15, "Back-End Softaware");
		courseManager.add(course2);

		courseManager.getAllCourseList();

		System.out.println(" ");

		CategoryLogger[] categoryLoggers = { new CategoryDatabaseLogger(), new CategoryFileLogger(),new CategoryMailLogger() };
		Category category = new Category(1, "Back-end Software");
		Category category2 = new Category(2, "Front-end Software");

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), categoryLoggers);
		categoryManager.add(category);
		categoryManager.add(category2);
		categoryManager.getAllCategoryList();

		System.out.println(" ");

		InstructorLogger[] instructorLoggers = { new InstructorDatabaseLogger(), new InstructorFileLogger(),new InstructorMailLogger() };
		Instructor instructor = new Instructor(1, 30, "Engin", "Demirog", "engin.png");

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), instructorLoggers);
		instructorManager.add(instructor);

		Instructor instructor2 = new Instructor(2, 21, "Emre", "Ozel", "emre.png");
		instructorManager.add(instructor2);
		instructorManager.getAllInstrutorList();
	}

}
