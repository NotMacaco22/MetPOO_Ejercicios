package models;

public class BankAccount {

    private String name;
    private Double amount;


    // Empty Constructor
    public BankAccount() {
    }


    // Constructor (User Only)
    public BankAccount(String name) {
        this.name = name;

        //Default Value for the account
        this.amount = 0.0;
    }

    // All Fields
    public BankAccount(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }


    //Getters And Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount: " + "Owner '" + name + "' | Account Money $ " + amount;
    }

    public void greeting(){
        System.out.println("\n~ Welcome back " + this.name + " ~\n");
    }

    public void deposit(double amount) {
        System.out.println(amount + " deposited");
        this.amount += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.amount) {
            this.amount = 0.0;
        } else {
        this.amount -= amount;
        }
        System.out.println(amount + " withdrawn");
    }

    public void showAmount(){
        System.out.println("You have $" + this.amount);
    }

}

