package com.bitiknow.dp.j2ee.dao;

import java.time.LocalDate;

/**
 * 
 * @author pradeep
 *
 */
public class Report {

	private int reportId;
	private ReportType reportType;
	private LocalDate dateCreated;
	private LocalDate dateModified;
	private int size;
	private String sourceFileName;

	/**
	 * 
	 */
	public Report() {
	}

	/**
	 * @param reportId
	 * @param reportType
	 * @param dateCreated
	 * @param dateModified
	 * @param size
	 * @param sourceFileName
	 */
	public Report(int reportId, ReportType reportType, LocalDate dateCreated, LocalDate dateModified, int size,
			String sourceFileName) {
		this.reportId = reportId;
		this.reportType = reportType;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.size = size;
		this.sourceFileName = sourceFileName;
	}

	/**
	 * @return the reportId
	 */
	public final int getReportId() {
		return reportId;
	}

	/**
	 * @param reportId
	 *            the reportId to set
	 */
	public final void setReportId(int reportId) {
		this.reportId = reportId;
	}

	/**
	 * @return the reportType
	 */
	public final ReportType getReportType() {
		return reportType;
	}

	/**
	 * @param reportType
	 *            the reportType to set
	 */
	public final void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

	/**
	 * @return the dateCreated
	 */
	public final LocalDate getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            the dateCreated to set
	 */
	public final void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the dateModified
	 */
	public final LocalDate getDateModified() {
		return dateModified;
	}

	/**
	 * @param dateModified
	 *            the dateModified to set
	 */
	public final void setDateModified(LocalDate dateModified) {
		this.dateModified = dateModified;
	}

	/**
	 * @return the size
	 */
	public final int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public final void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the sourceFileName
	 */
	public final String getSourceFileName() {
		return sourceFileName;
	}

	/**
	 * @param sourceFileName
	 *            the sourceFileName to set
	 */
	public final void setSourceFileName(String sourceFileName) {
		this.sourceFileName = sourceFileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", " + (reportType != null ? "reportType=" + reportType + ", " : "")
				+ (dateCreated != null ? "dateCreated=" + dateCreated + ", " : "")
				+ (dateModified != null ? "dateModified=" + dateModified + ", " : "") + "size=" + size + ", "
				+ (sourceFileName != null ? "sourceFileName=" + sourceFileName : "") + "]";
	}

}
