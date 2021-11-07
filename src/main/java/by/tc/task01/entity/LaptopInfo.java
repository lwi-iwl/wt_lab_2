package by.tc.task01.entity;

/**
 * The type of laptop.
 */
public class LaptopInfo extends Appliance{
    /** Laptop battery capacity field. */
    private float batteryCapacity;
    /** Laptop OS field. */
    private String os;
    /** Laptop memory ROM field. */
    private int memoryRom;
    /** Laptop system memory field. */
    private int systemMemory;
    /** Laptop CPU field. */
    private float cpu;
    /** Laptop display inches field. */
    private int displayInches;
    /**
     * Sets laptop battery capacity.
     * @param batteryCapacity laptop battery capacity.
     */
    public void setBatteryCapacity(float batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }
    /**
     * Gets laptop battery capacity.
     * @return float laptop battery capacity.
     */
    private float getBatteryCapacity(){
        return batteryCapacity;
    }
    /**
     * Sets laptop OS.
     * @param os laptop OS.
     */
    public void setOs(String os){
        this.os = os;
    }
    /**
     * Gets laptop OS.
     * @return String laptop OS.
     */
    private String getOs(){
        return os;
    }
    /**
     * Sets laptop memory ROM.
     * @param memoryRom laptop memory ROM.
     */
    public void setMemoryRom(int memoryRom){
        this.memoryRom = memoryRom;
    }
    /**
     * Gets laptop memory ROM.
     * @return int laptop memory ROM.
     */
    private int getMemoryRom(){
        return memoryRom;
    }
    /**
     * Sets laptop system memory.
     * @param systemMemory laptop system memory.
     */
    public void setSystemMemory(int systemMemory){
        this.systemMemory = systemMemory;
    }
    /**
     * Gets laptop system memory.
     * @return int laptop system memory.
     */
    private int getSystemMemory(){
        return systemMemory;
    }
    /**
     * Sets laptop CPU.
     * @param cpu laptop CPU.
     */
    public  void setCpu(float cpu){
        this.cpu = cpu;
    }
    /**
     * Gets laptop CPU.
     * @return float laptop CPU.
     */
    private float getCpu(){
        return cpu;
    }
    /**
     * Sets laptop display inches.
     * @param displayInches laptop display inches.
     */
    public void setDisplayInches(int displayInches){
        this.displayInches = displayInches;
    }
    /**
     * Gets laptop display inches.
     * @return int laptop display inches.
     */
    private int getDisplayInches(){
        return displayInches;
    }
    /**
     * Method for formatted output.
     * @return String formatted output.
     */
    @Override
    public String toString() {
        return super.toString() + ", BatteryCapacity: " + getBatteryCapacity() + ", OS: " + getOs() + ", MemoryROM: " +
                getMemoryRom() + ", SystemMemory: " + getSystemMemory() + ", CPU: " + getCpu() + ", DisplayInches: " + getDisplayInches();
    }
}
