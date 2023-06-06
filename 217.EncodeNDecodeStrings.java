import java.util.*;

public class EncodeNDecodeStrings {

    final char DELIMITER = '#';

    public String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append((s.length()));
            sb.append(DELIMITER);
            sb.append(s);
        }
            return sb.toString();
    }

    public List<String> decode(String s){
        
    }
}
