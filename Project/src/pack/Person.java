package pack;

public class Person extends Object {
	private String name;
	private int age;
	
	public Person(String name, int age){
		super();
		setName(name);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		String result;
		result = name +" is a "+ age +" year old";
		return result;
	}
	
}
