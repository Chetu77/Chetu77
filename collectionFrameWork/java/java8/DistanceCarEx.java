package java8;

import java.util.Scanner;

public class DistanceCarEx {

	public static void main(String[] args) {
		int dist;
		int u = 36*1000;
		int a = 5;
		
       Scanner sc=new Scanner(System.in);
       System.out.println("enter time");
		 int t=sc.nextInt();
		
		dist=u*t/3600+((a*t*t)/2);
		System.out.println(dist);
	}

}
