import java.util.Scanner;
public class Programa_JavaPaint {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definicion de variables
        char[][] tablero = new char[11][11];
        char[][] tableroAux = new char[11][11];
        int cabezalf = 5;
        int cabezalc = 5;
        char cabezal = 'M';
        char opcion = ' ';
        // Crea el tablero de 11x11 y lo inicializa haciendo un cuadrado hueco
        for (int f = 0; f<11; f++){
            for (int c = 0; c<11; c++) {
                if (c == 0 || c==10) {
                    tablero[f][c] = '*';
                } else if (f==0 || f==10){
                    tablero[f][c] = '*';
                } else {
                    tablero[f][c] = ' ';
                }
            }
        }
        System.out.println("¡Bienvenido a JavaPaint, el minieditor en consola!");
        do { // ejecuta el programa hasta que el usuario decida salir
            // muestra el tablero por pantalla
            for (int f = 0; f<11; f++) {
                for (int c = 0; c < 11; c++) {
                    if (f==cabezalf && c==cabezalc) {
                        System.out.print(cabezal + " "); // pinta el cabezal sin meterlo en la matriz
                    } else {
                        System.out.print(tablero[f][c] + " ");
                    }
                }
                System.out.println();
            }
            System.out.print("a. Izquierda\nd. Derecha\ns. Abajo\nw. Arriba\np. Pintar\nq. Salir\nOpcion: ");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'a': // mueve a la izquierda
                    if (cabezalc>1 && cabezalc<=9) {
                        cabezalc--;
                    }
                    break;
                case 'd': // mueve a la derecha
                    if (cabezalc>=1 && cabezalc<9) {
                        cabezalc++;
                    }
                    break;
                case 's': // mueve hacia abajo
                    if (cabezalf>=1 && cabezalf<9) {
                        cabezalf++;
                    }
                    break;
                case 'w': // mueve hacia arriba
                    if (cabezalf>1 && cabezalf<=9) {
                        cabezalf--;
                    }
                    break;
                case 'p': // cambia al modo pintar
                    cabezal = 'P';
                    break;
            }
            if (cabezal=='P') { // pinta donde esté el cabezal
                tablero[cabezalf][cabezalc] = 'X';
            }
        } while (opcion != 'q');
        sc.close();
        System.out.println("Preciosa obra de arte! :) Gracias por usar JavaPaint");
    }
}