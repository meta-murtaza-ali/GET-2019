import java.util.InputMismatchException;
import java.util.Scanner;

public class JobScheduler {
	int total_no_of_process;
	Scanner s1;
	
	JobScheduler()
	{
		s1=new Scanner(System.in);
	}
	
	int[][] input()
	{
			
		int i,process[][] = null;  // array to print the detail
		try{
			
			System.out.println("Enter total no. of process :: ");
			total_no_of_process=s1.nextInt();
			process=new int[total_no_of_process][5];
			
			for(i=0;i<total_no_of_process;i++)
				{
					System.out.println("Enter Arrival Time :: ");
					process[i][0]=s1.nextInt();
					
					System.out.println("Enter Burst Time :: ");
					process[i][1]=s1.nextInt();
				}
			
		}
		catch(InputMismatchException e )
		{
			System.out.println("please enter valid number of processes");
			
		}
		
		return process;
	}
	
	
	
	int[][] waitTime(int p[][])
	{
		int i;
		for(i=0;i<total_no_of_process;i++)
		{
			p[i][2]=p[i][3]-p[i][1];
		}
		return p; 
	}
	
	
	int[][] turnAroundTime(int p[][])
	{
		int i;		
		for(i=0;i<total_no_of_process;i++)
		{
			p[i][3]=p[i][4]-p[i][0];
		}
		return p; 
	}
	
	
	int[][] completionTime(int p[][])
	{
		int i,j;		
		for(i=0; i<total_no_of_process;i++)
			for(j=0; j<=i;j++)
				p[i][4]+=p[j][1];
		return p; 
	}
	
	float avgWaitTime(int p[][])
	{
		int i;
		float avg=0;
		for(i=0;i<total_no_of_process;i++)
			avg+=p[i][2];
		avg/=total_no_of_process;
		return avg; 
	}
	
	int maxWaitTime(int p[][])
	{
		int max=0;
		int i;		
		for(i=0;i<total_no_of_process;i++)
			if(p[i][2]>max)
				max=p[i][2];
		return max;
	}
	
	
	void print(int p[][])
	{
		System.out.println("  Process no.   Arrival time  Burst Time  Waiting Time  TurnAround Time  Completion Time  ");
		for(int i=0;i<total_no_of_process;i++)
		{	
			System.out.print("     p"+i);
			for(int j=0;j<5;j++)
				System.out.print("             "+p[i][j]);
			System.out.println("");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobScheduler js=new JobScheduler();
		
		
		int process[][]=js.input();
		if(process!=null)
		{
			process=js.completionTime(process);
			process=js.turnAroundTime(process);
			process=js.waitTime(process);
			js.print(process);
		
			System.out.println("Average Waiting Time :: "+js.avgWaitTime(process));
			System.out.println("Maximum Waiting Time :: "+js.maxWaitTime(process));
		}
	}

}
