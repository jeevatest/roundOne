package com.zoho.roundOne;

import java.util.Scanner;

public class righhtAnglePattern {

	public righhtAnglePattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for pattern design: ");
		String input = sc.nextLine();
		int length = input.length();
		
		while (length % 2 == 0) {
			System.out.println("Entered string has even number of letters. Please enter a new string: ");
			input = sc.nextLine();
			length = input.length();
		}
		int middleIndex = length / 2;
		int count = 0;
		char a,b = 0;
		for (int row = 0; row < length; row++) {
			
			
			for(int column = length - row; column > 0; column--) {
				System.out.print(" ");
				
			}
			
			for (int column = 0; column < row+1; column++) {
				
				if (column == length - 1) {
					a = (char) (input.charAt(middleIndex) + b );
					b = input.charAt(middleIndex+1);
					System.out.print(a);
				}
				else {
					a = (char) (b + input.charAt(middleIndex));
					b= input.charAt(count+1);
					System.out.print(a);
				}
			}
			System.out.print("\n");
		}

	}

}
