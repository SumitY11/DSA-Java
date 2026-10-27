
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() !=t.length()) {
            return false;
        }

        int[] mapS = new int[65536];
        int[] mapT = new int[65536];

        for (int i =0; i <s.length(); i++) {
            char ch = s.charAt(i);
            char sh = t.charAt(i);

            if (mapS[ch] != mapT[sh]) {
                return false;
            }

            mapS[ch] = i + 1;
            mapT[sh] = i + 1;
        }

        return true;
    }
}
