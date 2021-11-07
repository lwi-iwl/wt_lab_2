package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

/**
 * The type for printing appliance info.
 */
public class PrintApplianceInfo {

	/**
	 * Printer of appliance info.
	 *
	 * @param appliance to print.
	 */
	public static void print(Appliance appliance) {
		System.out.println(appliance.toString());
	}

}
