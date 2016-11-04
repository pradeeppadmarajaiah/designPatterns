package com.bitiknow.dp.j2ee.dao;

import java.sql.Connection;
/**
 * 
 * @author pradeep
 *
 */
public class ReportDAOSQLFactory extends ReportDAOFactory {
	public static Connection createConnection() {
		return null;

	}

	public ReportDAO getReportDAO() {
		return new ReportDAOSQL();
	}
}
