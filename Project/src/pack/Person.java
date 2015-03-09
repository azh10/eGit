package pack;

public class Person extends Object {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age){
		super();
		setFirstName(firstName);
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString(){
		String result;
		result = firstName +" "+ lastName +"[age: "+ age +"]";
		return result;
	}
	
}
