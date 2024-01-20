
import java.util.HashSet;
import java.util.Set;

public class CombinationGenerator {

    public static Set<String> generateCombinations() {
        String characters = "abcdefghijklmnoprstuvz";
        Set<String> combinations = new HashSet<>();

        int n = characters.length();
        int r = 6;
        int[] indices = new int[r];

        // Initialize indices to first combination (0, 1, 2, 3, 4, 5)
        for (int i = 0; i < r; i++) {
            indices[i] = i;
        }

        while (indices[0] <= n - r) {
            // Construct current combination
            StringBuilder currentCombination = new StringBuilder();
            for (int index : indices) {
                currentCombination.append(characters.charAt(index));
            }
            combinations.add(currentCombination.toString());

            // Move to the next combination
            int i = r - 1;
            while (i >= 0 && indices[i] == n - r + i) {
                i--;
            }

            if (i >= 0) {
                indices[i]++;
                for (int j = i + 1; j < r; j++) {
                    indices[j] = indices[j - 1] + 1;
                }
            }
        }

        return combinations;
    }

    public static void main(String[] args) {
        Set<String> combinations = generateCombinations();

        System.out.println("Generated combinations:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
