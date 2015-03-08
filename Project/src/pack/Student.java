package pack;

public class Student extends Person {
	private int id;
	private int level;
	
	public Student(String name, int age, int id, int level) {
		super(name, age);
		setId(id);
		setLevel(level);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public String toString(){
		String result;
		result = super.toString() +" Student id ["+ id +"] level: "+ level;
		return result;
	}

}
