import java.util.Scanner;

public class ArmStrong_Number {
    public static void main(String[] args) {
        System.out.println("Checking the number is ArmStrong are or not.");
        System.out.println("Enter the number to check the number is ArmStrong or not : ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isArmStrong(n));


        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i)) {
                System.out.println(i + " ");
            }
        }

    }

    // ArmStrong number formula to check it --- >>>
    static boolean isArmStrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }
}

