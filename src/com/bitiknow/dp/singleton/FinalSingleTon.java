package com.bitiknow.dp.singleton;

public class FinalSingleTon {
	 private static final long serialVersionUID = 1L;
	 
	    private FinalSingleTon() {
	        // private constructor
	    }
	 
	    private static class FinalSingleTonHolder {
	        public static final FinalSingleTon INSTANCE = new FinalSingleTon();
	    }
	 
	    public static FinalSingleTon getInstance() {
	        return FinalSingleTonHolder.INSTANCE;
	    }
	 
	    protected Object readResolve() {
	        return getInstance();
	    }

}
