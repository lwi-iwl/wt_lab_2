package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Set;

/**
 * The type to validate criteria
 */
public class Validator {

	/**
	 * Сhecking whether the product is valid
	 *
	 * @param criteria the criteria to validate
	 * @return boolean if valid
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		switch (criteria.getGroupSearchName()){
			case "ElectricKettle" -> {
				return electricKettleValidator(criteria);
			}
			case "Laptop" -> {
				return laptopValidator(criteria);
			}
			case "Oven" -> {
				return ovenValidator(criteria);
			}
			case "Refrigerator" -> {
				return refrigeratorValidator(criteria);
			}
			case "Speakers" -> {
				return speakersValidator(criteria);
			}
			case "TabletPC" -> {
				return tabletPCValidator(criteria);
			}
			case "VacuumCleaner" -> {
				return vacuumCleanerValidator(criteria);
			}
		}
		
		return false;
	}

	private static boolean electricKettleValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "batteryCapacity", "memoryRom", "capacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return false;
					};
				}
				case "name" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return false;
					};
				}
				case "height", "width" -> {
					if(!(criteria.getCriteria().get(property).getClass().getName().contains("Double") ||
							(criteria.getCriteria().get(property).getClass().getName().contains("Integer")))){
						return false;
					};
				}
				default -> {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean laptopValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "memoryRom", "systemMemory", "cpu" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return false;
					};
				}
				case "name", "os" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return false;
					};
				}
				case "batteryCapacity" -> {
					if(!(criteria.getCriteria().get(property).getClass().getName().contains("Double") ||
							(criteria.getCriteria().get(property).getClass().getName().contains("Integer")))){
						return false;
					};
				}
				default -> {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean ovenValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "weight", "capacity", "depth" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return false;
					};
				}
				case "name" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return false;
					};
				}
				case "height", "width" -> {
					if(!(criteria.getCriteria().get(property).getClass().getName().contains("Double") ||
							(criteria.getCriteria().get(property).getClass().getName().contains("Integer")))){
						return false;
					};
				}
				default -> {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean refrigeratorValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "weight", "freezerCapacity", "overallCapacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return false;
					};
				}
				case "name" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return false;
					};
				}
				case "height", "width" -> {
					if(!(criteria.getCriteria().get(property).getClass().getName().contains("Double") ||
							(criteria.getCriteria().get(property).getClass().getName().contains("Integer")))){
						return false;
					};
				}
				default -> {
					return false;
				}
			}
		}
		return true;
	}


	private static boolean speakersValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "numberOfSpeakers", "cordLength" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return false;
					};
				}
				case "name", "frequencyRange" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return false;
					};
				}
				default -> {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean tabletPCValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "batteryCapacity", "displayInches", "memoryRom", "flashMemoryCapacity" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return false;
					};
				}
				case "name", "color" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return false;
					};
				}
				default -> {
					return false;
				}
			}
		}
		return true;
	}


	private static boolean vacuumCleanerValidator(Criteria criteria){
		Set<String> applianceProperties = criteria.getCriteria().keySet();
		for (String property: applianceProperties) {
			switch (property) {
				case "price", "powerConsumption", "motorSpeedRegulation", "cleaningWidth" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("Integer")){
						return false;
					};
				}
				case "name", "filterType", "bagType", "wandType" -> {
					if (!criteria.getCriteria().get(property).getClass().getName().contains("String")){
						return false;
					};
				}
				default -> {
					return false;
				}
			}
		}
		return true;
	}
}
