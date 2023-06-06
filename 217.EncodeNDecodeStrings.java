import java.util.*;

class Solution {

    //Time complexity: O(n), where n is the total length of all strings in the input list
    // Space complexity: O(n), where n is the total length of all strings in the input list

    public String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append((s.length()));
            sb.append("#");
            sb.append(s);
        }
            return sb.toString();
    }

    //Time complexity: O(n), where n is the length of the input string s 
    //Space complexity: O(n), where n is the length of the input string s

    public List<String> decode(String s){
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int delimeterIndex = s.indexOf("#", i);
            int length = Integer.parseInt(s.substring(i, delimeterIndex));
            strs.add(s.substring(delimeterIndex + 1, delimeterIndex + 1 + length));
            i = delimeterIndex + length + 1;
        }
        return strs;
    }
}
