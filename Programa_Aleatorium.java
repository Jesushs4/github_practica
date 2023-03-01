
import java.util.Scanner;

public class Programa_Aleatorium {
    public static void main(String[] args) {
        // Definición de variables
        int minimo, maximo; // introducidos por el usuario
        int num1, num2; // generados por la máquina
        int opcion = 1;

        Scanner sc = new Scanner(System.in);
        do {
            boolean acertado = false;
            // Pide el intervalo al usuario
            System.out.print("-A-L-E-A-T-O-R-I-U-M-\n" +
                    "Aleatorium pensará un número entre los valores que tu decidas\n" +
                    "Introduzca el valor mínimo del intervalo: ");
            minimo = sc.nextInt();
            System.out.print("Introduzca el valor máximo del intervalo: ");
            maximo = sc.nextInt();
            // Genera el intervalo de -A-L-E-A-T-O-R-I-U-M-
            do {
                num1 = (int) (Math.random() * ((maximo - minimo) + 1) + minimo);
                num2 = (int) (Math.random() * ((maximo - minimo) + 1) + minimo);
            } while (num1 == num2);
            maximo = Math.max(num1, num2);
            minimo = Math.min(num1, num2);

            // Calculamos el número de intentos
            int intentos = (int) (Math.log(maximo - minimo + 1) / Math.log(2));

            // Mostramos los resultados por pantalla
            System.out.printf("-A-L-E-A-T-O-R-I-U-M-\n" +
                    "Estoy pensando un número entre %d y %d\n" +
                    "Tienes %d intentos\n", minimo, maximo, intentos);

            // Piensa en el número que debe adivinar el usuario
            int numeroSecreto = (int) (Math.random() * ((maximo - minimo) + 1) + minimo);

            // Empieza el juego
            while (!acertado && intentos > 0) {
                System.out.println("Escribe el número: ");
                int num = sc.nextInt();
                if (num == numeroSecreto) {
                    System.out.println("Enhorabuena !! Has acertado :)\nEfectivamente el número era: " + numeroSecreto);
                    acertado = true;
                } else if (num < numeroSecreto) {
                    System.out.println("Oops! Te has quedado corto.");
                    intentos--;
                } else {
                    System.out.println("Oops! Te has pasado.");
                    intentos--;
                }
            }
            if (intentos == 0) {
                System.out.println("Has superado el número de intentos.\n" +
                        "El número que había pensado era: " + numeroSecreto);
            }
            if (intentos == 0 || acertado) {
                System.out.print("Elige una opción\n" +
                        "1. Volver a jugar.\n" +
                        "2. Salir del juego.\n" +
                        "Opcion: ");
                opcion = sc.nextInt();
            }
        } while (opcion != 2);
        System.out.print("Gracias por jugar a -A-L-E-A-T-O-R-I-U-M-");
        sc.close();
    }
}