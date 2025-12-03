package Ex2;

import java.util.Scanner;
public class Calculadora {
    public static void calculadora() {

        int precio1 = 20000;
        int precio2 = 40000;
        int precio3 = 60000;
        int precio4 = 80000;
        int precio5 = 100000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Bienvenid@. Por favor digita el precio del producto: ");
        String numPrecio = sc.nextLine();
        int precio = Integer.parseInt(numPrecio);

            if (precio < 0) {
                System.out.println("Por favor digita un precio válido.");
                return;
            }
            for (int i = 0; i < 1; i++) {
                if (precio < precio1) {
                    System.out.println("No se aplica ningún descuento.");
                    return;
                }
            }
            for (int i = 0; i < 1; i++) {
                if (precio >= precio1 && precio2 > precio) {
                    System.out.println("Tu descuento será de 10%:");
                    double descuento1 = precio - (precio * 0.1);
                    System.out.println("Valor a pagar: $" + descuento1);
                    return;
                }
            }
            for (int i = 0; i < 1; i++) {
                if (precio >= precio2 && precio3 > precio) {
                    System.out.println("Tu descuento será de 20%.");
                    double descuento2 = precio - (precio * 0.2);
                    System.out.println("Valor a pagar: $" + descuento2);
                    return;
                }
            }
            for (int i = 0; i < 1; i++) {
                if (precio >= precio3 && precio4 > precio) {
                    System.out.println("Tu descuento será de 30%.");
                    double descuento3 = precio - (precio * 0.3);
                    System.out.println("Valor a pagar: $" + descuento3);
                    return;
                }
            }
            for (int i = 0; i < 1; i++) {
                if (precio >= precio4 && precio5 > precio) {
                    System.out.println("Tu descuento será de 40%.");
                    double descuento4 = precio - (precio * 0.4);
                    System.out.println("Valor a pagar: $" + descuento4);
                    return;
                }
            }
            for (int i = 0; i < 1; i++) {
                if (precio >= precio5) {
                    System.out.println("Tu descuento será de 50%.");
                    double descuento5 = precio - (precio * 0.5);
                    System.out.println("Valor a pagar: $" + descuento5);
                    return;
                }
            }
       }
    }

