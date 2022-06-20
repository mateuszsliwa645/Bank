import java.util.ArrayList;

public class Branch {
    private String nameOfBranch;

    private ArrayList<Customer> customersList = new ArrayList<Customer>();

    public Branch(String nameOfBranch) {
        this.nameOfBranch = nameOfBranch;
    }

    //method that prints list of customers with transactions
    public void printListOfCustomer() {
        for (int i = 0; i < customersList.size(); i++) {

            System.out.print((i + 1) + ". " + customersList.get(i).getName() + " ");
            customersList.get(i).printTransactionList();
            System.out.println();

        }
    }


    //method that adds customer to the branch
    public boolean addCustomer(String name, double transaction) {

        int index = findCustomerIndex(name);

        if (index < 0) {
            customersList.add(new Customer(name, transaction));
            return true;
        } else {
            System.out.println("Customer already exists.");
            return false;
        }


    }

    //method that adds transaction to the customer
    public void addTransaction(String name, double transaction) {

        int index = findCustomerIndex(name);

        if (index >= 0) {
            customersList.get(index).getTransactions().add(transaction);
        } else {
            System.out.println("Customer doesn't exists");
        }


    }

    //method that checks if customer name is in branch or not, and if exists return index of that customer
    private int findCustomerIndex(String name) {

        for (int i = 0; i < customersList.size(); i++) {
            if (customersList.get(i).getName().equals(name)) {
                return i;
            }
        }


        return -1;


    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }
}
