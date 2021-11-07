package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Interface of DAO for xml data access.
 */
public interface ApplianceDAO {
	/**
	 * Searcher for appliances by criteria.
	 *
	 * @param criteria the criteria for search.
	 * @return list of found appliances.
	 */
	List<Appliance> find(Criteria criteria) throws FileNotFoundException;

	/**
	 * Searcher for all appliances.
	 *
	 * @return list of all appliances.
	 */
	List<Appliance> getAll();
}
