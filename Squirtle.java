
public class Squirtle extends BasePokemon implements WaterType {

	public Squirtle() {
		name = "Squirtle";
		attack = 33;
		defense = 44;
	}
	
	public void dive() {
		System.out.println("diving");
	}
	public void scald() {
		System.out.println("scalding");
	}

	public static void main(String[] args) {
		Squirtle squirtle = new Squirtle(); 
		
		System.out.println(squirtle.toString());
		System.out.println(squirtle.speak());

		squirtle.dive();
		squirtle.scald();
		
		System.out.println("Is Squirtle an instance of BasePokemon " + (squirtle instanceof BasePokemon));
		System.out.println("Is Squirtle an instance of WaterType " + (squirtle instanceof WaterType));
	}

}
