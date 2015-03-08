package pack;

public class TA extends Teacher implements StudentTA{
	private int id;

	
	public TA(String name, int departId, int id) {
		super(name, departId);
		setId(id);	
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;		
	}
}
