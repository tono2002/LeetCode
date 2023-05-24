class Solution {

    // Time complexity: 0(n k log k), where n is the length of strs and k is the maximum length of a string in strs
        // Iterating through each string in the array: 0(n)
        // Sorting each string: 0(k log k)
    // Space complexity: 0(n k), where n is the number of strings in the map, and k is the length of the longest string

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, List> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            // Sort each of the elements of the input array, to get the "types"
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            // If the type isn't in the map yet, we create an empty list for this group of anagrams
            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}