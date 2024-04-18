//Question 5
 class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ". Insufficient funds.");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}
 public class Main5 {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);

	        Thread depositThread1 = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                account.deposit(100);
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread depositThread2 = new Thread(() -> {
	            for (int i = 0; i < 3; i++) {
	                account.deposit(150);
	                try {
	                    Thread.sleep(150);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread withdrawalThread1 = new Thread(() -> {
	            for (int i = 0; i < 4; i++) {
	                account.withdraw(200);
	                try {
	                    Thread.sleep(200);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        depositThread1.start();
	        depositThread2.start();
	        withdrawalThread1.start();

	        try {
	            depositThread1.join();
	            depositThread2.join();
	            withdrawalThread1.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final balance: " + account.getBalance());
	    }
	}
