package bai_mau.thuat_toan;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập số bất kì");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= number; i++) {
            if (isPrime(i) && fibonacy(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number) {
        boolean checkIsPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                checkIsPrime = false;
                break;
            }
        }
        return checkIsPrime;
    }
    public static boolean fibonacy(int number) {
        int a = 1;
        int b = 1;
        int sum ;
        boolean check = false;
        for (int i = 0; i <= number; i++) {
            sum = a + b;
            a = b;
            b = sum;
            if (sum == number) {
                check = true;
            }
        }
        return check;
    }
}