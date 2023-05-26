import java.util.Scanner;

public class maxnumber1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three double numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double max = Math.max(num1, Math.max(num2, num3));

        System.out.println("The maximum number is: " + max);
    }
}