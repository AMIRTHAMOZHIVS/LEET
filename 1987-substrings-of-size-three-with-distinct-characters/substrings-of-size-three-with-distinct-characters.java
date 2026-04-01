class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Maintain window size = 3
            if (right - left + 1 > 3) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            // Check if window size is 3 and all distinct
            if (right - left + 1 == 3 && map.size() == 3) {
                count++;
            }
        }

        return count;
    }
}