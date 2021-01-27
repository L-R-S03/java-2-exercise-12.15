/*
 * Project: Exercise 12.8
 * Lauren Smith
 * 12/1/20
 * Makes a file under a specific name, makes 100 random nums, writes it to the
 * then reads them from the file and prints out nums in ascending order
 */
package pkg1218;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) throws FileNotFoundException {
        //Makes file with correct file name
        java.io.File file=new File("Exercise12_15.txt"); 
        //makes PrintWriter and sets it to the file
        PrintWriter output=new PrintWriter(file); 
        //declares 100 size int array to store nums
        int[] num=new int[100]; 
        //uses a for loop to 100 to fill the array
        for(int i=0; i<100; i++) 
        {
            //makes a random num using Math.random for numbers up to 500
            int rand=(int)(Math.random()*500)+1; 
            //Prints the number to the file followed by a space 
            output.print(rand+" "); 
        } 
        //closes the PrintWriter 
        output.close();
        //Makes a scanner to read the file and sets it to the file
        Scanner read=new Scanner(file); 
        //sets a delimiter of a space for the scanner when reading the file
        read.useDelimiter(" "); 
        //sets i to 0 for while loop index 
        int i=0;
        //while the file still has lines to be read 
        while(read.hasNext()) 
        {     
            //reads in the next line as a string
            String a=read.next(); 
            //adds it to the array changing it to a int using parseInt
            num[i]=Integer.parseInt(a);
            //increments i for next line
            i++; 
        } 
        //sorts nums in ascending order using Arrays.sort method
        Arrays.sort(num); 
        //for loop for the length of the array prints out the sorted array 
        for(int b=0; b<num.length; b++)
        {
            System.out.println(num[b]);
        }
    }
    
}
