package codingNinjas;

import java.util.Scanner;

public class ReplaceCharacter {

    public static String replaceCharacter(String input, char c1, char c2) {
        if (input.length() == 0) {
            return "";
        }

        String ans = input.charAt(0) + "";

        if (ans.charAt(0) == c1) {
            ans = ans.replace(ans.charAt(0), c2);
        }
        String smallans = replaceCharacter(input.substring(1), c1, c2);
        return ans + smallans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.println(replaceCharacter(input, c1, c2));
    }
}
