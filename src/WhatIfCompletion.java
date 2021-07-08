import java.util.Scanner;

public class WhatIfCompletion {
    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int average = (num1 + num2)/2;

        if (sum > 200 && sum < 1000){
            System.out.println("the sum is " + sum + " *~");

        }
        else if (sum > 200){
            System.out.println("the sum is " + sum + " *");

        }
        else  {
            System.out.println("the sum is " + sum + " ~");
        }


        System.out.println("the product is " + product);
        System.out.println("the average is " + average);


    }
}
