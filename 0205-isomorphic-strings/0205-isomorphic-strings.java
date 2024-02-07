class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }

        HashMap<Character, Character> sToTMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check if the mapping is consistent from s to t
            if (sToTMap.containsKey(charS)) {
                if (sToTMap.get(charS) != charT) {
                    return false; // Inconsistent mapping
                }
            } else {
                // Check if the character in t has already been mapped by another character in s
                if (sToTMap.containsValue(charT)) {
                    return false; // Collision, not isomorphic
                }
                sToTMap.put(charS, charT);
            }
        }

        return true; // Strings are isomorphic
    }
}