package by.tc.task01.entity;

import static java.lang.Float.compare;

public class Appliance implements Comparable<Appliance>{
    private String type;
    private int price;
    private String name;


    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

	public void setPrice(int price){
	    this.price = price;
    }

    public int getPrice(){
	    return price;
    }

    public void setName(String name){
	    this.name = name;
    }

    public String getName(){
	    return name;
    }

    @Override
    public int compareTo(Appliance obj) {
        return compare(price, ((Appliance) obj).getPrice());
    }

    @Override
    public String toString() {
	    return "Type:" + getType() +", name: " + getName()+ ", price: " + getPrice();
    }

}
