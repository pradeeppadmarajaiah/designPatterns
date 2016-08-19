package com.bitiknow.dp.singleton;

public class BillPughSingleTon {

	private BillPughSingleTon() {
		// TODO Auto-generated constructor stub
	}

	private static class BillPughSingleTonInner {
		private static final BillPughSingleTon SINGLE_TON = new BillPughSingleTon();

	}

	public static BillPughSingleTon getInstance() {
		return BillPughSingleTonInner.SINGLE_TON;
	}

}
