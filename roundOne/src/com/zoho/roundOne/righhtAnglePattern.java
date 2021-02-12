package com.zoho.roundOne;

import java.util.Scanner;

public class righhtAnglePattern {

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
		String b = "", c = "";
		for (int row = 0; row < length; row++) {
			
			
			for(int column = length - row -1 ; column >= 0; column--) {
				System.out.print(" ");
				
			}
			if (count == 0) {
				for(int i = middleIndex; i<length && i <= length-1 - middleIndex + row; i++) {
					
					b = b + (input.charAt(i));
					
					if(i == length -1) {
						count++;
						c = b;
					}
				}
			}else {
				
				for(int j = 0; j< middleIndex && j<= row - middleIndex - 1; j++) {
					b = b + input.charAt(j);
				}
				b = c + b;
			}
			System.out.print(b);
			if (row != length -1) {b="";}
			System.out.print("\n");
			}
		
			
		}

	}
