package pack;

public class TA extends Teacher implements StudentTA{
	private String id;

	
	public TA(String name, String departId, String id) {
		super(name, departId);
		setId(id);	
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;		
	}
}
