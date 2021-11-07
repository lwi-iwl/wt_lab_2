package by.tc.task01.service;

import by.tc.task01.service.impl.ApplianceServiceImpl;

/**
 * The type of factory for creating ApplianceService instance.
 */
public final class ServiceFactory {
	/** ServiceFactory instance field. */
	private static final ServiceFactory instance = new ServiceFactory();

	/** ApplianceService instance field. */
	private final ApplianceService applianceService = new ApplianceServiceImpl();

	/**
	 * Private constructor.
	 */
	private ServiceFactory() {}

	/**
	 * Gets ApplianceService instance.
	 *
	 * @return ApplianceService instance.
	 */
	public ApplianceService getApplianceService() {

		return applianceService;
	}

	/**
	 * Gets new ApplianceService object.
	 *
	 * @return ServiceFactory instance.
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}

}
