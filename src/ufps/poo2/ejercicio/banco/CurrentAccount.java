package ufps.poo2.ejercicio.banco;

public class CurrentAccount extends Account {
    private double overDraftLimit = 10;

    public CurrentAccount(int a) {
        super(a);
    }

    @Override
    public void withdraw(double sum) {
        if (sum > 0) {
            if (sum <= super.getBalance() + overDraftLimit) {
             super.withdraw(sum);
            } else {
                System.err.println("No se puede realizar la operación");
            }
        } else {
            System.err.println("Error, es negativo");
        }
    }
}

