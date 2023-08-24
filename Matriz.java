import java.util.Scanner;
import java.util.Random;
public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("ingrese el numero para las filas");
        int FILA = scanner.nextInt();

        System.out.print("Ingrese el numero de columnas");
        int COLUMNA = scanner.nextInt();

        System.out.println("Las filas son: " + FILA + " Las columnas son:" + COLUMNA);

        int[][] Matriz = new int[FILA][COLUMNA];

        Random random = new Random();

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                Matriz[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }

        boolean validarnumero = validarNumero(FILA, COLUMNA);

        if (validarnumero) {
            System.out.println("Numero Valido");
        } else {
            System.out.println("Numero Invalido");
        }

    }

    public static boolean validarNumero(int FILA, int COLUMNA) {
        if (FILA > 0 && COLUMNA > 0) {
            return true;
        } else {
            return false;
        }

    }
    //por falta de tiempo dejare como comentario el codigo para mostrar las filas
    public static void mostrarFila(int [][] Matriz, int FILA){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de la fila que deseas mostrar (0 a " + (FILA - 1) + "): ");
        int filaselec = scanner.nextInt();
        if (filaselec >= 0 && filaselec < FILA) {
            mostrarFila(Matriz, filaselec);
        } else {
            System.out.println("Fila no válida.");
        }
        scanner.close();
    }
}