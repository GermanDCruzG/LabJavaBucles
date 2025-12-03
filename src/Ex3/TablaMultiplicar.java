package Ex3;

import java.util.Scanner;
public class TablaMultiplicar {
    public static void tabla() {

        Scanner sc = new Scanner(System.in);
        int numero = -1;
        while (numero != 0){
        System.out.println("Bienvenid@. Por favor digita un número entre 1 y 10 (0 para salir): ");
        numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Saliendo...");
                break;
            }
            if (numero < 1 || numero > 10) {
                System.out.println("Número inválido.");
                continue;
            }
            for ( int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
