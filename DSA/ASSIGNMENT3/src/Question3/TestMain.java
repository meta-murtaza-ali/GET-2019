package Question3;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of bowlers");
		int noOfBowlers = input.nextInt();
		System.out.println("Enter virat ball");
		int noOfViratBalls = input.nextInt();
		PriorityBowler object = new  PriorityBowler(noOfBowlers,noOfViratBalls);
		int i=1;
		while(noOfBowlers!=0){
			System.out.println("Enter Bowler name :" + i);
			String name = input.next();
			System.out.println("Enter Bowlers Balls");
			int Balls = input.nextInt();
			object.enQueue(name, Balls);
			i++;
			noOfBowlers--;
		}
		try {
			object.deQueue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		object.display();
	}
} 
