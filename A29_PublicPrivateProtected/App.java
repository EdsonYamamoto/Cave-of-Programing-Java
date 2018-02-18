
public class App {
	public static void main(){
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		//won't work
		System.out.println(plant.type);
	}
}
