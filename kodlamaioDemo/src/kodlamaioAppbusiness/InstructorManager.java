package kodlamaioAppbusiness;

import kodlamaioAppcore.logging.InstructorLogger;
import kodlamaioAppdataAccess.BaseInstructorDao;
import kodlamaioAppentities.Instructor;

public class InstructorManager {

	BaseInstructorDao baseInstructorDao;
	InstructorLogger[] instructorLogger;

	public InstructorManager(BaseInstructorDao baseInstructorDao, InstructorLogger[] loggers) {
		this.baseInstructorDao = baseInstructorDao;
		this.instructorLogger = loggers;
	}

	public void add(Instructor instructor) throws Exception {

		baseInstructorDao.instructorArrayList.toString();

		for (int i = 0; i < baseInstructorDao.instructorArrayList.size(); i++) {

			if (instructor.getFirstName().equals(baseInstructorDao.instructorArrayList.get(i).getFirstName())
					&& instructor.getLastName().equals(baseInstructorDao.instructorArrayList.get(i).getLastName())) {

				throw new Exception("instructor first-last name cannot be repeated");

			} else if (baseInstructorDao.instructorArrayList.get(i).getId() == instructor.getId()) {
				throw new Exception("instructor id cannot be repeated ");

			}
		}

		System.out.println(" ");

		baseInstructorDao.add(instructor);

		for (InstructorLogger instructorLogger2 : instructorLogger) {

			instructorLogger2.log(instructor);

		}

	}

	public void delete(Instructor instructor) {
		baseInstructorDao.delete(instructor);
	}

	public void getAllInstrutorList() {
		System.out.println("<<<<<<<<<<All Instructor List>>>>>>>>>>");
		baseInstructorDao.getAllInstructorList();
	}

}
