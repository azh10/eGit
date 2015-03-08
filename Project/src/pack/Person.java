package pack;

public class Person extends Object {
	private String name;
	
	public Person(String name){
		super();
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		String result;
		result = name;
		return result;
	}
	
}
