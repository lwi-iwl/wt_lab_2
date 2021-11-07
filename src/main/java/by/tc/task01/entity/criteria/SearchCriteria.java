package by.tc.task01.entity.criteria;

import java.util.ArrayList;

/**
 * The type for to store data with group search criteria.
 */
public final class SearchCriteria {

	/**
	 * Enum for oven criteria
	 */
	public static enum Oven{
		/**
		 * Price oven.
		 */
		PRICE("price"),
		/**
		 * Name oven.
		 */
		NAME("name"),
		/**
		 * PowerConsumption oven.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Weight oven.
		 */
		WEIGHT("weight"),
		/**
		 * Capacity oven.
		 */
		CAPACITY("capacity"),
		/**
		 * Depth oven.
		 */
		DEPTH("depth"),
		/**
		 * Height oven.
		 */
		HEIGHT("height"),
		/**
		 * Width oven.
		 */
		WIDTH("width");
		/** Enum name field. */
		private String enumName;

		/**
		 * Sets enum name.
		 * @param enumName enum name.
		 */
		Oven(String enumName) {
			this.enumName = enumName;
		}

		/**
		 * Gets enum name.
		 * @return String enum name.
		 */
		public String getEnumName(){
			return enumName;
		};

		/**
		 * Gets appliance group.
		 * @return String enum name.
		 */
		public static String getApplianceGroup() {
			return "Oven";
		}
	}

	/**
	 * Enum for laptop criteria
	 */
	public static enum Laptop{
		/**
		 * Price laptop.
		 */
		PRICE("price"),
		/**
		 * Name laptop.
		 */
		NAME("name"),
		/**
		 * Battery capacity laptop.
		 */
		BATTERY_CAPACITY("batteryCapacity"),
		/**
		 * OS laptop.
		 */
		OS("os"),
		/**
		 * Memory ROM laptop.
		 */
		MEMORY_ROM("memoryRom"),
		/**
		 * System memory laptop.
		 */
		SYSTEM_MEMORY("systemMemory"),
		/**
		 * CPU laptop.
		 */
		CPU("cpu"),
		/**
		 * Display inches laptop.
		 */
		DISPLAY_INCHS("displayInches");

		/**
		 * Gets appliance group.
		 * @return String enum name.
		 */
		public static String getApplianceGroup() {
			return "Laptop";
		}

		/** Enum name field. */
		private String enumName;
		/**
		 * Sets enum name.
		 * @param enumName enum name.
		 */

		Laptop(String enumName) {
			this.enumName = enumName;
		}
		/**
		 * Gets enum name.
		 * @return String enum name.
		 */
		public String getEnumName(){
			return enumName;
		};

	}
	/**
	 * Enum for refrigerator criteria
	 */
	public static enum Refrigerator{
		/**
		 * Price refrigerator.
		 */
		PRICE("price"),
		/**
		 * Name refrigerator.
		 */
		NAME("name"),
		/**
		 * Power consumption refrigerator.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Weight refrigerator.
		 */
		WEIGHT("weight"),
		/**
		 * Freezer capacity refrigerator.
		 */
		FREEZER_CAPACITY("freezerCapacity"),
		/**
		 * Overall capacity refrigerator.
		 */
		OVERALL_CAPACITY("overallCapacity"),
		/**
		 * Height refrigerator.
		 */
		HEIGHT("height"),
		/**
		 * Width refrigerator.
		 */
		WIDTH("width");
		/**
		 * Gets appliance group.
		 * @return String enum name.
		 */
		public static String getApplianceGroup() {
			return "Refrigerator";
		}
		/** Enum name field. */
		private String enumName;
		/**
		 * Sets enum name.
		 * @param enumName enum name.
		 */
		Refrigerator(String enumName) {
			this.enumName = enumName;
		}
		/**
		 * Gets enum name.
		 * @return String enum name.
		 */
		public String getEnumName(){
			return enumName;
		};

	}
	/**
	 * Enum for vacuum cleaner criteria
	 */
	public static enum VacuumCleaner{
		/**
		 * Price vacuum cleaner.
		 */
		PRICE("price"),
		/**
		 * Name vacuum cleaner.
		 */
		NAME("name"),
		/**
		 * Power consumption vacuum cleaner.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Filter type vacuum cleaner.
		 */
		FILTER_TYPE("filterType"),
		/**
		 * Bag type vacuum cleaner.
		 */
		BAG_TYPE("bagType"),
		/**
		 * Wand type vacuum cleaner.
		 */
		WAND_TYPE("wandType"),
		/**
		 * Motor speed regulation vacuum cleaner.
		 */
		MOTOR_SPEED_REGULATION("motorSpeedRegulation"),
		/**
		 * Cleaning width vacuum cleaner.
		 */
		CLEANING_WIDTH("cleaningWidth");
		/**
		 * Gets appliance group.
		 * @return String enum name.
		 */
		public static String getApplianceGroup() {
			return "VacuumCleaner";
		}
		/** Enum name field. */
		private String enumName;
		/**
		 * Sets enum name.
		 * @param enumName enum name.
		 */
		VacuumCleaner(String enumName) {
			this.enumName = enumName;
		}
		/**
		 * Gets enum name.
		 * @return String enum name.
		 */

		public String getEnumName(){
			return enumName;
		};

	}

	/**
	 * Enum for tabletPC criteria
	 */
	public static enum TabletPC{
		/**
		 * Price tabletPC.
		 */
		PRICE("price"),
		/**
		 * Name tabletPC.
		 */
		NAME("name"),
		/**
		 * Battery capacity tabletPC.
		 */
		BATTERY_CAPACITY("batteryCapacity"),
		/**
		 * Display inches tabletPC.
		 */
		DISPLAY_INCHES("displayInches"),
		/**
		 * Memory ROM tabletPC.
		 */
		MEMORY_ROM("memoryRom"),
		/**
		 * Flash memory capacity tabletPC.
		 */
		FLASH_MEMORY_CAPACITY("flashMemoryCapacity"),
		/**
		 * Color tabletPC.
		 */
		COLOR("color");
		/**
		 * Gets appliance group.
		 * @return String enum name.
		 */
		public static String getApplianceGroup() {
			return "TabletPC";
		}
		/** Enum name field. */
		private String enumName;
		/**
		 * Sets enum name.
		 * @param enumName enum name.
		 */

		TabletPC(String enumName) {
			this.enumName = enumName;
		}
		/**
		 * Gets enum name.
		 * @return String enum name.
		 */
		public String getEnumName(){
			return enumName;
		};

	}

	/**
	 * Enum for speakers criteria
	 */
	public static enum Speakers{
		/**
		 * Price speakers.
		 */
		PRICE("price"),
		/**
		 * Name speakers.
		 */
		NAME("name"),
		/**
		 * Power consumption speakers.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Number of speakers.
		 */
		NUMBER_OF_SPEAKERS("numberOfSpeakers"),
		/**
		 * Frequency range speakers.
		 */
		FREQUENCY_RANGE("frequencyRange"),
		/**
		 * Cord length speakers.
		 */
		CORD_LENGTH("cordLength");
		/**
		 * Gets appliance group.
		 * @return String enum name.
		 */
		public static String getApplianceGroup() {
			return "Speakers";
		}
		/** Enum name field. */
		private String enumName;
		/**
		 * Sets enum name.
		 * @param enumName enum name.
		 */
		Speakers(String enumName) {
			this.enumName = enumName;
		}
		/**
		 * Gets enum name.
		 * @return String enum name.
		 */
		public String getEnumName(){
			return enumName;
		};

	}

	/**
	 * Enum for electric kettle criteria
	 */
	public static enum ElectricKettle{
		/**
		 * Price electric kettle.
		 */
		PRICE("price"),
		/**
		 * Name electric kettle.
		 */
		NAME("name"),
		/**
		 * Power consumption electric kettle.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Weight electric kettle.
		 */
		WEIGHT("weight"),
		/**
		 * Capacity electric kettle.
		 */
		CAPACITY("capacity"),
		/**
		 * Height electric kettle.
		 */
		HEIGHT("height"),
		/**
		 * Width electric kettle.
		 */
		WIDTH("width");
		/**
		 * Gets appliance group.
		 * @return String enum name.
		 */
		public static String getApplianceGroup() {
			return "ElectricKettle";
		}
		/** Enum name field. */
		private String enumName;
		/**
		 * Sets enum name.
		 * @param enumName enum name.
		 */
		ElectricKettle(String enumName) {
			this.enumName = enumName;
		}
		/**
		 * Gets enum name.
		 * @return String enum name.
		 */
		public String getEnumName(){
			return enumName;
		};

	}
	/**
	 * Private constructor.
	 */
	private SearchCriteria() {}
}

