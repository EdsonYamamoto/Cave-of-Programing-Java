class preson{
	//class can contain
	//1. data
	//2. Subroutine
	
	String name;
	int age;
	
}


public class A17_ClassObject {

	public static void main(String[] args) {
		System.out.println("hello there");
		preson preson1 = new preson();
		preson1.name="Hoe";
		preson1.age = 32;
		
		preson preson2= new preson();
		preson2.name="Sara";
		preson2.age=24;
		
		System.out.println(preson1.name +" "+preson1.age);
	}

}
