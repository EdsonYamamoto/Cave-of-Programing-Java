class Person{
	//class can contain
	//1. data
	//2. Subroutine
	
	String name;
	int age;
	
	void speak(){
		for(int i=0;i<3;i++)
			System.out.println("My name is: " + name + " and I'm " + age + " years old");
	}
	void sayHello(){
		System.out.println("Hello there!");
	}
}


public class A18_Methods {

	public static void main(String[] args) {
		System.out.println("hello there");
		//Create of person1
		Person person1 = new Person();
		person1.name="Hoe";
		person1.age = 32;
		person1.speak();
		person1.sayHello();
		
		//Create of person2
		Person person2= new Person();
		person2.name="Sara";
		person2.age=24;
		person2.speak();
		person2.sayHello();
		
	}

}
