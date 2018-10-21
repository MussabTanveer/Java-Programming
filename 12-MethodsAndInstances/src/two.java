
public class two {
	private String myName;
	
	public void setName(String name){
		myName = name;
	}
	
	public String getName(){
		return myName;
	}
	
	public void Print(){
		System.out.printf("My name is %s", getName());
	}
}
