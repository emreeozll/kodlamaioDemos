package kodlamaioAppdataAccess;

import java.util.ArrayList;
import kodlamaioAppentities.Course;

public interface BaseCourseDao {

	public static ArrayList<Course> courseArrayList = new ArrayList<Course>();

	void add(Course course);

	void delete(Course course);

	void update(Course course);

	void getAllCourseList();

}
