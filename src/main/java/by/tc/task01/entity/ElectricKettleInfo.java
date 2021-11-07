package by.tc.task01.entity;

/**
 * The type of electric kettle.
 */
public class ElectricKettleInfo extends Appliance{
    /** Electric kettle power consumption field. */
    private int powerConsumption;
    /** Electric kettle weight field. */
    private int weight;
    /** Electric kettle capacity field. */
    private int capacity;
    /** Electric kettle height field. */
    private float height;
    /** Electric kettle width field. */
    private float width;

    /**
     * Sets electric kettle power consumption.
     * @param powerConsumption electric kettle power consumption.
     */
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    /**
     * Gets electric kettle power consumption.
     * @return int electric kettle power consumption.
     */
    private int getPowerConsumption(){
        return powerConsumption;
    }
    /**
     * Sets electric kettle weight.
     * @param weight electric kettle weight.
     */
    public void setWeight(int weight){
        this.weight = weight;
    }
    /**
     * Gets electric kettle weight.
     * @return int electric kettle weight.
     */
    private int getWeight(){
        return weight;
    }
    /**
     * Sets electric kettle capacity.
     * @param capacity electric kettle capacity.
     */
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    /**
     * Gets electric kettle capacity.
     * @return int electric kettle capacity.
     */
    private int getCapacity(){
        return capacity;
    }
    /**
     * Sets electric kettle height.
     * @param height electric kettle height.
     */
    public void setHeight(float height){
        this.height = height;
    }
    /**
     * Gets electric kettle height.
     * @return float electric kettle height.
     */
    private float getHeight(){
        return height;
    }
    /**
     * Sets electric kettle width.
     * @param width electric kettle width.
     */
    public void setWidth(float width){
        this.width = width;
    }
    /**
     * Gets electric kettle width.
     * @return float electric kettle width.
     */
    private float getWidth(){
        return width;
    }
    /**
     * Method for formatted output.
     * @return String formatted output.
     */
    @Override
    public String toString() {
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", Weight: " + getWeight() + ", Capacity: " + getCapacity() + ", Height: " + getHeight() + ", Width: " + getWidth();
    }
}
