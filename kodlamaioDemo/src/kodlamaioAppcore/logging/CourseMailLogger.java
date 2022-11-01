package kodlamaioAppcore.logging;

import java.util.*;

import kodlamaioAppentities.Course;

public class CourseMailLogger implements CourseLogger {

	@Override
	public void log(Course course) {

		Date date = new Date();
		System.out.println(course.getCourseName() + " logged to mail in Database "+ " - Time: "+date);

	}

}
