public class findDifference {
    public char findTheDifference(String s, String t) {
        Map<String, Integer> m = new TreeMap<>();
        for(int i = 0; i< s.length(); i++){
            if(m.containsKey(s.substring(i, i+1))){
                m.put(s.substring(i, i+1), m.get(s.substring(i, i+1))+1);
            }
            else{
                m.put(s.substring(i, i+1), 1);
            }
        }
        Map<String, Integer> m1 = new TreeMap<>();
        for(int j = 0; j< t.length(); j++){
            if(m1.containsKey(t.substring(j, j+1))){
                m1.put(t.substring(j, j+1), m1.get(t.substring(j, j+1))+1);
            }
            else{
                m1.put(t.substring(j, j+1), 1);
            }
        }
        for(String a: m1.keySet()){
            if(!m.containsKey(a) || m.get(a)!=m1.get(a)){
                return a.charAt(0);
            }
        }
        return 'a';
    }
}
