import java.util.Scanner;
public class arrayAverageScore14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] score = new int[n];
        double totalPassed = 0;
        double totalFailed = 0;
        int countPassed = 0;
        int countFailed = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (score[i] > 70) {
                totalPassed += score[i];
                countPassed++;
            } else {
                totalFailed += score[i];
                countFailed++;
            }
        }

        if (countPassed > 0) {
            System.out.println("The average score of students who passed is "
                    + (totalPassed / countPassed));
        } else {
            System.out.println("No students passed.");
        }

        if (countFailed > 0) {
            System.out.println("The average score of students who failed is "
                    + (totalFailed / countFailed));
        } else {
            System.out.println("No students failed.");
        }
        sc.close();
    }
}
