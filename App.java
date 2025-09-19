import java.util.Random;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {

        Random generator = new Random();
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = generator.nextInt(101);

        System.out.println(numeroAleatorio);

        System.out.println("Welcome to the Number Guessing Game!\r\n" + //
                        "I'm thinking of a number between 1 and 100.\r\n" + //
                        "You have 5 chances to guess the correct number.\r\n");
        
        
        boolean answer = false;
        int level = 0;

        while (!answer) {
            System.out.println("Please select the difficulty level:\r\n" + //
                        "1. Easy (10 chances)\r\n" + //
                        "2. Medium (5 chances)\r\n" + //
                        "3. Hard (3 chances)");

            int selectedLevel = teclado.nextInt();
            if (selectedLevel == 1 || selectedLevel == 2 || selectedLevel ==3) {
                answer = true;
                switch (selectedLevel) {
                    case 1:
                        System.out.println("Great! You have selected the Easy difficulty level.");
                        level = selectedLevel;
                        break;
                    case 2:
                        System.out.println("Great! You have selected the Medium difficulty level.");
                        level = selectedLevel;
                        break;
                    case 3:
                        System.out.println("Great! You have selected the Hard difficulty level.");
                        level = selectedLevel;
                        break;                                           
             
                }
            }
        }

        int chances;

        if(level == 1){
            chances = 10;
        }else if (level == 2) {
            chances = 5;
        } else {
            chances = 3;
        }

        System.out.println("Let's start the game!");


        for (int i = 0; i < chances; i++) {
            
            System.out.println("Enter your guess:");

            int selectedGuess = teclado.nextInt();

            if(selectedGuess == numeroAleatorio){
                int attempts = i + 1; 
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }else if (selectedGuess > numeroAleatorio) {
                System.out.println("Incorrect! The number is less than " + selectedGuess);
            }else{System.out.println("Incorrect! The number is greater than " + selectedGuess);}
        }
    }
}