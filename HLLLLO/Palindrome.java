import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in3 4);

        int palindromeCount = 0;
        int notPalindromeCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a string: ");
            String str = scanner.nextLine();
            
            boolean isPalindrome = true;
            for (int j = 0; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                palindromeCount++;
            } else {
                notPalindromeCount++;
            }
        }

        System.out.println("String was Palindrome " + palindromeCount + " times.");
        System.out.println("String was not Palindrome " + notPalindromeCount + " times.");
    }
}