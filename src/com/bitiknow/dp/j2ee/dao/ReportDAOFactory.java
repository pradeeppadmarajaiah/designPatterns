package com.bitiknow.dp.j2ee.dao;

/**
 * 
 * @author pradeep
 *
 */
public abstract class ReportDAOFactory {

	// Supported ReportDAOFactory types
	public static final int SQL = 1;
	public static final int DB2 = 2;
	public static final int FILE = 3;

	public abstract ReportDAO getReportDAO();

	public static ReportDAOFactory getDAOFactoryInstance(int factoryType) {

		switch (factoryType) {
		case SQL:
			return new ReportDAOSQLFactory();
		case DB2:
			return new ReportDAODB2Fatory();
		case FILE:
			return new ReportDAOFileFactory();
		default:
			return null;
		}
	}

}
