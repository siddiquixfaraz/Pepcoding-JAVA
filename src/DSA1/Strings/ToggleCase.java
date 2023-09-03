package DSA1.Strings;

public class ToggleCase {
    public static void main(String[] args) {
        String str = "pepCODing";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( ch >= 'a' && ch <= 'z'){
                char uc = (char)('A' + ch - 'a');
                sb.setCharAt(i,uc);
            }else {
                char lc = (char) ('a'+ ch-'A');
                sb.setCharAt(i,lc);
            }
        }
        System.out.println(sb);
    }
}
