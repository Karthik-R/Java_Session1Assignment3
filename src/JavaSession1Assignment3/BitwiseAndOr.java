package JavaSession1Assignment3;

import java.util.Scanner;

public class BitwiseAndOr {

	public static void main(String[] args) {
	
		byte a[][]= new byte[4][2];
		byte and[][] = new byte[4][2];
		byte or[][] = new byte[4][2];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values for truth table(0 or 1)");
		for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
            	a[i][j] = input.nextByte();
            }
        }
		System.out.println("Truth Table");
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
				and[i][j] = (byte) (a[i][j] & a[i][++j]);
				or[i][j] = (byte) (a[i][--j] | a[i][++j]);

			}
			
		}
		System.out.println("Bitwise AND");
		for(int i = 0; i < 4; i++)
		{
			
			System.out.println(and[i][0]);
			
		}
		System.out.println("Bitwise OR");
		for(int i = 0; i < 4; i++)
		{
			
			System.out.println(or[i][1]);
			
		}

	}

}
