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

			case 'D':
				Cdt cuenta3 = new Cdt(accnum);
				accounts.add(cuenta3);
				System.out.println("Cuenta cdt creada");
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
			if (account instanceof SavingAccount) {
				SavingAccount cuentaAhorros = (SavingAccount) account;
				if (cuentaAhorros.getAccountNumber() == accnum) {
					accounts.remove(cuentaAhorros);
					System.out.println("Cuenta de ahorros cerrada");
					break;
				}
			}
			if (account instanceof CurrentAccount) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account;
				if (cuentaCorriente.getAccountNumber() == accnum) {
					accounts.remove(cuentaCorriente);
					System.out.println("Cuenta corriente cerrada:");
					break;
				}
			}
			if (account instanceof Cdt) {
				Cdt cuentaCdt = (Cdt) account;
				if (cuentaCdt.getAccountNumber() == accnum) {
					accounts.remove(cuentaCdt);
					System.out.println("Cuenta Cdt cerrada:");
					break;
				}
			}

		}
	}

	public void payDividend(int accnum, int sum) {
		for (Account account : accounts) {
			if (account instanceof SavingAccount) {
				SavingAccount cuentaAhorros = (SavingAccount) account;
				if (cuentaAhorros.getAccountNumber() == accnum) {
					System.out.println("deposito hecho a la cuenta ahorros");
					cuentaAhorros.deposit(sum);

				}
			}
			if (account instanceof CurrentAccount) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account;
				if (cuentaCorriente.getAccountNumber() == accnum) {
					System.out.println("deposito hecho a la cuenta corriente");
					cuentaCorriente.deposit(sum);

				}
				
			}
			if (account instanceof Cdt) {
				Cdt cuentaCdt = (Cdt) account;
				if (cuentaCdt.getAccountNumber() == accnum) {
					System.out.println("deposito hecho a la cuenta Cdt");
					cuentaCdt.deposit(sum);
				}
			}

		}
	}

	public void calcularRentabilidad(int accnum, int dias) {
		for (Account account : accounts) {
			if (account instanceof Cdt) {
				Cdt cuentaCdt = (Cdt) account;
				if (cuentaCdt.getAccountNumber() == accnum) {
					System.out.println("la rentabilidad más el valor del balance es: " + cuentaCdt.calcularRentabilidad(dias));
				}
			}
		}
	}

	public String getBalance(int accnum) {
		for (Account account : accounts) {
			if (account instanceof SavingAccount) {
				SavingAccount cuentaAhorros = (SavingAccount) account;
				if (cuentaAhorros.getAccountNumber() == accnum) {
					Account cuenta = cuentaAhorros;
					return Double.toString(cuenta.getBalance());
				}
			}
			if (account instanceof CurrentAccount) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account;
				if (cuentaCorriente.getAccountNumber() == accnum) {
					Account cuenta = cuentaCorriente;
					return Double.toString(cuenta.getBalance());
				}
			}
			if (account instanceof Cdt) {
				Cdt cuentaCdt = (Cdt) account;
				if (cuentaCdt.getAccountNumber() == accnum) {
					Account cuenta = cuentaCdt;
					return Double.toString(cuenta.getBalance());
				}
			}
		}
		return ("No hay cuenta asociada");
	}

	public void withdrawAccount(int accnum, int sum) {
		for (Account account : accounts) {
			if (account instanceof SavingAccount) {
				SavingAccount cuentaAhorros = (SavingAccount) account;
				if (cuentaAhorros.getAccountNumber() == accnum) {
					System.out.println("retiro hecho a la cuenta de ahorros");
					cuentaAhorros.withdraw(sum);

				}
			}
			if (account instanceof CurrentAccount) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account;
				if (cuentaCorriente.getAccountNumber() == accnum) {
					System.out.println("retiro hecho a la cuenta corriente");
					cuentaCorriente.withdraw(sum);

				}
			}
			if (account instanceof Cdt) {
				Cdt cuentaCdt = (Cdt) account;
				if (cuentaCdt.getAccountNumber() == accnum) {
					cuentaCdt.withdraw(sum);

				}
			}

		}
	}

	public void sendLetterToOverdraftAccounts() {
		for (Account account : accounts) {
			if (account instanceof CurrentAccount) {
				CurrentAccount cuentaCorriente = (CurrentAccount) account;
				if (cuentaCorriente.getBalance() < 0) {
					Account cuenta = cuentaCorriente;
					System.out.println("La cuenta: " + cuenta.getAccountNumber() + " esta en sobregiro");
				}
			}
		}
	}

}