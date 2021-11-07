package by.tc.task01.entity;

public class VacuumCleanerInfo extends Appliance{
	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    private int getPowerConsumption(){
        return powerConsumption;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    private String getFilterType(){
        return filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    private String getBagType(){
        return bagType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    private String getWandType(){
        return wandType;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    private int getMotorSpeedRegulation(){
        return motorSpeedRegulation;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    private int getCleaningWidth(){
        return cleaningWidth;
    }

    @Override
    public String toString() {
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", FilterType: " + getFilterType() +
                ", BagType: " + getBagType() + ", WandType " + getWandType() + ", MotorSpeedRegulation: " + getMotorSpeedRegulation() +
                ", CleaningWidth: " + getCleaningWidth();
    }
}
