package by.tc.task01.entity;

/**
 * The type of refrigerator.
 */
public class RefrigeratorInfo extends Appliance{
    /** Refrigerator power consumption field. */
	private int powerConsumption;
    /** Refrigerator weight field. */
	private int weight;
    /** Refrigerator freezer capacity field. */
	private int freezerCapacity;
    /** Refrigerator overall capacity field. */
	private float overallCapacity;
    /** Refrigerator height field. */
	private float height;
    /** Refrigerator width field. */
	private float width;
    /**
     * Sets refrigerator power consumption.
     * @param powerConsumption refrigerator power consumption.
     */
	public void setPowerConsumption(int powerConsumption){
	    this.powerConsumption = powerConsumption;
    }
    /**
     * Gets refrigerator power consumption.
     * @return int refrigerator power consumption.
     */
    private int getPowerConsumption(){
	    return powerConsumption;
    }
    /**
     * Sets refrigerator weight.
     * @param weight refrigerator weight.
     */
    public void setWeight(int weight){
	    this.weight = weight;
    }
    /**
     * Gets refrigerator weight.
     * @return int refrigerator weight.
     */
    private int getWeight(){
	    return weight;
    }
    /**
     * Sets refrigerator freezer capacity.
     * @param freezerCapacity refrigerator freezer capacity.
     */
    public void setFreezerCapacity(int freezerCapacity){
	    this.freezerCapacity = freezerCapacity;
    }
    /**
     * Gets refrigerator freezer capacity.
     * @return int refrigerator freezer capacity.
     */
    private int getFreezerCapacity(){
	    return freezerCapacity;
    }
    /**
     * Sets refrigerator overall capacity.
     * @param overallCapacity refrigerator overall capacity.
     */
    public void setOverallCapacity(float overallCapacity){
	    this.overallCapacity = overallCapacity;
    }
    /**
     * Gets refrigerator overall capacity.
     * @return float refrigerator overall capacity.
     */
    private float getOverallCapacity(){
	    return overallCapacity;
    }
    /**
     * Sets refrigerator height.
     * @param height refrigerator height.
     */
    public void setHeight(float height) {
        this.height = height;
    }
    /**
     * Gets refrigerator height.
     * @return float refrigerator height.
     */
    private float getHeight(){
	    return height;
    }
    /**
     * Sets refrigerator width.
     * @param width refrigerator width.
     */
    public void setWidth(float width) {
        this.width = width;
    }
    /**
     * Gets refrigerator width.
     * @return float refrigerator width.
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
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", Weight: " + getWeight() + ", FreezerCapacity:"+ getFreezerCapacity() +", OverallCapacity: " +
                getOverallCapacity() + ", Height: " + getHeight() + ", Width: " + getWidth();
    }
}
