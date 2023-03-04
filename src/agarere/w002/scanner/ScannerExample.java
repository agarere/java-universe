package agarere.w002.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("[ Lütfen bir sayı giriniz ]:");
        // int data = scanner.nextInt();
        // System.out.println("[ Girilen sayı ]: " + data);

        System.out.println("[ Lütfen bir text giriniz ]:");
        String text = scanner.nextLine();
        System.out.println("[ Girilen Text ]: " + text);
    }
}
