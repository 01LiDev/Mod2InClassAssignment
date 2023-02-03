/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mod2assigninclass;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Johnson
 */
public class Mod2assigninclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //3.13
        Employee employee1 = new Employee("John", "Doe", 35000.59);
        Employee employee2 = new Employee("Jack", "Mah", 55000.69);
        double raise = 0.1;
        DecimalFormat df = new DecimalFormat("#.00");
        double emp1Sal = employee1.getSalary();
        double emp2Sal = employee2.getSalary();
        double newEmp1Sal = emp1Sal * raise + emp1Sal;
        double newEmp2Sal = emp2Sal * raise + emp2Sal;
        System.out.println(employee1.getFn() + " " + employee1.getLn() + " current salary is $" + emp1Sal);
        System.out.println(employee2.getFn() + " " + employee2.getLn() + " current salary is $" + emp2Sal);
        System.out.println("After a 10% Raise, there salary would be: ");
        System.out.println(employee1.getFn() + " " + employee1.getLn() + " new salary is $" + df.format(newEmp1Sal));
        System.out.println(employee2.getFn() + " " + employee2.getLn() + " new salary is $" + df.format(newEmp2Sal));
        
        FindSmallest();//5.11
        
        calProdOddIntegers(); //5.12
        
        Palindrome();// 4.31
    }

    public static void FindSmallest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value: ");
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        System.out.println("The Smallest number is " + num[0]);
    }
    public static void calProdOddIntegers(){
        int product = 1;
    for (int i = 1; i <= 15; i++) {
      if (i % 2 != 0) {// basically odd numbers would not have a remainder of 0
        product *= i;
      }
    }
    System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }
    public static void Palindrome(){
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a five-digit integer: ");
        int number = input.nextInt();
        int length = String.valueOf(number).length();

        if (length != 5) {
            System.out.println("Try Again, not a five-digit integer!");
            return;
        }

        int[] digits = new int[5];
        for (int i = 4; i >= 0; i--) {//reverses the inputted integers
            digits[i] = number % 10;
            number /= 10;
        }

        boolean isPalindrome = true;
        for (int i = 0; i < 5; i++) {//checks from the 1st position to the last position if there equal and stops at the middle
            if (digits[i] != digits[4 - i]) {
                isPalindrome = false;//would change the boolean to false if it is true that they are not equal
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
