import java.util.Scanner;

public class Main {
    private static Bank bank = new Bank();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        int choice;
        showMenu();

        while (flag) {
            System.out.print("Type choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1://Adds branch
                    System.out.print("Type name of branch that you want to add: ");
                    String branch = sc.nextLine();
                    bank.addBranch(branch);
                    break;
                case 2://Show list of branches
                    bank.showListOfBranches();
                    break;
                case 3://Adds customer to the branch
                    System.out.print("Type name of branch to which you want add customer: ");
                    branch = sc.nextLine();
                    System.out.print("Type name of customer: ");
                    String nameOfCustomer = sc.nextLine();
                    System.out.print("Type first transaction: ");
                    double firstTransaction = sc.nextDouble();
                    sc.nextLine();
                    bank.addCustomerToBranch(branch, nameOfCustomer, firstTransaction);
                    break;
                case 4://Add transaction to customer
                    System.out.print("Type name of branch in which is customer: ");
                    branch = sc.nextLine();
                    System.out.print("Type name of customer: ");
                    nameOfCustomer = sc.nextLine();
                    System.out.print("Type transaction: ");
                    double transaction = sc.nextDouble();
                    sc.nextLine();
                    bank.addTransactionToCustomer(branch, nameOfCustomer, transaction);
                    break;
                case 5://Shows list of customers and their transaction in branch
                    System.out.print("Type name of branch: ");
                    branch = sc.nextLine();
                    bank.showListOfCustomersInBranch(branch);
                    break;
                case 6://Show menu
                    showMenu();
                    break;

                case 7://Exit
                    flag = false;
                    System.out.println("Ending...");
                    sc.close();
                    break;
                default:
                    System.out.println("Wrong number!");
            }
        }

    }

    //method that shows menu
    public static void showMenu() {
        System.out.println("1. Add branch to the bank \n" +
                "2. Show list of branches\n" +
                "3. Add Customer to the branch\n" +
                "4. Add transaction to customer\n" +
                "5. Show list of customers in branch\n" +
                "6. Show menu\n" +
                "7. Exit");
    }
}