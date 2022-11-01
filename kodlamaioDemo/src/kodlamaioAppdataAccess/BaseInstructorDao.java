package kodlamaioAppdataAccess;

import java.util.ArrayList;
import kodlamaioAppentities.Instructor;

public interface BaseInstructorDao {

	public static ArrayList<Instructor> instructorArrayList = new ArrayList<Instructor>();

	void add(Instructor instructor);

	void delete(Instructor instructor);

	void update(Instructor instructor);

	void getAllInstructorList();

	
	
}
