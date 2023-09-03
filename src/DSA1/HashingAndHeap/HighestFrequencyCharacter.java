package DSA1.HashingAndHeap;

import java.util.HashMap;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        String str = "abbaaddabfjsdbwbtbwbgbqb";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0 ; i< str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                int of = map.get(str.charAt(i));
                int nf = of +1;
                map.put(str.charAt(i), nf);
            }
        }

        char max = str.charAt(0);
        for (Character key : map.keySet() )  {

                if(map.get(key) > map.get(max)){
                    max = key;
                }
        }

        System.out.println(max);
    }
}
