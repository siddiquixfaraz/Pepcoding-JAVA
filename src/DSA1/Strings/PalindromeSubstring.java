package DSA1.Strings;

public class PalindromeSubstring {
    public static void main(String[] args){
        String s = "abccbc";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length() ; j++) {
               // System.out.println(s.substring(i,j));
                if(isPalindrome(s.substring(i,j))){
                    System.out.println(s.substring(i,j));
                }
            }
        }
    }
    static boolean isPalindrome(String s){
        String rev = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            rev = rev + s.charAt(i);
        }
        if(rev.equals(s)){
            return true;
        }
        return false;
    }
}
