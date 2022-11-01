package kodlamaioAppdataAccess;

import kodlamaioAppentities.Instructor;

public class HibernateInstructorDao implements BaseInstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("instructor succesfuly added to Hibernate : "+  "-)" + instructor.getFirstName()+instructor.getLastName()+" - "+instructor.getPhoto());
		BaseInstructorDao.instructorArrayList.add(instructor);
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("instructor succesfuly removed to Hibernate : "+  "-)" + instructor.getFirstName()+instructor.getLastName());		
        BaseInstructorDao.instructorArrayList.remove(instructor); 
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("instructor succesfuly uptaded to Hibernate : " +  "-)" + instructor.getFirstName() + instructor.getLastName());
		
	}

	@Override
	public void getAllInstructorList() {
		
		for (int i = 0; i < BaseInstructorDao.instructorArrayList.size(); i++) {
			System.out.println(BaseInstructorDao.instructorArrayList.get(i).getFirstName()+BaseInstructorDao.instructorArrayList.get(i).getLastName());
		}
		
	}

}
