package by.tc.task01.entity;

/**
 * The type of tabletPC.
 */
public class TabletPCInfo extends Appliance{
    /** TabletPC battery capacity field. */
	private int batteryCapacity;
    /** TabletPC display inches field. */
	private int displayInches;
    /** TabletPC memory ROM field. */
	private int memoryRom;
    /** TabletPC flash memory capacity field. */
	private int flashMemoryCapacity;
    /** TabletPC color field. */
	private String color;

    /**
     * Sets tabletPC battery capacity.
     * @param batteryCapacity tabletPC battery capacity.
     */
	public void setBatteryCapacity(int batteryCapacity){
	    this.batteryCapacity = batteryCapacity;
    }
    /**
     * Gets tabletPC battery capacity.
     * @return int tabletPC battery capacity.
     */
    private int getBatteryCapacity(){
	    return batteryCapacity;
    }
    /**
     * Sets tabletPC display inches.
     * @param displayInches tabletPC display inches.
     */
    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }
    /**
     * Gets tabletPC display inches.
     * @return int tabletPC display inches.
     */
    private int getDisplayInches(){
	    return displayInches;
    }
    /**
     * Sets tabletPC memory ROM.
     * @param memoryRom tabletPC memory ROM.
     */
    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }
    /**
     * Gets tabletPC memory ROM.
     * @return int tabletPC memory ROM.
     */
    private int getMemoryRom(){
	    return memoryRom;
    }
    /**
     * Sets tabletPC flash memory capacity.
     * @param flashMemoryCapacity tabletPC flash memory capacity.
     */
    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }
    /**
     * Gets tabletPC flash memory capacity.
     * @return int tabletPC flash memory capacity.
     */
    private int getFlashMemoryCapacity(){
	    return flashMemoryCapacity;
    }
    /**
     * Sets tabletPC flash color.
     * @param color tabletPC flash memory color.
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Gets tabletPC flash color.
     * @return String tabletPC flash memory color.
     */
    private String getColor(){
	    return color;
    }
    /**
     * Method for formatted output.
     * @return String formatted output.
     */
    @Override
    public String toString() {
        return super.toString() + ", BatteryCapacity: " + getBatteryCapacity() + ", DisplayInches: " + getDisplayInches() +
                ", MemoryROM: " + getMemoryRom() + ", FlashMemoryCapacity " + getFlashMemoryCapacity() + ", Color: " + getColor();
    }
}
