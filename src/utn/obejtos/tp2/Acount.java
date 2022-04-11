package utn.obejtos.tp2;

import utn.obejtos.utilities.Utilities;

public class Acount {

    private static final int MAX_OPERATION = 10;
    private String id = Utilities.generateRandomId(5);
    private double balance;
    private ClientBank client;
    private int operationCounter = 0;
    private String operations[] = new String[MAX_OPERATION];

    public Acount(double balance, ClientBank client) {
        this.balance = balance;
        this.client = client;
    }

    public Acount() {
    }

    public String[] getOperations() {
        return operations;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClientBank getClient() {
        return client;
    }

    public void setClient(ClientBank client) {
        this.client = client;
    }

    public double extract(double amountToExtract) {

        if(balance - amountToExtract < -2000)
            System.out.println("Saldo insuficiente");
        else {
            recordOfExtrations(amountToExtract);
            balance -= amountToExtract;
        }
        return balance;
    }

    public double toDeposit(double amountToDeposit) {
        recordOfDeposits(amountToDeposit);
        return balance += amountToDeposit;
    }

    public void recordOfDeposits(double amount){
        if (this.operationCounter == 10) {
            this.operationCounter = 0;
        }
        operations[operationCounter] = "El cliente " + client.getName() + ", depositó " + amount;
        this.operationCounter++;

    }
    public void recordOfExtrations(double amount){
        if (this.operationCounter == 10) {
            this.operationCounter = 0;
        }
        operations[operationCounter] = "El cliente " + client.getName() + ", retiró " + amount;
        this.operationCounter++;
    }

}