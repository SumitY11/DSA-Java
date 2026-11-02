class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        Character[] ch = new Character[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        Arrays.sort(ch, (first, second) -> {
            int frequencyOrder = Integer.compare(
                freq.get(second), freq.get(first)
            );

            if (frequencyOrder != 0) {
                return frequencyOrder;
            }

            return Character.compare(first, second);
        });

        StringBuilder result = new StringBuilder();

        for (char character : ch) {
            result.append(character);
        }

        return result.toString();
    }
}