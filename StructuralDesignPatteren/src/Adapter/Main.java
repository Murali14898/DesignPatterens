package Adapter;

/*
 * Adapter design pattern says In your application if you are including any third party library
 * Then that library should plugged by using Adapter design patteren
 * If you follow this patteren, in future if one third party library denies for the services you can
 * easily switch to other third party library
 */

public class Main {

	public static void main(String[] args) {
		
		DataConverter d = new JSONAdapter();
		
		d.convertingData();
		
		d.formatData();

	}

}
