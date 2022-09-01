import java.util.*;
import java.text.DecimalFormat;
import java.io.*;
public class ATM {
	static HashMap<Integer, Double> accounts = accounts = new HashMap<Integer,Double>();
	private static final DecimalFormat dfZero = new DecimalFormat("0.00");
	static double balance = 0.0;
	public static void main(String[] args) {
		
		/*
		openAccount(5);
		System.out.println(checkBalance(5));
		System.out.println(depositMoney(5,10));
		System.out.println(checkBalance(5));
		System.out.println(withdrawMoney(5,2));
		System.out.println(checkBalance(5));
		*/
	}
	
	public static void openAccount(int num) {
		accounts.put(num, 0.0);
	}
	public static void openAccount(int num, double mon) {
		if(accounts.containsKey(num)) {
			accounts.put(num, accounts.get(num) + mon);
		}else {
			accounts.put(num, mon);
		}
	}
	public static void closeAccount(int num ) {
		accounts.remove(num);
	}
	public static double checkBalance(int num) {
		if(accounts.containsKey(num)) {
			return  Double.parseDouble(dfZero.format(accounts.get(num)));
		}
		return 0.0;
	}
	public static boolean depositMoney(int num, double mon) {
		if(accounts.containsKey(num)) {
			accounts.put(num, accounts.get(num) + mon);
			return true;
		}
		
		return false;
	}
	public static boolean withdrawMoney(int num, double mon) {
		if(accounts.containsKey(num) && mon <= accounts.get(num) && mon >= 0) {
			accounts.put(num, accounts.get(num) - mon);
			return true;
		}
		return false;
	}

}

