package regex;

import java.util.*;

public class trimFromEnds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word with asterisk: ");
        String A = sc.nextLine();
        String B = A.replaceAll("^\\*+", "");
        String C = B.replaceAll("\\*+$", "");
        System.out.println(C);
        sc.close();
    }
}
