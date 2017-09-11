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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner created 
        Scanner input = new Scanner(System.in);
        
        //string created to store the name 
        String name;
        
        //ask user to enter in the name 
        System.out.println("Enter in you name:");
        
        //input name into next line 
        name = input.nextLine();
        
        //Ouput the final lline 
        System.out.println("HELLO " + name + ".");
        
    }
    
}
