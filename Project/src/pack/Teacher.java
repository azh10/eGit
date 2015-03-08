package pack;

public class Teacher extends Person{
	private String departId;
	
	public Teacher(String name, String departId) {
		super(name);
		setDepartId(departId);
	}

	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}
}
