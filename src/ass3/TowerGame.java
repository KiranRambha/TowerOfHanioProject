package ass3;

import java.util.*;
/**
 * 
 * @author kiran
 *
 */
public class TowerGame {
	public static int[] PegA = null , PegB = null , PegC = null;
	public static int n , TopA = 0 , TopB = 0 , TopC = 0;
	public static int disk;
	/**
	 * 
	 * @param a This is the size of the disk to be put in PegA
	 */
	public static void PushA(int a)
	{
		if(TopA<n)
		{
			PegA[TopA]=a;
			TopA++;
		}
	}
	/**
	 * 
	 * @param b This is the size of the disk to be put in PegB
	 */
	public static void PushB(int b)
	{
		if(TopB<n)
		{
			PegB[TopB]=b;
			TopB++;
		}
	}
	/**
	 * 
	 * @param c This is the size of the disk to be put in PegC
	 */
	public static void PushC(int c)
	{
		if(TopC<n)
		{
			PegC[TopC]=c;
			TopC++;
		}
	}
	/**
	 * 
	 * @return Returns the top element in PegA
	 */
	public static int PopA()
	{
		if(TopA!=0)
		{
			TopA--;
			return PegA[TopA];
		}
		else
		{
			return PegA[TopA];
		}
	}
	/**
	 * 
	 * @return Returns the top element in PegB
	 */
	public static int PopB()
	{
		if(TopB!=0)
		{
			TopB--;
			return PegB[TopB];
		}
		else
		{
			return PegB[TopB];
		}
	}
	/**
	 * @return Returns the top element in PegC
	 */
	public static int PopC()
	{
		if(TopC!=0)
		{
			TopC--;
			return PegC[TopC];
		}
		else
		{
			return PegC[TopC];
		}
	}
	/**
	 * @param from The peg from which the disk is to be taken
	 * @param to The peg to which the disk is to be placed
	 * @return Returns void
	 */
	public static void MoveDisk(int from , int to)
	{
		int a=TopA;
		int b=TopB;
		int c=TopC;
		if(from==1 && to==2)
		{
			try
			{
				disk=PopA();
				if(disk==0)
				{
					System.out.println("Sorry Move is not possible");
				}
				else if(TopB==0 && disk>PegB[TopB])   
				{
					PushB(disk);
					PegA[TopA]=0;
				}
				else if(TopB>0 && disk<PegB[TopB-1])
				{
					PushB(disk);
					PegA[TopA]=0;
				}
				else
				{
					TopA=a;
					System.out.println("This move is not valid");
				}
			}
			catch(Exception e)
			{
				System.out.println("Move not Possible");
			}
			
		}
		if(from==1 && to==3)
		{
			try
			{
				disk=PopA();
				if(disk==0)
				{
					System.out.println("Sorry Move is not possible");
				}
				else if(TopC==0 && disk>PegC[TopC])   
				{
					PushC(disk);
					PegA[TopA]=0;
				}
				else if(TopC>0 && disk<PegC[TopC-1])
				{
					PushC(disk);
					PegA[TopA]=0;
				}
				else
				{
					TopA=a;
					System.out.println("This move is not valid");
				}
			}
			catch(Exception e)
			{
				System.out.println("Move not Possible");
			}
		}
		if(from==2 && to==3)
		{
			try
			{
				disk=PopB();
				if(disk==0)
				{
					System.out.println("Sorry Move is not possible");
				}
				else if(TopC==0 && disk>PegC[TopC])   
				{
					PushC(disk);
					PegB[TopB]=0;
				}
				else if(TopC>0 && disk<PegC[TopC-1])
				{
					PushC(disk);
					PegB[TopB]=0;
				}
				else
				{
					TopB=b;
					System.out.println("This move is not valid");
				}
			}
			catch(Exception e)
			{
				System.out.println("Move not Possible");
			}
		}
		if(from==2 && to==1)
		{
			try
			{
				disk=PopB();
				if(disk==0)
				{
					System.out.println("Sorry Move is not possible");
				}
				else if(TopA==0 && disk>PegA[TopA])   
				{
					PushA(disk);
					PegB[TopB]=0;
				}
				else if(TopA>0 && disk<PegA[TopA-1])
				{
					PushA(disk);
					PegB[TopB]=0;
				}
				else
				{
					TopB=b;
					System.out.println("This move is not valid");
				}
			}
			catch(Exception e)
			{
				System.out.println("Move not Possible");
			}
		}
		if(from==3 && to==1)
		{
			try
			{
				disk=PopC();
				if(disk==0)
				{
					System.out.println("Sorry Move is not possible");
				}
				else if(TopA==0 && disk>PegA[TopA])  
				{
					PushA(disk);
					PegC[TopC]=0;
				}
				else if(TopA>0 && disk<PegA[TopA-1])
				{
					PushA(disk);
					PegC[TopC]=0;
				}
				else
				{
					TopC=c;
					System.out.println("This move is not valid");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Move not Possible");
			}
		}
		if(from==3 && to==2)
		{
			try
			{
				disk=PopC();
				if(disk==0)
				{
					System.out.println("Sorry Move is not possible");
				}
				else if(TopB==0 && disk>PegB[TopB])   
				{
					PushB(disk);
					PegC[TopC]=0;
				}
				else if(TopB>0 && disk<PegB[TopB-1])
				{
					PushB(disk);
					PegC[TopC]=0;
				}
				else
				{
					TopC=c;
					System.out.println("This move is not valid");
				}
			}
			catch(Exception e)
			{
				System.out.println("Move not Possible");
			}
		}
	}
	/**
	 * @return This returns if the game is finished or not
	 */
	public static boolean IsFull()
	{
		if(PegC[0]==n && PegC[n-1] == 1)
		{
			System.out.println("CONGRATULATIONS You have finished the Game!!!");
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * @param peg The peg of which the smallest disk is needed
	 * @return Returns the smallest Disk on the Peg
	 */
	public static int smallestDisk(int peg)
	{
		int j=PegA.length+1;
		if(peg==1)
		{
			for(int i=0; i<PegA.length; i++)
			{
				if(PegA[i]!=0 && PegA[i]<j)
				{
					j=PegA[i];
				}
				else if(j==PegA.length+1)
				{
					j=0;
				}
			}
		}
		if(peg==2)
		{
			for(int i=0; i<PegB.length; i++)
			{
				if(PegB[i]!=0 && PegB[i]<j)
				{
					j=PegB[i];
				}
				else if(j==PegA.length+1)
				{
					j=0;
				}
			}
		}
		if(peg==3)
		{
			for(int i=0; i<PegC.length; i++)
			{
				if(PegC[i]!=0 && PegC[i]<j)
				{
					j=PegC[i];
				}
				else if(j==PegA.length+1)
				{
					j=0;
				}
			}
		}
		return j;
	}
/**
 *This is the main method
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of Disks : ");
		n=scanner.nextInt();
		System.out.println("***************************");
		if(n<0)
		{
			System.out.println("Negative Number of disks is not possible");
		}
		else if(n==0)
		{
			System.out.println("There are no Disks in the pegs");
		}
		else
		{
			PegA = new int[n];
			PegB = new int[n];
			PegC = new int[n];
		}
		
		for (int i=n ; i>0 ; i--)
		{
			PushA(i);
		}
		for(int i=0 ; i<n ; i++)
		{
			PegB[i]=0;
			PegC[i]=0;
		}
		System.out.print("PEG 1: ");
		for(int j=0;j<n;j++)
		{
			System.out.print(PegA[j] +" ");
		}
		System.out.println("");
		
		System.out.print("PEG 2: ");
		for(int j=0;j<n;j++)
		{
			System.out.print(PegB[j] +" ");
		}
		System.out.println("");
		System.out.print("PEG 3: ");
		for(int k=0;k<n;k++)
		{
			System.out.print(PegC[k] +" ");
		}
		System.out.println("");
		System.out.println("***************************");
		while(IsFull()!=true)
		{
			int from, to;
			System.out.print("Enter the peg value from which the disk needs to be moved : ");
			from = scanner.nextInt();
			System.out.print("Enter the peg value onto which the disk is to be placed : ");
			to = scanner.nextInt();
			MoveDisk(from,to);
			System.out.print("PEG 1: ");
			for(int j=0;j<n;j++)
			{
				System.out.print(PegA[j] +" ");
			}
			System.out.println("");
			
			System.out.print("PEG 2: ");
			for(int j=0;j<n;j++)
			{
				System.out.print(PegB[j] +" ");
			}
			System.out.println("");
			System.out.print("PEG 3: ");
			for(int k=0;k<n;k++)
			{
				System.out.print(PegC[k] +" ");
			}
			System.out.println("");
			System.out.println("***************************");
			System.out.println(smallestDisk(1));
		}
		scanner.close();	
	}
}
