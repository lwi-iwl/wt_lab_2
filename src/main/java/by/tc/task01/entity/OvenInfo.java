package by.tc.task01.entity;

/**
 * The type of oven.
 */
public class OvenInfo extends Appliance{
    /** Oven power consumption field. */
	private int powerConsumption;
    /** Oven weight field. */
	private int weight;
    /** Oven capacity field. */
	private int capacity;
    /** Oven depth field. */
	private int depth;
    /** Oven height field. */
	private float height;
    /** Oven width field. */
	private float width;
    /**
     * Sets Oven power consumption.
     * @param powerConsumption oven power consumption.
     */
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    /**
     * Gets Oven power consumption.
     * @return int oven power consumption.
     */
    private int getPowerConsumption(){
        return powerConsumption;
    }
    /**
     * Sets Oven weight.
     * @param weight oven weight.
     */
    public void setWeight(int weight){
        this.weight = weight;
    }
    /**
     * Gets Oven weight.
     * @return int oven weight.
     */
    private int getWeight(){
        return weight;
    }
    /**
     * Sets Oven capacity.
     * @param capacity oven capacity.
     */
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    /**
     * Gets Oven capacity.
     * @return int oven capacity.
     */
    private int getCapacity(){
        return capacity;
    }
    /**
     * Sets Oven depth.
     * @param depth oven depth.
     */
    public void setDepth(int depth){
        this.depth = depth;
    }
    /**
     * Gets Oven depth.
     * @return int oven depth.
     */
    private int getDepth(){
        return depth;
    }
    /**
     * Sets Oven height.
     * @param height oven height.
     */
    public void setHeight(float height){
        this.height = height;
    }
    /**
     * Gets Oven height.
     * @return float oven height.
     */
    private float getHeight(){
        return height;
    }
    /**
     * Sets Oven width.
     * @param width oven width.
     */
    public void setWidth(float width){
        this.width = width;
    }
    /**
     * Gets Oven width.
     * @return float oven width.
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
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", Weight: " + getWeight() + ", Capacity: " +
                getCapacity() + ", Depth: " + getDepth() + ", Height: " + getHeight() + ", Width: " + getWidth();
    }
}
