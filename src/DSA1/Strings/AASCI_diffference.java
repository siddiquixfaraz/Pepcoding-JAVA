package DSA1.Strings;

public class AASCI_diffference {
    public static void main(String[] args) {
        String str = "pepCODinG";
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i-1);
            char cur = str.charAt(i);
            int dif = cur - prev;
            sb.append(dif);
            sb.append(cur);
        }
        System.out.println(sb);

    }
}
