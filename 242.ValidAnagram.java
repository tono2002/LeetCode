class Solution {
    public boolean isAnagram(String s, String t) {
        
        // Two anagrams must have the same size
        if(s.length() != t.length()) return false;

        // We create an array of 26 elements, where each one of this elements referrefers a character
        // of the english alphabet
        int[] char_nums = new int[26];

        // We loop through the characters of each word
        for(int i = 0; i < s.length(); i++){
            // We'll increment the references to the characters once we find them in the first string
            char_nums[s.charAt(i) - 'a']++;
            char_nums[t.charAt(i) - 'a']--;
        }

        // Once we've done that, if both of the strings are anagrams, the array should be filled with 0
        for(int i = 0; i < char_nums.length; i++){
            if(char_nums[i] != 0) return false; // If any elements is diferent from 0, false.
        }

        return true;
        
    }
}