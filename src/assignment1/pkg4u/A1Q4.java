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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner created 
        Scanner input = new Scanner(System.in);

        // ask user to enter in a number 
        System.out.println("Please enter in a number between 1-10:");
        int number = input.nextInt();

        // for loop created to replace number with stars 
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

    }

}
