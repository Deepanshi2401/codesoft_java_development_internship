import java.util.Scanner;
public class Task_2_Student_grade_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int num_ofSubjects = scanner.nextInt();

        int total_Marks = 0;
        System.out.println("Enter Subject-wise Marks below out of 100\n" );

        for (int i = 1; i <= num_ofSubjects; i++) {
            System.out.println("Enter Marks Obtained in subject " + i +":");
            int marks = scanner.nextInt();
            total_Marks += marks;
        }

        double avg_Percentage = (double) total_Marks / num_ofSubjects;

        String grade;
        if (avg_Percentage >= 90) {
            grade = "A+";
        } else if (avg_Percentage >= 80) {
            grade = "A";
        } else if (avg_Percentage >= 70) {
            grade = "B";
        } else if (avg_Percentage >= 60) {
            grade = "C";
        } else if (avg_Percentage >= 45) {
            grade = "D";
        } else if (avg_Percentage >= 33) {
            grade = "E";
        } else {
            grade = "Fail";
        }

        System.out.println("\nTotal Marks: " + total_Marks);
        System.out.println("Average Percentage: " + avg_Percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
