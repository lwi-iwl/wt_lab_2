package by.tc.task01.entity;

import static java.lang.Float.compare;

/**
 * The type of appliance.
 */
public class Appliance implements Comparable<Appliance>{

    /** Appliance group name field. */
    private String group;
    /** Appliance price field. */
    private int price;
    /** Appliance name field. */
    private String name;

    /**
     * Sets appliance group name.
     * @param group group name.
     */
    public void setGroup(String group){
        this.group = group;
    }

    /**
     * Gets appliance group name.
     * @return String appliance group name.
     */
    public String getGroup(){
        return group;
    }

    /**
     * Sets appliance price.
     * @param price appliance price.
     */
	public void setPrice(int price){
	    this.price = price;
    }

    /**
     * Gets appliance price.
     * @return int appliance price.
     */

    public int getPrice(){
	    return price;
    }

    /**
     * Sets appliance name.
     * @param name appliance name.
     */
    public void setName(String name){
	    this.name = name;
    }

    /**
     * Gets appliance name.
     * @return String appliance name.
     */
    public String getName(){
	    return name;
    }

    /**
     * Compare method.
     * @return int compare output.
     */
    @Override
    public int compareTo(Appliance obj) {
        return compare(price, ((Appliance) obj).getPrice());
    }

    /**
     * Method for formatted output.
     * @return String formatted output.
     */
    @Override
    public String toString() {
	    return "Type:" + getGroup() +", name: " + getName()+ ", price: " + getPrice();
    }

}
