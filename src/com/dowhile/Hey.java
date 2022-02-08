package com.dowhile;

import java.util.Scanner;

public class Hey {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
		    System.out.println("Input a number, 0 to quit");
		    int command = Integer.valueOf(scanner.nextLine());
		    if (command == 0) {
		        break;
		    }

		    System.out.println("You input " + command);
		}

		System.out.println("Done, thank you!");
	}

}
