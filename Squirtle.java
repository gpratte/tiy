
public class Squirtle extends BasePokemon implements WaterType, BasicWaterMoves {

	public Squirtle() {
		name = "Squirtle";
		attack = 33;
		defense = 44;
	}

	public String growl() {
		return "steam";
	}

	public void brine() {
		System.out.println("brining");
	}
	public void dive() {
		System.out.println("diving");
	}
	public void scald() {
		System.out.println("scalding");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", type=WaterType";
	}

	public static void main(String[] args) {
		Squirtle squirtle = new Squirtle(); 
		
		System.out.println(squirtle.toString());
		System.out.println(squirtle.speak());
		System.out.println(squirtle.growl());

		squirtle.brine();
		squirtle.dive();
		squirtle.scald();
		
		System.out.println("Is Squirtle an instance of BasePokemon " + (squirtle instanceof BasePokemon));
		System.out.println("Is Squirtle an instance of WaterType " + (squirtle instanceof WaterType));
		System.out.println("Is Squirtle an instance of BasicWaterMoves " + (squirtle instanceof BasicWaterMoves));
	}

}
