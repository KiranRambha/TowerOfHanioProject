package ass3;

import java.util.*;
/**
 * 
 * @author kiran
 * 
 */
public class Hanoi {
	/**
	 * 
	 * @param NumberOfDisc The number of disks in the game
	 * @param first This is the from peg from which the disk is to be removed
	 * @param last This is the to peg onto which the disk is to moved
	 */
	public static void Moves(int NumberOfDisc,int first, int last)
	{
		if(NumberOfDisc==0)
		{
			System.out.print("There are no Disks on the Pegs");
		}
		if(NumberOfDisc==1)
		{
			System.out.println("Move Disc from Peg:"+first +" to Peg:"+ last);
		}
		if(NumberOfDisc >1)
		{
			Moves(NumberOfDisc-1, first, (6-first-last));
			System.out.println("Move Disc from Peg:" + first + " to Peg:" +last);
			Moves(NumberOfDisc-1,(6-first-last), last);
		}
	}
	

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of discs :");
		int n = scanner.nextInt();
		if(n>=0)
		{
			Moves(n, 1, 3);
		}
		else 
		{
			System.out.print("Negative number of disks not possible");
		}
		scanner.close();	
	}
}
