import java.util.*;
import java.io.*;
public class ATM {
	static HashMap<Integer, Double> accounts;
	static double balance = 0.0;
	public static void main(String[] args) {
		accounts = new HashMap<Integer,Double>();
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
		return accounts.get(num);
	}
	public static boolean depositMoney(int num, double mon) {
		if(accounts.containsKey(num)) {
			accounts.put(num, accounts.get(num) + mon);
			return true;
		}
		
		return false;
	}
	public static boolean withdrawMoney(int num, double mon) {
		if(accounts.containsKey(num) && accounts.get(num)-mon >=0 ) {
			accounts.put(num, accounts.get(num) - mon);
			return true;
		}
		return false;
	}

}

