package com.bitiknow.dp.j2ee.dao;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Report report = new Report(1, ReportType.RED, LocalDate.now(), LocalDate.now(), 256, "eadd/txt");
		ReportDAOFactory daoFactory = ReportDAOFactory.getDAOFactoryInstance(ReportDAOFactory.SQL);
		ReportDAO reportDAO = daoFactory.getReportDAO();
		reportDAO.insertReport(report);
	}

}
