package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.Account;
import ufps.poo2.ejercicio.banco.Bank;

public class Client {

public static void main(String[] args) {
		
		// Account acObj = new Account(0); // Genera error, ¿por qué?
		
		// ================================================
		// TESTING ACCOUNT CLASS	
		// ================================================
	
		// -------------------------------------------------
		// Debe descomentar este bloque cuando implemente las clases
		// -------------------------------------------------
//	
	
//	System.out.println("pruebas: ");
//		Account acObj = new Account(4); 
//		
//	
//		System.out.println(acObj.getBalance());
//		acObj.deposit(10);
//		acObj.deposit(40);
//		acObj.deposit(20);
//		System.out.println(acObj.getBalance());
//		acObj.withdraw(20);
//		System.out.println(acObj.getBalance());
//		
//		System.out.println("Ahora se van a evaluar las clases del banco: ");
		
		// ================================================
		// TESTING BANK CLASS	
		// ================================================
		
		// -------------------------------------------------
		// Debe descomentar este bloque cuando implemente las clases
		// -------------------------------------------------
		
		
//		Bank bank = new Bank(); 		
//		
//		bank.openAccount('A', 3354678);
//		bank.openAccount('A', 3359302);
//		bank.openAccount('C', 3379844);
//		
//		bank.payDividend(3354678, 10);
//		bank.payDividend(3354678, 30);
//		
//		System.out.println("* Val = "+bank.getBalance(3354678));
//		
//		bank.payDividend(3359302, 10);
//		bank.payDividend(3359302, 10);
//		
//		System.out.println("* Val = "+bank.getBalance(3359302));
//		
//		bank.payDividend(3379844, 10);
//		bank.payDividend(3379844, 10);
//		
//		System.out.println("* Val = "+bank.getBalance(3379844));
//
//		bank.withdrawAccount(3379844, 20);
//		bank.withdrawAccount(3379844, 5);
//		
//		System.out.println("* Val = "+bank.getBalance(3379844));
//		
//		bank.withdrawAccount(3379844, 15);
//		bank.withdrawAccount(3379844, 15);
//		
//		System.out.println("* Val = "+bank.getBalance(3379844));
//	
//		
//		bank.sendLetterToOverdraftAccounts();
//
//		bank.closeAccount('C', 3379844);
//		bank.closeAccount('A', 3359302);
//		
//		System.out.println("* Val = "+bank.getBalance(3379844));
	
		// ==================================================
	Bank bank = new Bank();
	bank.openAccount('D', 12345);
	bank.payDividend(12345, 10);
	bank.withdrawAccount(12345, 5);
	System.out.println("* Val = "+bank.getBalance(12345));
	bank.calcularRentabilidad(12345, 5);
	

	
		/*
		 	Debería obtener un resultado similar a este:
		 	
		 	* Val = 20.0
			CurrentAccount.withdraw
			CurrentAccount.withdraw
			Bank.getBalance
			Bank.payDividend ::: ac.getBalance() = -5.0
			* Val = -5.0
			CurrentAccount.withdraw
			CurrentAccount.withdraw(...): cannot withdraw this amount.
			Bank.getBalance
			Bank.payDividend ::: ac.getBalance() = -5.0
			* Val = -5.0
			Sending letter to this 3379844 account
		 */
		
	}
	
}