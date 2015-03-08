package pack;

public class Student extends Person {
	private int id;
	
	public Student(String name, int id) {
		super(name);
		setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		String result;
		result = super.toString() +"/tStudent id ["+ id +"]";
		return result;
	}

}
