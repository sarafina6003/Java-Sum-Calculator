/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author nyawira
 */
import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
         
    int num, number, sum;
    
    System.out.println("Enter first number:");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    
    System.out.println("Enter second number:");
    Scanner out = new Scanner(System.in);
    number = in.nextInt();
   
    sum = num + number;
     
     System.out.println("The sum is = " + sum);
   
    }
    
}
