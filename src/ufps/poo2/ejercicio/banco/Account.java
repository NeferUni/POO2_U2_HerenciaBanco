

package ufps.poo2.ejercicio.banco;
//Juan Camilo Uribe Mendoza - 1152326
//Nefer Sneyder Rojas Porras - 1152307
//ANgely Sofia Pino Gonzalez - 1152315

public class Account {

	private double bal; // The current balance
	private int accnum; // The account number
	
	//poniendo las cosas aca
//	private double LimiteSobreGiro;
//	private double interest = 19;

	public Account(int a) {
		bal = 0.0;
		accnum = a;
	}

	public void deposit(double sum) {
		if (sum > 0)
			bal += sum;
		else
			System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
	}
	
//	public void deposit(double sum) {
//		if (sum > 0) {
//			bal += ((sum * interest) / 100) + sum;
//			//System.out.println("Deposit successful");
//		} else {
//			System.out.println("Error: Deposit amount should be positive");
//		}
//	}

	public void withdraw(double sum) {
		if (sum > 0)
			bal -= sum;
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}
	
//	public void withdraw(double sum) {
//		if(sum > 0) {
//			if(sum <= getBalance() + LimiteSobreGiro) {
//				bal-=sum;
//				//System.out.println("funcionando");
//			}
//			else {
//				System.out.println("error, el retiro no debe ser mayor ");
//			}
//		}
//		else {
//			System.out.println("no debe ser negativo");
//		}
//	}

	public double getBalance() {
		return bal;
	}

	public int getAccountNumber() {
		return accnum;
	}

	public String toString() {
		return "Acc " + accnum + ": " + "balance = " + bal;
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}
}
