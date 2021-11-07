package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * The type for appliance data service
 */
public class ApplianceServiceImpl implements ApplianceService{

	/**
	 * Searcher for appliances by criteria.
	 *
	 * @param criteria the criteria for search
	 * @return list of found appliances
	 */
	@Override
	public List<Appliance> find(Criteria criteria) throws FileNotFoundException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		List<Appliance> appliances = applianceDAO.find(criteria);
		return appliances;
	}

	/**
	 * Searcher for appliances by criteria.
	 *
	 * @param comparator the comparator for price comparing
	 * @return the found appliance
	 */
	public Appliance getMinPrice(Comparator<Appliance> comparator){
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		List<Appliance> appliances = applianceDAO.getAll();
		appliances.sort(comparator);
		//for (Appliance appliance:appliances){
		//	System.out.println(appliance);
		//}
		return appliances.get(0);
	}

}