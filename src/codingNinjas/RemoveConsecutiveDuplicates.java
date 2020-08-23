package codingNinjas;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() == 1) {
            return s.charAt(0) + "";
        }

        String ans = "";

        if (s.charAt(0) != s.charAt(1)) {
            ans = ans + s.charAt(0);
        }
        String smallans = removeConsecutiveDuplicates(s.substring(1));
        return ans + smallans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(removeConsecutiveDuplicates(s));
    }

}
