/**
 * 
 */
package com.bitiknow.dp.j2ee.dao;

/**
 * @author pradeep
 *
 */
public interface ReportDAO {
	public int insertReport(Report report);

	public boolean deleteReport(Report report);

	public Report findReport(int reportId);

}
