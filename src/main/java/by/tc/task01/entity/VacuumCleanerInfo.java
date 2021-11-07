package by.tc.task01.entity;
/**
 * The type of vacuum cleaner.
 */
public class VacuumCleanerInfo extends Appliance{
    /** Vacuum cleaner power consumption field. */
	private int powerConsumption;
    /** Vacuum cleaner filter type field. */
	private String filterType;
    /** Vacuum cleaner bag type field. */
	private String bagType;
    /** Vacuum cleaner wand type field. */
	private String wandType;
    /** Vacuum cleaner motor speed regulation field. */
	private int motorSpeedRegulation;
    /** Vacuum cleaner cleaning width field. */
	private int cleaningWidth;

    /**
     * Sets vacuum cleaner power consumption.
     * @param powerConsumption vacuum cleaner power consumption.
     */
    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
    /**
     * Gets vacuum cleaner power consumption.
     * @return int vacuum cleaner power consumption.
     */
    private int getPowerConsumption(){
        return powerConsumption;
    }
    /**
     * Sets vacuum cleaner filter type.
     * @param filterType vacuum cleaner filter type.
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }
    /**
     * Gets vacuum cleaner filter type.
     * @return String vacuum cleaner filter type.
     */
    private String getFilterType(){
        return filterType;
    }
    /**
     * Sets vacuum cleaner bag type.
     * @param bagType vacuum cleaner bag type.
     */
    public void setBagType(String bagType) {
        this.bagType = bagType;
    }
    /**
     * Gets vacuum cleaner bag type.
     * @return String vacuum cleaner bag type.
     */
    private String getBagType(){
        return bagType;
    }
    /**
     * Sets vacuum cleaner wand type.
     * @param wandType vacuum cleaner wand type.
     */
    public void setWandType(String wandType) {
        this.wandType = wandType;
    }
    /**
     * Gets vacuum cleaner wand type.
     * @return String vacuum cleaner wand type.
     */
    private String getWandType(){
        return wandType;
    }
    /**
     * Sets vacuum cleaner motor speed regulation.
     * @param motorSpeedRegulation vacuum cleaner motor speed regulation.
     */
    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }
    /**
     * Gets vacuum cleaner motor speed regulation.
     * @return int vacuum cleaner motor speed regulation.
     */
    private int getMotorSpeedRegulation(){
        return motorSpeedRegulation;
    }
    /**
     * Sets vacuum cleaner motor cleaning width.
     * @param cleaningWidth vacuum cleaner cleaning width.
     */
    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
    /**
     * Gets vacuum cleaner motor cleaning width.
     * @return int vacuum cleaner cleaning width.
     */
    private int getCleaningWidth(){
        return cleaningWidth;
    }
    /**
     * Method for formatted output.
     * @return String formatted output.
     */
    @Override
    public String toString() {
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", FilterType: " + getFilterType() +
                ", BagType: " + getBagType() + ", WandType " + getWandType() + ", MotorSpeedRegulation: " + getMotorSpeedRegulation() +
                ", CleaningWidth: " + getCleaningWidth();
    }
}
