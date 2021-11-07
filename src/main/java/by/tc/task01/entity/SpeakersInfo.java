package by.tc.task01.entity;
/**
 * The type of speakers.
 */
public class SpeakersInfo extends Appliance{
    /** Speakers power consumption field. */
	private int powerConsumption;
    /** Speakers number of speakers field. */
	private int numberOfSpeakers;
    /** Speakers frequency range field. */
	private String frequencyRange;
    /** Speakers cord length field. */
	private int cordLength;
    /**
     * Sets speakers power consumption.
     * @param powerConsumption speakers power consumption.
     */
	public void setPowerConsumption(int powerConsumption){
	    this.powerConsumption = powerConsumption;
    }
    /**
     * Gets speakers power consumption.
     * @return int speakers power consumption.
     */
    private int getPowerConsumption(){
	    return powerConsumption;
    }
    /**
     * Sets speakers number of speakers.
     * @param numberOfSpeakers speakers number of speakers.
     */
    public void setNumberOfSpeakers(int numberOfSpeakers){
	    this.numberOfSpeakers = numberOfSpeakers;
    }
    /**
     * Gets speakers number of speakers.
     * @return int speakers number of speakers.
     */
    private int getNumberOfSpeakers(){
	    return numberOfSpeakers;
    }
    /**
     * Sets speakers frequency range.
     * @param frequencyRange speakers frequency range.
     */
    public void setFrequencyRange(String frequencyRange){
	    this.frequencyRange = frequencyRange;
    }
    /**
     * Gets speakers frequency range.
     * @return String speakers frequency range.
     */
    private String getFrequencyRange(){
	    return frequencyRange;
    }
    /**
     * Sets speakers cord range.
     * @param cordLength speakers cord range.
     */
    public void setCordLength(int cordLength){
	    this.cordLength = cordLength;
    }
    /**
     * Gets speakers cord range.
     * @return int speakers cord range.
     */
    private int getCordLength(){
	    return cordLength;
    }
    /**
     * Method for formatted output.
     * @return String formatted output.
     */
    @Override
    public String toString() {
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", NumberOfSpeakers: " + getNumberOfSpeakers() +
                ", FrequencyRange: " + getFrequencyRange() + ", CordLength " + getCordLength();
    }

}
