class Frog{
	
	private int id;
	private String name;
	
	public Frog (int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		return String.format("%d: is %s", id, name);
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return id + ": " + name;
		*/
	}
}


public class A25_toString {
	public static void main(String[] args)
	{
		Frog frog1 = new Frog(7,"Bob");
		Frog frog2 = new Frog(18,"Set");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}
}
