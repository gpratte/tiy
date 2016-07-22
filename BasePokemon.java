
public abstract class BasePokemon {

	protected String name;
	protected String[] types; // e.g. Water, Fire, ...
	protected int attack;
	protected int defense;
	
	// Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getTypes() {
		return types;
	}
	public void setTypes(String[] types) {
		this.types = types;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

	// Behavior
	public String speak() {
		return "";
	}
	
	public abstract String growl();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name=" + name);
		if (types != null) {
			for (String type : types) {
				sb.append(", type=" + type);
			}
		}
		sb.append(", attack=" + attack).append(", defense=" + defense);
		return sb.toString();
	}
	
}
