/* A JAVA PROGRAM TO ADD TWO NUMBERS USING PACKAGES  */
package xyz;

import java.util.Scanner;

public class addNum {
    public void sum() {
        int x,y,z; // Variable declaration 

        // User input 
        Scanner input = new Scanner(System.in);

        System.out.print("Input Number: ");
        x = input.nextInt(); 
        System.out.print("Input Number: ");
        y = input.nextInt();

        z=x+y; // Calculating user input 
        System.out.println(x + " + " + y + " = " + z); // Displaying user input
    }

    /* CALLING PACKAGE THIS BLOCK OF CODE CAN BE WRITTEN IN ANOTHER FILE  */
    public static void main(String[] args) {
        
        xyz.addNum add = new xyz.addNum();
        add.sum();
    }
}
