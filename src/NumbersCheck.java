import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NumbersCheck.CheckAM(n);
        NumbersCheck.CheckEasy(n);
        NumbersCheck.CheckDiv(n);

    }
    public static void CheckAM(int n) {
        if (n >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static void CheckEasy(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Число не простое");
                return;
            }
        }
        System.out.println("Число простое");
    }
    public static void CheckDiv(int n) {
        if ((n % 2 == 0) && (n % 5 == 0) && (n % 3 == 0) && (n % 6 == 0) && (n % 9 == 0)) {
            System.out.println("Число делится нацело");
        } else {
            System.out.println("Число не делится нацело");
        }
    }
}
