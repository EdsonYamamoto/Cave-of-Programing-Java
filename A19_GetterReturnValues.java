class Personagem{
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is: "+ name);
	}
	int calculateYearsToRetirement(){
		int yearsLeft = 65 - age;
		System.out.println("Calculado na classe "+yearsLeft);
		
		return yearsLeft;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}

public class A19_GetterReturnValues {

	public static void main(String[] args) {
		
		Personagem person1 = new Personagem();
		
		person1.name = "Jopt";
		person1.age = 25;
		person1.speak();
		
		int years = person1.calculateYearsToRetirement();
		
		System.out.println("years still to retirement :"+years);
		int age = person1.getAge();
		String name = person1.getName();
		System.out.println("name is:"+name);
		System.out.println("age is: "+age);
	}

}
