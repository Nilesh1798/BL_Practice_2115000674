import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

public class InsurancePol{

    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();
    private Map<LocalDate, Policy> expiryDateMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderMap.put(policy.getPolicyNumber(), policy);
        expiryDateMap.put(policy.getExpiryDate(), policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public Map<LocalDate, Policy> getPoliciesExpiringSoon(int days) {
        Map<LocalDate, Policy> expiringSoon = new TreeMap<>();
        LocalDate today = LocalDate.now();
        for (Map.Entry<LocalDate, Policy> entry : expiryDateMap.entrySet()) {
            if (ChronoUnit.DAYS.between(today, entry.getKey()) <= days) {
                expiringSoon.put(entry.getKey(), entry.getValue());
            }
        }
        return expiringSoon;
    }

    public Map<String, Policy> getPoliciesByPolicyholder(String policyholderName) {
        Map<String, Policy> policiesByPolicyholder = new HashMap<>();
        for (Map.Entry<String, Policy> entry : policyMap.entrySet()) {
            if (entry.getValue().getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policiesByPolicyholder.put(entry.getKey(), entry.getValue());
            }
        }
        return policiesByPolicyholder;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        expiryDateMap.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
        policyMap.entrySet().removeIf(entry -> entry.getValue().getExpiryDate().isBefore(today));
        insertionOrderMap.entrySet().removeIf(entry -> entry.getValue().getExpiryDate().isBefore(today));
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        Policy policy1 = new Policy("P001", "Alice", LocalDate.of(2024, 1, 15), "Health", 500.0);
        Policy policy2 = new Policy("P002", "Bob", LocalDate.of(2024, 2, 20), "Auto", 800.0);
        Policy policy3 = new Policy("P003", "Charlie", LocalDate.of(2024, 3, 25), "Home", 1200.0);
        Policy policy4 = new Policy("P004", "David", LocalDate.of(2023, 12, 10), "Health", 600.0);

        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);
        system.addPolicy(policy4);

        System.out.println("Policy P001: " + system.getPolicyByNumber("P001"));

        System.out.println("\nPolicies Expiring Soon (within 30 days):");
        System.out.println(system.getPoliciesExpiringSoon(30));

        System.out.println("\nPolicies for Policyholder 'Alice':");
        System.out.println(system.getPoliciesByPolicyholder("Alice"));

        System.out.println("\nRemoving Expired Policies...");
        system.removeExpiredPolicies();

        System.out.println("Policies after removing expired ones:");
        System.out.println(system.policyMap.values());
    }
}
