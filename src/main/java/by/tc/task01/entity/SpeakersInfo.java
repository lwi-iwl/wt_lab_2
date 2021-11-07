package by.tc.task01.entity;

public class SpeakersInfo extends Appliance{
	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;

	public void setPowerConsumption(int powerConsumption){
	    this.powerConsumption = powerConsumption;
    }

    private int getPowerConsumption(){
	    return powerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers){
	    this.numberOfSpeakers = numberOfSpeakers;
    }

    private int getNumberOfSpeakers(){
	    return numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange){
	    this.frequencyRange = frequencyRange;
    }

    private String getFrequencyRange(){
	    return frequencyRange;
    }

    public void setCordLength(int cordLength){
	    this.cordLength = cordLength;
    }

    private int getCordLength(){
	    return cordLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", NumberOfSpeakers: " + getNumberOfSpeakers() +
                ", FrequencyRange: " + getFrequencyRange() + ", CordLength " + getCordLength();
    }

}
