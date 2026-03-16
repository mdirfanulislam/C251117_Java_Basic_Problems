package c251117.c251117_java_basic;

import java.util.Scanner;

public class java_input {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = num.nextInt();

        System.out.println("Your age is: " + age);
    }
}
