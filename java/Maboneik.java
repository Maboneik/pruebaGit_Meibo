import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un n�mero aleatorio entre 1 y 100
        int intentos = 0;
        int intentoUsuario;
        boolean haAdivinado = false;

        System.out.println("�Bienvenido al juego de adivinar el n�mero!");
        System.out.println("Estoy pensando en un n�mero entre 1 y 100. �Puedes adivinar cu�l es?");

        while (!haAdivinado) {
            System.out.print("Introduce tu intento: ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario == numeroAleatorio) {
                haAdivinado = true;
            } else if (intentoUsuario < numeroAleatorio) {
                System.out.println("El n�mero que estoy pensando es mayor. �Sigue intent�ndolo!");
            } else {
                System.out.println("El n�mero que estoy pensando es menor. �Sigue intent�ndolo!");
            }
        }

        System.out.println("�Felicidades! �Has adivinado el n�mero en " + intentos + " intentos!");
        scanner.close();
    }
}
