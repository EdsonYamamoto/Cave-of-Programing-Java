import java.util.Scanner;


public class A13_Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter a command:");
		String text = input.nextLine();
		
		switch(text){
			case "start":
				System.out.println("Machine started");
				break;
				
			case "stop":
				System.out.println("machine stoped");
				break;
				
			default:
				System.out.println("Command not recognize");
				break;
		}
	}

}
