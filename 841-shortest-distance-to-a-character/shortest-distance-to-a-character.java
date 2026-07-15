class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        Arrays.fill(result, Integer.MAX_VALUE);
        char[] charArray = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if(charArray[i] == c) {
                helperMethod_fill(result, i);
            }
        }

        return result;
    }

    public void helperMethod_fill(int[] intArray, int index) {
        for(int lIndex = index; lIndex >= 0; lIndex--) {
            int distance = index - lIndex;
            intArray[lIndex] = Math.min(intArray[lIndex], distance);
        }

        for(int rIndex = index; rIndex < intArray.length; rIndex++) {
            int distance = rIndex - index;
            intArray[rIndex] = Math.min(intArray[rIndex], distance);
        }
    }
}