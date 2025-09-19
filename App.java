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
                        break;
                    case 2:
                        System.out.println("Great! You have selected the Medium difficulty level.");
                        break;
                    case 3:
                        System.out.println("Great! You have selected the Hard difficulty level.");
                        break;                                           
             
                }
            }
        }



    }
}