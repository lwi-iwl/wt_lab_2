package by.tc.task01.entity;

public class RefrigeratorInfo extends Appliance{
	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private float overallCapacity;
	private float height;
	private float width;

	public void setPowerConsumption(int powerConsumption){
	    this.powerConsumption = powerConsumption;
    }

    private int getPowerConsumption(){
	    return powerConsumption;
    }

    public void setWeight(int weight){
	    this.weight = weight;
    }

    private int getWeight(){
	    return weight;
    }

    public void setFreezerCapacity(int freezerCapacity){
	    this.freezerCapacity = freezerCapacity;
    }

    private int getFreezerCapacity(){
	    return freezerCapacity;
    }

    public void setOverallCapacity(float overallCapacity){
	    this.overallCapacity = overallCapacity;
    }

    private float getOverallCapacity(){
	    return overallCapacity;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    private float getHeight(){
	    return height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    private float getWidth(){
	    return width;
    }

    @Override
    public String toString() {
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", Weight: " + getWeight() + ", FreezerCapacity:"+ getFreezerCapacity() +", OverallCapacity: " +
                getOverallCapacity() + ", Height: " + getHeight() + ", Width: " + getWidth();
    }
}
