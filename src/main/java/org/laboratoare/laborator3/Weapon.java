package org.laboratoare.laborator3;

public class Weapon implements Item {
private WeaponType type;
private double weight;
private double value;
public enum WeaponType{
    Sword,Rifle,Cannon;
}

    public Weapon() {
    }
public Weapon(double weight,double value,WeaponType type)
{
    this.weight=weight;
    this.value=value;
    this.type=type;
}
    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return type.name();
    }

    @Override
    public String toString() {
        return "\nWeapon:" + " "+
                 type +
                ", weight=" + weight +
                ", value=" + value +", (profitFactor="+profitFactor() + ")"
                ;
    }
	@Override
	public double profitFactor() {
		
		return value/weight;
	}
}
