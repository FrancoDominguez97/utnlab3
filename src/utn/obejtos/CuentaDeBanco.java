package utn.obejtos;

public class CuentaDeBanco {
    private int identifier;
    private int balance = 0;
    private String name;

    public CuentaDeBanco(int identifier, String name, int montoInicial) {
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int deposit){
        balance = balance + deposit;
        return balance;
    }
    public int debit(int debit){
        balance = balance - debit;
        return balance;
    }
    public void showAccount(){
        System.out.println(
                "Nombre: " + name +
                "\nIdentificador: " + String.valueOf(identifier) +
                "\nBalance: " + String.valueOf(balance)
        );
    }
}
