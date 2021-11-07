package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

/**
 * The type of factory for creating ApplianceDAO instance.
 */
public final class DAOFactory {
	/** DAOFactory instance field. */
	private static final DAOFactory instance = new DAOFactory();

	/** ApplianceDAO instance field. */
	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

	/**
	 * Private constructor.
	 */
	private DAOFactory() {}


	/**
	 * Gets ApplianceDAO instance.
	 *
	 * @return ApplianceDAO instance.
	 */
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}


	/**
	 * Gets DAOFactory instance.
	 *
	 * @return DAOFactory instance.
	 */
	public static DAOFactory getInstance() {
		return instance;
	}
}
