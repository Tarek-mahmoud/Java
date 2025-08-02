package ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###, ##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(765657, 324543);
                data.put(765658, 324543);

                System.out.println("Welcome to the ATM!");
                System.out.println("Please enter your customer ID:");
                setCustomerNumber(input.nextInt());

                System.out.print("Please enter your PIN number: ");
                setPinNumber(input.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s). only numbers.");
                x = 2;
            }

            int customerNumber = getCustomerNumber();
            int PINNumber = getPinNumber();
            if (data.containsKey(customerNumber) && data.get(customerNumber) == PINNumber) {
                getAccountType();
            } else
                System.out.println("\n" + "Invalid ID or PIN number");
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Select the Account you want to access: ");
        System.out.println("1. Checking Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Exit");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using ATM!");
                break;
            default:
                System.out.println("\n" + "Invalid choice. Please try again.");
        }
    }

    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("1. View Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        System.out.print("Choice: ");

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM!");
                break;
            default:
                System.out.println("\n" + "Invalid choice. Please try again.");
                getChecking();
        }
    }

    public void getSaving() {
        System.out.println("Saving Account: ");
        System.out.println("1. View Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
        System.out.print("Choice: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM!");
                break;
            default:
                System.out.println("\n" + "Invalid choice. Please try again.");
                getChecking();
        }
    }
}
