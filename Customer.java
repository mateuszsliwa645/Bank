import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name, double transaction) {

        this.name = name;
        transactions.add(transaction);

    }

    //method that prints transactions list
    public void printTransactionList() {
        if (transactions.size() >= 1) {
            System.out.println("List of transactions: ");
        } else {
            System.out.println("This customer doesn't have transactions.");
        }


        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }

    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }
}
