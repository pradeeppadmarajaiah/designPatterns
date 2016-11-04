package com.bitiknow.dp.j2ee.dao;

import java.sql.Connection;

public class ReportDAOFileFactory extends ReportDAOFactory {

	public static Connection createConnection() {
		return null;

	}

	public ReportDAO getReportDAO() {
		// OracleDbCustomerDAO implements CustomerDAO
		return new ReportDAOFile();
	}

}
