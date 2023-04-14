package matriz2;
import java.util.Random;
import java.util.Scanner;
public class Matriz2 {
        public static void main(String[] args) {
        int n = numero("Ingrese el valor de n para filas:");
        int m = numero("Ingrese el valor de m para columnas: ");
    int[][] matriz = new int[n][m];
    Random random = new Random();
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(999-1) + 1;
            }
        }
            System.out.println("La matriz es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
        private static int numero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("***!Error! Ingrese un valor numerico ENTERO***" + ".");
            System.out.print(mensaje);
            scanner.next();
        }
        return scanner.nextInt();
       
        }
    }