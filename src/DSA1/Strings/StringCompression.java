package DSA1.Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aabbbcch";
        compression1(s);
        compression2(s);

    }
    static void compression1(String str){
        String s = str.charAt(0)+ "";
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i-1);
            if(cur != prev){
                s = s + cur;
            }
        }
        System.out.println(s);
    }

    static void compression2(String str){
        String s = str.charAt(0) + "";
        int count = 1;
        for (int i = 1; i < str.length() ; i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i-1);

            if(cur != prev){
                if(count > 1){
                    s = s + count;
                    count = 0;
                }
                s = s+ cur;
            }
            count++;
        }
        if(count > 1){
            s = s+ count;
        }
        System.out.println(s);
    }
}
