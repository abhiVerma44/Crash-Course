package banking;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

}
// let's discuss the impact of changing access modifiers on data security and class usability:

// Private Access Modifier:

// Data Security: Private fields ensure that they can only be accessed within the same class. This helps in enforcing encapsulation and prevents direct modification of fields from outside the class, enhancing data security.
// Class Usability: Since private fields cannot be accessed directly from outside the class, getter and setter methods are necessary to manipulate the data. 

// Public Setter and Getter Methods:

// Data Security: Public setter methods can validate input data before modifying the fields, ensuring that only valid data is stored in the object. This helps in maintaining data integrity and prevents unauthorized modification. Getter methods allow controlled access to the private fields, maintaining data security by providing read-only access.
// Class Usability: Public getter methods allow other classes to access the data stored in the object, facilitating data retrieval and usage. Public setter methods enable other classes to modify the data in a controlled manner, enhancing the flexibility and usability of the class. However, excessive use of public setter methods can also expose the internal state of the object, potentially leading to misuse or unintended modifications
// }