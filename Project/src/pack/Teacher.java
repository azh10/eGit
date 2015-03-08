package pack;

public class Teacher extends Person{
	private int departId;
	
	public Teacher(String name, int departId) {
		super(name);
		setDepartId(departId);
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}
}
