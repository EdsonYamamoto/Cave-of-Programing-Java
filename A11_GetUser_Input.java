import java.util.Scanner;

public class A11_GetUser_Input {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a line of text: ");
		
		//wait for the user of enter of text line
		double value =  input.nextDouble();
		
		System.out.println("you have entered: " + value);
		
	}

}
