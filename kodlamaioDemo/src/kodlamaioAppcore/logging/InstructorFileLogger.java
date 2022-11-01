package kodlamaioAppcore.logging;

import java.util.Date;

import kodlamaioAppentities.Instructor;

public class InstructorFileLogger implements InstructorLogger {

	@Override
	public void log(Instructor instructor) {

		Date date = new Date();
		System.out.println(instructor.getFirstName()+instructor.getLastName() + " logged to file in Database" + " - Time: " + date);

	
	}

}
