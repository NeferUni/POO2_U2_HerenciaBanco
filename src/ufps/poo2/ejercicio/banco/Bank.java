package ufps.poo2.ejercicio.banco;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	public List<Account> accounts;

	public Bank() {
		accounts = new ArrayList<>();
	}

	public void openAccount(char letter, int accnum) {
		try {
			switch (letter) {

			case 'A':
			SavingAccount cuenta = new SavingAccount(accnum);
			accounts.add(cuenta);
			System.out.println("Cuenta de ahorros creada");
				break;

			case 'C':
			CurrentAccount cuenta2 = new CurrentAccount(accnum);
			accounts.add(cuenta2);
			System.out.println("Cuenta corriente creada");
			break;

			default:
				break;
		}
		} catch (Exception e) {
			System.out.println("Escoge entre A o C");
		}
	}

	public void closeAccount(char letter, int accnum) {
		for (Account account : accounts) {
			if (account instanceof SavingAccount ) {
				SavingAccount cuentaAhorros = (SavingAccount) account; 
				if (cuentaAhorros.getAccountNumber()== accnum) {
					accounts.remove(cuentaAhorros);
					System.out.println("Cuenta de ahorros cerrada");
					break;
				}
			}
			if (account instanceof CurrentAccount ) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account; 
				if (cuentaCorriente.getAccountNumber()== accnum) {
					accounts.remove(cuentaCorriente);
					System.out.println("Cuenta corriente cerrada:");
					break;
				}
			}
		}
	}
	

	public void payDividend(int accnum, int sum) {
		for (Account account : accounts) {
			if (account instanceof SavingAccount ) {
				SavingAccount cuentaAhorros = (SavingAccount) account; 
				if (cuentaAhorros.getAccountNumber()== accnum) {
					cuentaAhorros.deposit(sum);
					
				}
			}
			if (account instanceof CurrentAccount ) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account; 
				if (cuentaCorriente.getAccountNumber()== accnum) {
					cuentaCorriente.deposit(sum);
				}
			}
		}
	}

	public double getBalance(int accnum) {
		for (Account account : accounts) {
			if (account instanceof SavingAccount ) {
				SavingAccount cuentaAhorros = (SavingAccount) account; 
				if (cuentaAhorros.getAccountNumber()== accnum) {
					Account cuenta = cuentaAhorros;
					return cuenta.getBalance();
				}
			}
			if (account instanceof CurrentAccount ) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account; 
				if (cuentaCorriente.getAccountNumber()== accnum) {
					Account cuenta = cuentaCorriente;
					return cuenta.getBalance();
				}
			}
		}
		return 0;
	}

	public void withdrawAccount(int accnum, int sum) {
		for (Account account : accounts) {
			if (account instanceof SavingAccount ) {
				SavingAccount cuentaAhorros = (SavingAccount) account; 
				if (cuentaAhorros.getAccountNumber()== accnum) {
					cuentaAhorros.withdraw(sum);
				}
			}
			if (account instanceof CurrentAccount ) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account; 
				if (cuentaCorriente.getAccountNumber()== accnum) {
					cuentaCorriente.withdraw(sum);
				}
			}
		}
    }

	public void sendLetterToOverdraftAccounts() {
		for (Account account : accounts) {
			if (account instanceof CurrentAccount ) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account; 
				if (cuentaCorriente.getBalance() < 0) {
					Account cuenta = cuentaCorriente;
					System.out.println("La cuenta: " + cuenta.getAccountNumber() + " esta en sobregiro");
				}
			}
		}
	}

    public void deposit(int i, int j) {
    }
}