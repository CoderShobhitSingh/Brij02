public class Palindrom {
    public static void main(String[] args) {
        String str = "ABCDCBA";

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("It is not a palindrome");
                return; 
            }
            i++;
            j--;
        }
        System.out.println("It is a palindrome");
    }
}
