
import java.util.Scanner;
public class Examen23112022 {
    public static void main (String[] args) {
        int minimo, maximo;
        int num1, num2;
        int opcion = 1;

        Scanner sc = new Scanner(System.in);
        do {
            boolean acertado = false;
            System.out.print("-A-L-E-A-T-O-R-I-U-M-\n" +
                    "Aleatorium pensará un número entre 0 y 100\n");

            maximo = 100;
            minimo = 0;

            int intentos = (int)(Math.log(maximo-minimo+1) / Math.log(2));

            System.out.printf("-A-L-E-A-T-O-R-I-U-M-\n" +
                    "Estoy pensando un número entre 0 y 100\n");

            int numeroSecreto = (int)(Math.random()*((maximo-minimo)+1)+minimo);

            while (!acertado) {
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

            if (acertado) {
                System.out.print("Elige una opción\n" +
                        "1. Volver a jugar.\n" +
                        "2. Salir del juego.\n" +
                        "Opcion: ");
                opcion = sc.nextInt();
            }
        } while (opcion!=2);
        System.out.print("Gracias por jugar a -A-L-E-A-T-O-R-I-U-M-");
        sc.close();
    }
}
