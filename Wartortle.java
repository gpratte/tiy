
public class Wartortle extends Squirtle implements AdvancedWaterMoves {

	public Wartortle() {
		name = "Wartortle";
		attack = 67;
		defense = 77;
	}
	
	public String speak() {
		return "gurgle";
	}
	
	public void steamEruption() {
		System.out.println("steam erupting");
	}
	public void whirlpool() {
		System.out.println("whirlpooling");
	}

	public static void main(String[] args) {
		Wartortle wartortle = new Wartortle(); 
		
		System.out.println(wartortle.toString());
		System.out.println(wartortle.speak());
		System.out.println(wartortle.growl());

		wartortle.brine();
		wartortle.dive();
		wartortle.scald();
		wartortle.steamEruption();
		wartortle.whirlpool();
		
		System.out.println("Is Wartortle an instance of BasePokemon " + (wartortle instanceof BasePokemon));
		System.out.println("Is Wartortle an instance of Squirtle " + (wartortle instanceof Squirtle));
		System.out.println("Is Wartortle an instance of WaterType " + (wartortle instanceof WaterType));
		System.out.println("Is Wartortle an instance of BasicWaterMoves " + (wartortle instanceof BasicWaterMoves));
		System.out.println("Is Wartortle an instance of AdvancedWaterMoves " + (wartortle instanceof AdvancedWaterMoves));

	}

}
