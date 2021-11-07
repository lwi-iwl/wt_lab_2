package by.tc.task01.entity.criteria;

import java.util.ArrayList;

public final class SearchCriteria {

	public static enum Oven{
		PRICE("price"), NAME("name"), POWER_CONSUMPTION("powerConsumption"), WEIGHT("weight"), CAPACITY("capacity"), DEPTH("depth"), HEIGHT("height"), WIDTH("width");
		private String enumName;
		Oven(String enumName) {
			this.enumName = enumName;
		}
		public String getEnumName(){
			return enumName;
		};


		public static String getApplianceType() {
			return "Oven";
		}
	}
	
	public static enum Laptop{
		PRICE("price"), NAME("name"), BATTERY_CAPACITY("batteryCapacity"), OS("os"), MEMORY_ROM("memoryRom"), SYSTEM_MEMORY("systemMemory"), CPU("cpu"), DISPLAY_INCHS("displayInches");
		public static String getApplianceType() {
			return "Laptop";
		}

		private String enumName;
		Laptop(String enumName) {
			this.enumName = enumName;
		}
		public String getEnumName(){
			return enumName;
		};

	}
	
	public static enum Refrigerator{
		PRICE("price"), NAME("name"), POWER_CONSUMPTION("powerConsumption"), WEIGHT("weight"), FREEZER_CAPACITY("freezerCapacity"), OVERALL_CAPACITY("overallCapacity"), HEIGHT("height"), WIDTH("width");
		public static String getApplianceType() {
			return "Refrigerator";
		}
		private String enumName;
		Refrigerator(String enumName) {
			this.enumName = enumName;
		}
		public String getEnumName(){
			return enumName;
		};

	}
	
	public static enum VacuumCleaner{
		PRICE("price"), NAME("name"), POWER_CONSUMPTION("powerConsumption"), FILTER_TYPE("filterType"), BAG_TYPE("bagType"), WAND_TYPE("wandType"), MOTOR_SPEED_REGULATION("motorSpeedRegulation"), CLEANING_WIDTH("cleaningWidth");
		public static String getApplianceType() {
			return "VacuumCleaner";
		}
		private String enumName;
		VacuumCleaner(String enumName) {
			this.enumName = enumName;
		}
		public String getEnumName(){
			return enumName;
		};

	}
	
	public static enum TabletPC{
		PRICE("price"), NAME("name"), BATTERY_CAPACITY("batteryCapacity"), DISPLAY_INCHES("displayInches"), MEMORY_ROM("memoryRom"), FLASH_MEMORY_CAPACITY("flashMemoryCapacity"), COLOR("color")	;
		public static String getApplianceType() {
			return "TabletPC";
		}
		private String enumName;
		TabletPC(String enumName) {
			this.enumName = enumName;
		}
		public String getEnumName(){
			return enumName;
		};

	}
	
	public static enum Speakers{
		PRICE("price"), NAME("name"), POWER_CONSUMPTION("powerConsumption"), NUMBER_OF_SPEAKERS("numberOfSpeakers"), FREQUENCY_RANGE("frequencyRange"), CORD_LENGTH("cordLength");
		public static String getApplianceType() {
			return "Speakers";
		}
		private String enumName;
		Speakers(String enumName) {
			this.enumName = enumName;
		}
		public String getEnumName(){
			return enumName;
		};

	}

	public static enum ElectricKettle{
		PRICE("price"), NAME("name"), POWER_CONSUMPTION("powerConsumption"), WEIGHT("weight"), CAPACITY("capacity"), HEIGHT("height"), WIDTH("width");
		public static String getApplianceType() {
			return "ElectricKettle";
		}
		private String enumName;
		ElectricKettle(String enumName) {
			this.enumName = enumName;
		}
		public String getEnumName(){
			return enumName;
		};

	}
	
	private SearchCriteria() {}
}

