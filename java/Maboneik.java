import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 0;
        int intentoUsuario;
        boolean haAdivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        while (!haAdivinado) {
            System.out.print("Introduce tu intento: ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario == numeroAleatorio) {
                haAdivinado = true;
            } else if (intentoUsuario < numeroAleatorio) {
                System.out.println("El número que estoy pensando es mayor. ¡Sigue intentándolo!");
            } else {
                System.out.println("El número que estoy pensando es menor. ¡Sigue intentándolo!");
            }
        }

        System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
        scanner.close();
    }
}
