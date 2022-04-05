package utn.obejtos.tp1;

public class CuentaDeBanco {
    private int identifier;
    private double balance = 0;
    private String name;

    public CuentaDeBanco(int identifier, String name, double montoInicial) {
        this.identifier = identifier;
        this.name = name;
        this.balance = montoInicial;
    }

    public CuentaDeBanco() {
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credit(int deposit){
        this.balance += deposit;
        return this.balance;
    }
    public double debit(int debit){
        if(this.balance < debit){
            System.out.println("Balance insuficiente");
        }
        else{
        this.balance -= debit;
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "CuentaDeBanco{" +
                "identifier=" + identifier +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}
