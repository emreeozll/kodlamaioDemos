package kodlamaioAppentities;

public class Instructor {

	int id;
	int age;
	String firstName;
	String lastName;
	String photo;

	public Instructor(int id, int age, String firstName, String lastName, String photo) {
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
