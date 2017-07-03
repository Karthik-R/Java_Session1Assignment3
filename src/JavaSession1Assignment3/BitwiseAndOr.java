package JavaSession1Assignment3;

import java.util.Scanner;

// The program is to print the truth table of Bitwise AND and Bitwise OR
/* The question contains to print truth table of Bitwise AND and Logical AND, 
 * but Logical AND is of boolean type and it's input cannot be taken from user
 * and logical AND can be used only in conditional statements where it can be either TRUE or FALSE
 */

public class BitwiseAndOr {

	public static void main(String[] args) {
	
		byte a[][]= new byte[4][2];
		byte and[][] = new byte[4][2];
		byte or[][] = new byte[4][2];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values for truth table(0 or 1)");
		// accepting the input as matrix as it can be easily used to display in table
		for (int i = 0; i < 4; i++)  // to display the 4 rows in the truth table
        {
            for (int j = 0; j < 2; j++) // to display the 2 columns in the truth table
            {
            	a[i][j] = input.nextByte();
            }
        }
		System.out.println("Truth Table");
		// displaying the two columns of truth table
		System.out.println("A \t \t B");
		for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
            	System.out.print(a[i][j]+" \t \t ");
            }
            System.out.println("");
        }
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				and[i][j] = (byte) (a[i][j] & a[i][++j]); // bitwise and of the column values of the matrix
				or[i][j] = (byte) (a[i][--j] | a[i][++j]);// bitwise or of the column values of the matrix

			}
			
		}
		//Displaying the output of Bitwise And
		System.out.println("Bitwise AND");
		for(int i = 0; i < 4; i++)
		{
			
			System.out.println(and[i][0]);
			
		}
		//Displaying the output of Bitwise Or
		System.out.println("Bitwise OR");
		for(int i = 0; i < 4; i++)
		{
			
			System.out.println(or[i][1]);
			
		}

	}

}
