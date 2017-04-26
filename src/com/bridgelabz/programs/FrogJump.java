package com.bridgelabz.programs;

import java.util.Scanner;

class FrogJump {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter the number of walls");
        int number=scanner.nextInt();
        int array[]=new int[number];
        for(int i=0;i<array.length;i++)
        {
		System.out.println("Enter the "+(i+1)+"  Wall Length ");
		 array[i] = scanner.nextInt();
        }

		System.out.println("Enter the length that frog has to travel");
		int step = scanner.nextInt();

		int count = calculatingLength(array, step);

		System.out.println("The frog requries " + count
				+ " steps to reach the wall length");

	}

	private static int calculatingLength(int array[], int step) {
		int intial = 0, slip = 1, count = 0;
        for(int i=0;i<array.length;i++)
        {
        	intial=0;
		while (intial < array[i]) {
			intial = intial + step - slip;
			count++;
		}
        }
		return count;

	}

}
