package DSA1.Strings.Extra;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',100);

        int value = 0;
        for(int i = 0; i<s.length()-1; i++){
            if( map.get(s.charAt(i))<  map.get(s.charAt(i+1))) {
                value = value - map.get(s.charAt(i));
            }else{
                value = value + map.get(s.charAt(i));
            }
        }
        value = value+ map.get(s.charAt(s.length()-1));
        return value;
    }
}
