package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;

/**
 * Interface for appliance data service.
 */
public interface ApplianceService {

	/**
	 * Searcher for appliances by criteria.
	 *
	 * @param criteria the criteria for search.
	 * @return list of found appliances.
	 */
	List<Appliance> find(Criteria criteria) throws FileNotFoundException;

	/**
	 * Searcher for min appliance by criteria.
	 *
	 * @param comparator the comparator for price comparing.
	 * @return the found appliance.
	 */
	Appliance getMinPrice(Comparator<Appliance> comparator);
}
