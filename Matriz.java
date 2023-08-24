import java.security.KeyStore;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("ingrese el numero para las filas");
        int FILA = scanner.nextInt();

        System.out.print("Ingrese el numero de columnas");
        int COLUMNA = scanner.nextInt();

        System.out.println("Las filas son: "+ FILA + "Las columnas son:" + COLUMNA);

        boolean validardimensiones = validarDimensiones(FILA,COLUMNA);

        if (validardimensiones) {
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }

    }

    public static boolean validarDimensiones(int FILA, int COLUMNA) {
        if (FILA > 0 && COLUMNA > 0){
            return true
        } else {
            return false

        }
    }
}
