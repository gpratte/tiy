
public class Squirtle extends BasePokemon {

	public Squirtle() {
		name = "Squirtle";
		types = new String[1];
		types[0] = "Water";
		attack = 33;
		defense = 44;
	}
	
	public String growl() {
		return "steam";
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
		System.out.println(squirtle.growl());

		squirtle.dive();
		squirtle.scald();
		
		System.out.println("Is Squirtle an instance of BasePokemon " + (squirtle instanceof BasePokemon));
	}

}
