package java8;

import java.util.Scanner;

public class CarDistEx {
		public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);

	int velocity_in_Km=36;

	int velocity_in_meters=velocity_in_Km*1000;

	int constant_accelaration=5;

	 

	System.out.println("enter the time interval");

	int Time_interval=sc.nextInt();

	 

	int distance_travlled= (velocity_in_meters*Time_interval)/3600+((constant_accelaration*Time_interval*Time_interval)/2);

	System.out.println(distance_travlled);

		}

	 

	}

