class Solution {
    public boolean isAnagram(String s, String t) {
        int[] Alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) 
            Alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++)
            Alphabet[t.charAt(i) - 'a']--;
        for (int i : Alphabet)
            if (i != 0) 
                return false;
        return true;
    }
}