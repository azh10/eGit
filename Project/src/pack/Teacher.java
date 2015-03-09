package pack;

public class Teacher extends Person{
	private String departId;
	private int salary;
	
	public Teacher(String firstName, String lastName, int age, String departId, int salary) {
		super(firstName, lastName, age);
		setDepartId(departId);
		setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}
}
