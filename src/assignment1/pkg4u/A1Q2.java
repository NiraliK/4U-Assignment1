/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.pkg4u;

import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner created 
        Scanner input = new Scanner(System.in);

        //array created to store the 3 numbers 
        int[] A = new int[3];

        //ask user to inder in 3 number 
        System.out.println("Enter in 3 integers, in different lines.");

        //for loop created to go through the 3 numbers 
        for (int i = 0; i < 3; i++) {
            A[i] = input.nextInt();
        }
        //multiply all the numbers together to find the product and print it out 
        int product = 1;
        for (int i = 0; i < 3; i++) {
            product = product * A[i];
        }
        System.out.println("The product is:" + product);

        //square the product and print it out
        int square = product * product;
        System.out.println("The squared product is: " + square);

        //square root the squared number and print it out
        int squareroot = (int) Math.sqrt(square);
        System.out.println("The square root is: " + squareroot);

    }

}
