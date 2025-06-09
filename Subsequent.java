import java.util.*;
public class Subsequent {
    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "AED";
        int j =0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
        }
        if (j == str2.length()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
