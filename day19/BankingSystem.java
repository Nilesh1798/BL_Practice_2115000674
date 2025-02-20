import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BankingSystem {

    private Map<String, Double> accountMap = new HashMap<>();
    private Map<Double, String> balanceTreeMap = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accountNumber, double initialBalance) {
        accountMap.put(accountNumber, initialBalance);
        balanceTreeMap.put(initialBalance, accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        if (accountMap.containsKey(accountNumber)) {
            double newBalance = accountMap.get(accountNumber) + amount;
            accountMap.put(accountNumber, newBalance);
            balanceTreeMap.remove(newBalance - amount);
            balanceTreeMap.put(newBalance, accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    public void requestWithdrawal(String accountNumber, double amount) {
        if (accountMap.containsKey(accountNumber) && accountMap.get(accountNumber) >= amount) {
            withdrawalQueue.add(accountNumber + ":" + amount);
        } else {
            System.out.println("Insufficient balance or account not found: " + accountNumber);
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String request = withdrawalQueue.poll();
            String[] parts = request.split(":");
            String accountNumber = parts[0];
            double amount = Double.parseDouble(parts[1]);

            if (accountMap.containsKey(accountNumber) && accountMap.get(accountNumber) >= amount) {
                double newBalance = accountMap.get(accountNumber) - amount;
                accountMap.put(accountNumber, newBalance);
                balanceTreeMap.remove(newBalance + amount);
                balanceTreeMap.put(newBalance, accountNumber);
                System.out.println("Processed withdrawal for account: " + accountNumber);
            } else {
                System.out.println("Failed to process withdrawal for account: " + accountNumber);
            }
        }
    }

    public Map<String, Double> getAccountsSortedByBalance() {
        Map<String, Double> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Double, String> entry : balanceTreeMap.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        return sortedAccounts;
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount("ACC001", 1000.0);
        bank.createAccount("ACC002", 1500.0);
        bank.createAccount("ACC003", 500.0);

        bank.deposit("ACC001", 200.0);
        bank.deposit("ACC003", 300.0);

