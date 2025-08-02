package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calculateCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calculateSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calculateCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calculateSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calculateCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance Cannot be negative\n");
        }
    }

   public void getSavingDepositInput() {
       System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
       System.out.print("Amount you want to Deposit from Saving Account: ");
       double amount = input.nextDouble();

       if ((savingBalance - amount) >= 0) {
           calculateSavingDeposit(amount);
           System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
       } else {
           System.out.println("Balance Cannot be negative\n");
       }
   }

   public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
       System.out.print("Amount you want to Withdraw from Saving Account: ");
       double amount = input.nextDouble();

       if ((savingBalance - amount) >= 0) {
           calculateSavingWithdraw(amount);
           System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
       } else {
           System.out.println("Balance Cannot be negative\n");
       }
   }

   public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
       System.out.print("Amount you want to Deposit from Checking Account: ");
       double amount = input.nextDouble();

       if ((savingBalance - amount) >= 0) {
           calculateCheckingDeposit(amount);
           System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
       } else {
           System.out.println("Balance Cannot be negative\n");
       }
   }

}
