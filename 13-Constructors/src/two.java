
public class two {
	private String myName;
	
	public two(String name) {
		myName = name;
	}
	
	public String getMyName() {
		return myName;
	}

	public void setMyName(String name) {
		myName = name;
	}

	public void Print(){
		System.out.printf("My name is %s", getMyName());
	}
	
}
