import java.util.Random;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {

        Random generator = new Random();
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = generator.nextInt(101);

        System.out.println(numeroAleatorio);
        

    }
}