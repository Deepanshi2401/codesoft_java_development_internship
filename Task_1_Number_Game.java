import java.util.Scanner;
import java.util.Random;

public class Task_1_Number_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min_Range = 1;
        int max_Range = 100;
        int max_Attempts = 8;
        int score = 0;

        System.out.println("Hey Arithmetic enthusiast, Welcome to the Number Charades!\n");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(max_Range - min_Range + 1) + min_Range;
            System.out.printf("Round - Range: %d to %d\n", min_Range, max_Range);
            System.out.println("You have " + max_Attempts + " attempts.\n");

            int attempts = 0;
            boolean guessed_Correctly = false;

            while (attempts < max_Attempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.printf("Congrats! You guessed the number in %d attempts.\n", attempts);
                    score += 8-attempts;
                    guessed_Correctly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("That's low.. Please try again.\n");
                } else {
                    System.out.println("That's high! Please try again.\n");
                }
            }

            if (!guessed_Correctly) {
                System.out.println("sorry !! You have spent " +
                        "All your Attempts\n The correct number was-" + targetNumber);
            }

            System.out.println("Your Score for this trial is: " + score + "/8 \n");

            System.out.print("Do you want to play one more round? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Had a great time with you,Thank you for playing.. Your Score is: " + score);

        scanner.close();
    }
}