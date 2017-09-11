/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.pkg4u;

/**
 *
 * @author niralikantaria
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //integer creater for the number of years (1999)
        int years = 1999;
        // double created for the max population of 10 billion
        double maxP = 10;
        //double for population in 1999 6 billion 
        double population = 6;
        // double for the growing rate 
        double rate = 0.014;
        
        for(double i = population; i < maxP; i += (i * rate)) {
            years++;
        }
        System.out.println("The world population will exceed 10 billion in " +years+ "years (1999).");
        
    }
    
}
