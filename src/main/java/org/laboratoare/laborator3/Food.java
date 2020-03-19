package org.laboratoare.laborator3;


	public class Food implements Item{
	    private String name;
	    private double weight;
	   private double value;
	    public Food() {
	    }

	    public Food(String name, double weight, double value) {
	        this.name = name;
	        this.weight = weight;
	        this.value = value;
	    }
	    @Override
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public double getWeight() {
	        return weight;
	    }

	    public void setWeight(double weight) {
	        this.weight = weight;
	    }
	    @Override
	    public double getValue()
	    {
	        return getWeight()*2;
	    }

	    @Override
	    public String toString() {
	        return "\nFood:" 
	                 +" " + name  +
	                ", weight=" + weight + ", value= " + getValue() +", (profitFactor=" + " "+profitFactor()+")"
	                ;
	    }

		@Override
		public double profitFactor() {
			return getValue()/weight;
		}



}
