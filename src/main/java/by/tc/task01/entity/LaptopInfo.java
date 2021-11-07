package by.tc.task01.entity;

public class LaptopInfo extends Appliance{
    private float batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private float cpu;
    private int displayInches;

    public void setBatteryCapacity(float batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

    private float getBatteryCapacity(){
        return batteryCapacity;
    }

    public void setOs(String os){
        this.os = os;
    }

    private String getOs(){
        return os;
    }

    public void setMemoryRom(int memoryRom){
        this.memoryRom = memoryRom;
    }

    private int getMemoryRom(){
        return memoryRom;
    }

    public void setSystemMemory(int systemMemory){
        this.systemMemory = systemMemory;
    }

    private int getSystemMemory(){
        return systemMemory;
    }

    public  void setCpu(float cpu){
        this.cpu = cpu;
    }

    private float getCpu(){
        return cpu;
    }

    public void setDisplayInches(int displayInches){
        this.displayInches = displayInches;
    }

    private int getDisplayInches(){
        return displayInches;
    }

    @Override
    public String toString() {
        return super.toString() + ", BatteryCapacity: " + getBatteryCapacity() + ", OS: " + getOs() + ", MemoryROM: " +
                getMemoryRom() + ", SystemMemory: " + getSystemMemory() + ", CPU: " + getCpu() + ", DisplayInches: " + getDisplayInches();
    }
}
