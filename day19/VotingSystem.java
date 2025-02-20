import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {

    private Map<String, Integer> voteCountMap = new HashMap<>();
    private Map<String, Integer> insertionOrderMap = new LinkedHashMap<>();

    public void castVote(String candidate) {
        voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);
        insertionOrderMap.put(candidate, voteCountMap.get(candidate));
    }

    public Map<String, Integer> getVoteCounts() {
        return new HashMap<>(voteCountMap);
    }

    public Map<String, Integer> getVotesInInsertionOrder() {
        return new LinkedHashMap<>(insertionOrderMap);
    }

    public Map<String, Integer> getVotesInSortedOrder() {
        return new TreeMap<>(voteCountMap);
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        System.out.println("Vote Counts: " + votingSystem.getVoteCounts());
        System.out.println("Votes in Insertion Order: " + votingSystem.getVotesInInsertionOrder());
        System.out.println("Votes in Sorted Order: " + votingSystem.getVotesInSortedOrder());
    }
}
