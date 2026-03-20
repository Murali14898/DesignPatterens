package Adapter;

/*
 * Adapter design pattern says In your application if you are including any third party library
 * Then that library should plugged by using Adapter design patteren
 * If you follow this patteren, in future if one third party library denies for the services you can
 * easily switch to other third party library
 * 
 * Ex2: Taking Zomoto as example
 * Suppose Zomoto is accepting the money you paid for food Via SBI bank
 * After few days SBI BANK stops its service providing to Zomato
 * If zomato didn't follow the Adapter DP then Switching to Different bank causes problem like
 *  1. Removing all code which was written for SBI bank
 *  2. Tightly coupled
 *  
 *  Ex3: In phone pe you are checking the balance for different bank account of yours.
 *  
 *  How phone pe added this by using Adapter dp
 */

public class Main {

	public static void main(String[] args) {
		
		DataConverter d = new JSONAdapter();
		
		d.convertingData();
		
		d.formatData();

	}

}
