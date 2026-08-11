import java.util.*;

class Solution {
    public String frequencySort(String s) {

        // Step 1: Count frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Store characters
        ArrayList<Character> chars = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency (descending)
        chars.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Build answer
        StringBuilder ans = new StringBuilder();

        for(char ch : chars) {

            int frequency = map.get(ch);

            for(int i = 0; i < frequency; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}