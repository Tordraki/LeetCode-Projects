import java.util.*;
public class isAnagram {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);

        /*
        Map<Character, Integer> m1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(m1.containsKey(s.charAt(i))){
                m1.put(s.charAt(i), m1.get(s.charAt(i))+1);
            }
            else{
                m1.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(m1.containsKey(t.charAt(i)) && m1.get(t.charAt(i))>0){
                m1.put(t.charAt(i), m1.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        for(char a: m1.keySet()){
            if(m1.get(a)!=0){
                return false;
            }
        }
               return true;
     */

    }
}
