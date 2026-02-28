class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Deposit amount cannot be negative!");
        }
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Withdrawal amount cannot be negative!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        try {
            acc.deposit(500);
            acc.withdraw(2000);
            acc.balanceEnquiry();
        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program Ended Successfully.");
    }
}