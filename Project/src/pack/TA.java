package pack;

public class TA extends Teacher implements StudentTA{
	private int id;
	private int level;
	
	public TA(String name, int age, int departId, int salary, int id, int level) {
		super(name, age, departId, salary);
		setId(id);
		setLevel(level);		
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;		
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public void setLevel(int level) {
		this.level = level;
	}

}
