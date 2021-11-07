package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type of DAO for xml data access.
 */
public class Criteria {

	/** Name of appliance group field. */
	private String groupSearchName;

	/** Map with criteria field. */
	private Map<String, Object> criteria = new HashMap<String, Object>();

	/**
	 * Public constructor.
	 * @param groupSearchName name with searching group.
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}


	/**
	 * Gets appliance group.
	 * @return String appliance group.
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Sets appliance group.
	 * @param searchCriteria key of criteria.
	 * @param value value of criteria.
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	/**
	 * Gets map with criteria.
	 * @return Map with criteria.
	 */
	public Map<String, Object> getCriteria() {
		return criteria;
	}
}
