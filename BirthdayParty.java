package TestProject;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of college students: ");
        int n = scanner.nextInt();

        int[] birthdays = new int[31]; // array to store the count of birthdays for each day

        System.out.println("Enter the day of birth for each student (1-31):");
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            birthdays[day - 1]++; // increment the count for the corresponding day
        }

        int maxCount = 0;
        int maxDay = 0;

        for (int i = 0; i < 31; i++) {
            if (birthdays[i] > maxCount) {
                maxCount = birthdays[i];
                maxDay = i + 1; // store the day with the maximum count
            }
        }

        System.out.println("The day with the largest number of students born is: " + maxDay);
    }
}