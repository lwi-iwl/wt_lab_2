package by.tc.task01.entity;

public class TabletPCInfo extends Appliance{
	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;

	public void setBatteryCapacity(int batteryCapacity){
	    this.batteryCapacity = batteryCapacity;
    }

    private int getBatteryCapacity(){
	    return batteryCapacity;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    private int getDisplayInches(){
	    return displayInches;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    private int getMemoryRom(){
	    return memoryRom;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    private int getFlashMemoryCapacity(){
	    return flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String getColor(){
	    return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", BatteryCapacity: " + getBatteryCapacity() + ", DisplayInches: " + getDisplayInches() +
                ", MemoryROM: " + getMemoryRom() + ", FlashMemoryCapacity " + getFlashMemoryCapacity() + ", Color: " + getColor();
    }
}
