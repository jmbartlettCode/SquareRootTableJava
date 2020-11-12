/*
 * Josh Bartlett
 * Purpose: To add the sum of the digits using a method
 * May 12, 2019
 * Bellevue University
 * sqrtTable.java
 */

public class sqrtTable {
    
    public static void main(String[] args){
        
        // Display the formatted column names 
        System.out.printf("%-7s%-10s\n", "Number", "SquareRoot");

        // Declare number variable to start with        
        int number = 0;
        
        // for loop to display the square roots for even numbers 
        // starting with 0 ending with 20
        for(int i = 0; i <= 10; i++){
            double squareRoot = Math.sqrt(number);
            System.out.printf("%-7d%-10.4f\n", number, squareRoot);
            number = number + 2;
        }
        
    }
    
}
