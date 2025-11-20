import java.util.Scanner;
public class arrayAverageScore14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        double total = 0;
        double average;
        int passed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];

            if (score[i] > 70) {
                passed++;
            }
        }

        average = total / score.length;
        System.out.println("The average score is: " + average);
        System.out.println("Number of students who passed (>70): " + passed);
        sc.close();
    }
}
