package pack;

public class Teacher extends Person{
	private int departId;
	private int salary;
	
	public Teacher(String name, int age, int departId, int salary) {
		super(name, age);
		setDepartId(departId);
		setSalary(salary);
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
