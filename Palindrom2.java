import java.util.*;

public class Palindrom2 {
    public static void main(String[] args) {
        String str = "ABCDCBA";
        StringBuilder rev = new StringBuilder(str);

        if (str.equals(rev.reverse().toString())) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
