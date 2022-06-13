public class isPalindrome {
    public boolean isPalindrome(String s) {

        String upper = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                upper+= s.substring(i, i+1);
            }
        }
        upper = upper.toUpperCase();
        while(upper.length()>1){
            if(upper.charAt(0)!=upper.charAt(upper.length()-1)){
                return false;
            }
            else{
                upper = upper.substring(1, upper.length()-1);
            }
        }
        return true;
    }
}
