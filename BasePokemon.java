
public abstract class BasePokemon {

	protected String name;
	protected int attack;
	protected int defense;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defense;
	}

	public void setDefence(int defence) {
		this.defense = defense;
	}

	public String speak() {
		return "";
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name=" + name);
		sb.append(", attack=" + attack).append(", defense=" + defense);
		return sb.toString();
	}
}
