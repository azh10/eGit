package pack;

public class TA extends Teacher implements StudentTA{
	private String id;

	
	public TA(String name, String departId, String id) {
		super(name, departId);
		setId(id);	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;		
	}
}
