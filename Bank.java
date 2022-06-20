import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branchesList = new ArrayList<Branch>();

    //method that adds branch to the bank
    public void addBranch(String nameOfBranch) {
        int index = isBranchInBank(nameOfBranch);
        if (index >= 0) {
            System.out.println(nameOfBranch + " branch already exists.");
        } else {
            branchesList.add(new Branch(nameOfBranch));
            System.out.println("Successfully added branch named " + nameOfBranch);
        }
    }

    //method that adds customer to branch
    public void addCustomerToBranch(String nameOfBranch, String name, double transaction) {
        int index = isBranchInBank(nameOfBranch);
        if (index >= 0) {
            if (branchesList.get(index).addCustomer(name, transaction)) {
                System.out.println("Successfully added " + name + " customer with first transaction.");
            }
        } else {
            System.out.println("Branch " + nameOfBranch + " doesn't exists");
        }
    }

    //method that shows list of branches
    public void showListOfBranches() {
        for (int i = 0; i < branchesList.size(); i++) {
            System.out.println((i + 1) + ". " + branchesList.get(i).getNameOfBranch());
        }
    }

    //method that adds transaction to customer in branch
    public void addTransactionToCustomer(String nameOfBranch, String name, double transaction) {
        int index = isBranchInBank(nameOfBranch);
        if (index >= 0) {
            branchesList.get(index).addTransaction(name, transaction);
            System.out.println("Successfully added " + transaction + " transaction to the " + name + " customer");
        } else {
            System.out.println("Branch " + nameOfBranch + " doesn't exists");
        }
    }

    //method that shows list of customer and their transactions
    public void showListOfCustomersInBranch(String nameOfBranch) {
        int index = isBranchInBank(nameOfBranch);
        if (index >= 0) {
            branchesList.get(index).printListOfCustomer();
        } else {
            System.out.println("Branch " + nameOfBranch + " doesn't exists.");
        }
    }


    //method that find branch in bank and return his index
    private int isBranchInBank(String nameOfBranch) {
        for (int i = 0; i < branchesList.size(); i++) {
            if (branchesList.get(i).getNameOfBranch().equals(nameOfBranch)) {
                return i;
            }
        }
        return -1;
    }


}
