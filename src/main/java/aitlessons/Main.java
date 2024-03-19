package aitlessons;

import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите ваше  имя");
        String firstname = scanner.nextLine();

        System.out.println("Hello " + firstname);
    }
}
