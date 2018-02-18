
public class A24_StringBuilderStringFormating {
	
	public static void main(String[] args)
	{
		String info ="";
		
		info+="My name is boo";
		info+=" ";
		info+="I am a builder";
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("my name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roher.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		
		// formatando as strings
		System.out.println("here is some text.\t that was a tab.\n that was a newline.");
		System.out.println("more text");
		
		System.out.printf("total cost %d: quantity is %d",5,120);
	}
}
