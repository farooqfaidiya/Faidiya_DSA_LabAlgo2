package Assignment1;

import java.util.Scanner;

public class Assgn1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter Number of Days Shop was open");
			int noOfDays = sc.nextInt();

			int revenue[] = new int[noOfDays];
			System.out.println("Please enter the collection for each day");
			for (int i = 0; i < revenue.length; i++) {
				revenue[i] = sc.nextInt();
			}

			System.out.println("Please enter Number of Targets");
			int totaltargets = sc.nextInt();
			int sum;
			int flag;
			for (int i = 1; i <= totaltargets; i++) {
				sum = 0;
				flag = 0;
				System.out.println("Please enter value of Target " + i);
				int target = sc.nextInt();

				for (int j = 0; j < revenue.length; j++) {
					sum += revenue[j];
					if (sum >= target) {
						System.out.println("Target Achieved of Day " + (j + 1));
						flag = 1;
						break;
					}
				}
				if (flag == 0)
					System.out.println("Target Not Achieved");

			}
		}

	}

}
