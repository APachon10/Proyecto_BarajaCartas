package daoModelos;

public class Carta {
	private String name;
	private int summonCost,attack,defense,value;

	public Carta() {
		super();
	}
	public Carta(String name, int summonCost, int attack, int defense, int value) {
		super();
		this.name = name;
		this.summonCost = summonCost;
		this.attack = attack;
		this.defense = defense;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSummonCost() {
		return summonCost;
	}
	public void setSummonCost(int summonCost) {
		this.summonCost = summonCost;
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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Barajas [name=" + name + ", summonCost=" + summonCost + ", attack=" + attack + ", defense=" + defense
				+ ", value=" + value + "]";
	}
	
	
	
}
