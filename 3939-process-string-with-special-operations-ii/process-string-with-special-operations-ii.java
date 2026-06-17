class Solution {
    public char processStr(String s, long k) {

        long len = 0;

        // calculate final length
        for (char c : s.toCharArray()) {

            if (c >= 'a' && c <= 'z') {
                len++;
            } 
            else if (c == '*') {
                if (len > 0)
                    len--;
            } 
            else if (c == '#') {
                len *= 2;
            }
        }

        if (k >= len)
            return '.';


        // reverse traversal
        for (int i = s.length() - 1; i >= 0; i--) {

            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {

                len--;

                if (k == len)
                    return c;
            }

            else if (c == '#') {

                len /= 2;

                if (k >= len)
                    k -= len;
            }

            else if (c == '*') {
                len++;
            }

            else { // reverse
                k = len - 1 - k;
            }
        }

        return '.';
    }
}