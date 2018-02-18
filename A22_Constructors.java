class Machine{
	private String name;
	private int code;
	
	public Machine(){
		this("Sue", 7);
		System.out.println("Constructor running");
		
		name = "Arnir";

	}
	
	public Machine(String name){
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	public Machine(String name, int code){
		System.out.println("third constructor running!");
		this.name = name;
		this.code = code;
	}
}

public class A22_Constructors {
	public static void main(String[] args){
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Joe", 7);
	}
	
}
