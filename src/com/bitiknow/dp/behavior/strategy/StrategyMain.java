package com.bitiknow.dp.behavior.strategy;

public class StrategyMain {
	public static void main(String[] args) {

		OrderExportContext contextPDF = new OrderExportContext(new OrderExportDetailsByPdf());
		contextPDF.export();

		OrderExportContext contextDoc = new OrderExportContext(new OrderExportDetailsByDocument());
		contextDoc.export();

		OrderExportContext contextText = new OrderExportContext(new OrderExportDetailsByText());
		contextText.export();

	}

}