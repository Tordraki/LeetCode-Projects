import java.util.*;
public class isValid {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(int i = 0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                if(res.empty()||(res.pop()!=map.get(curr))){
                    return false;
                }

            }
            else{
                res.push(curr);
            }
        }
        return res.empty();
    }
}
