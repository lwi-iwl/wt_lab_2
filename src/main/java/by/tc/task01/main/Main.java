package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.PriceComparator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.FileNotFoundException;
import java.util.List;
/**
 * The Main type.
 */

public class Main {

	/**
	 * The entry point of the application.
	 *
	 * @param args arguments of command line.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		List<Appliance> appliances;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		Criteria criteria = new Criteria(SearchCriteria.ElectricKettle.getApplianceGroup());
		//criteria.add(SearchCriteria.ElectricKettle.HEIGHT.getEnumName(), 20);
		appliances = service.find(criteria);
		if (appliances!=null) {
			for (Appliance appliance : appliances) {
				PrintApplianceInfo.print(appliance);
			}
		}
		System.out.println();
		PrintApplianceInfo.print(service.getMinPrice(new PriceComparator()));
	}

}
