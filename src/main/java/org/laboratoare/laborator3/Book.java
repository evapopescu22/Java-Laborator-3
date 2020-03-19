package org.laboratoare.laborator3;

public class Book implements Item {
private String name;
private int pageNumber;
private double value;

    public Book() {
    }
public Book(String name,int pageNumber,double value)
{
    this.name=name;
    this.pageNumber=pageNumber;
    this.value=value;
}
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    @Override
    public double getWeight()
    {
        return getPageNumber()/100;
    }

    @Override
    public String toString() {
        return "\nBook:" + " " +
                 name  +  ", weight='" +
                 getWeight() +
                ", value=" + value +", (profitFactor="+profitFactor()+")"
                ;
    }
	@Override
	public double profitFactor() {
		return value/getWeight();
	}
}

