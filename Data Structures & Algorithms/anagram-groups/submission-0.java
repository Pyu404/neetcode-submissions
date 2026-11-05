class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();

        for(String str : strs) {

            int[] freq = new int[26];

            for(char c : str.toCharArray()) {
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);

            mp.computeIfAbsent(key, k -> new ArrayList<>())
              .add(str);
        }

        return new ArrayList<>(mp.values());
    }

}
