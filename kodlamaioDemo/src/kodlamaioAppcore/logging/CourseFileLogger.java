package kodlamaioAppcore.logging;

import java.util.Date;

import kodlamaioAppentities.Course;

public class CourseFileLogger implements CourseLogger{

	@Override
	public void log(Course course) {
		
		Date date = new Date();
		System.out.println(course.getCourseName() + " logged to file in Database "+ " - Time: "+date);
		
	}

}
