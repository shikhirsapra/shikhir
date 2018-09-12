package techaspectshikhir1;
import java.util.*;

public class home {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Management System. Press any key to proceed.");
		System.out.println("Enter the number of students in this class:");
		int n=sc.nextInt();
		String names[]=new String[n];
		int ages[]=new int[n];
		String branches[]=new String[n];
		int years[]=new int[n];
		int semesters[]=new int[n];
		float previous[]=new float[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter your name:");
			names[i]=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter your age:");
			ages[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your branch:");
			branches[i]=sc.nextLine();
			System.out.println("Enter your year:");
			years[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your semester:");
			semesters[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your previous semester score:");
			previous[i]=sc.nextFloat();
			sc.nextLine();
		}
		System.out.println("All data has been successfully entered. \nPress Y if you wish to view list of all students");
		String ans=sc.nextLine();
		sc.nextLine();
		if(ans.equals("Y"))
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(names[j]);
			}
		}
		
		
	}
}