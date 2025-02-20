import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Policy policy = (Policy) o;

        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
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

public class insurancepolicymanagement {

    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void removePolicy(Policy policy) {
        hashSetPolicies.remove(policy);
        linkedHashSetPolicies.remove(policy);
        treeSetPolicies.remove(policy);
    }

    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<Policy> getPoliciesExpiringSoon(int days) {
        Set<Policy> expiringSoon = new HashSet<>();
        LocalDate today = LocalDate.now();
        for (Policy policy : hashSetPolicies) {
            if (ChronoUnit.DAYS.between(today, policy.getExpiryDate()) <= days) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        Set<Policy> policiesByCoverage = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policiesByCoverage.add(policy);
            }
        }
        return policiesByCoverage;
    }

    public Set<Policy> getDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> policyNumbers = new HashSet<>();
        for (Policy policy : linkedHashSetPolicies) {
            if (!policyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        insurancepolicymanagement system = new insurancepolicymanagement();

        Policy policy1 = new Policy("P001", "Alice", LocalDate.of(2024, 1, 15), "Health", 500.0);
        Policy policy2 = new Policy("P002", "Bob", LocalDate.of(2024, 2, 20), "Auto", 800.0);
        Policy policy3 = new Policy("P003", "Charlie", LocalDate.of(2024, 3, 25), "Home", 1200.0);
        Policy policy4 = new Policy("P004", "David", LocalDate.of(2023, 12, 10), "Health", 600.0);

        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);
        system.addPolicy(policy4);

        System.out.println("All Unique Policies:");
        System.out.println(system.getAllUniquePolicies());

        System.out.println("\nPolicies Expiring Soon (within 30 days):");
        System.out.println(system.getPoliciesExpiringSoon(30));

        System.out.println("\nPolicies with Coverage Type 'Health':");
        System.out.println(system.getPoliciesByCoverageType("Health"));

        System.out.println("\nDuplicate Policies:");
        System.out.println(system.getDuplicatePolicies());
    }
}
