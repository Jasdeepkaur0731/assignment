import java.util.Scanner;

public class strings2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        int length1 = str1.length();

        String concatStr = str1 + str2;

        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();

        System.out.println("The length of the first string is: " + length1);
        System.out.println("The concatenation of the two strings is: " + concatStr);
        System.out.println("The reversed string of the first string is: " + reversedStr1);
        System.out.println("The reversed string of the second string is: " + reversedStr2);
    }
}