package ufps.poo2.ejercicio.banco;

public class SavingAccount extends Account {
    private double interest = 1.9;

    public SavingAccount(int a) {
        super(a);
    }

    @Override
    public void deposit(double sum) {
        if (sum > 0) {
            sum += ((sum * interest) + sum);
            super.deposit(sum);
        } else {
            System.out.println("Error, el valor debe ser positivo");
        }
    }
}