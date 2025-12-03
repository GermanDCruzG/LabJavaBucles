package Ex7;

import java.util.Scanner;

public class CalculadoraPromedios {
    public static void promedios() {

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas notas vas a digitar?: ");
        int notas = sc.nextInt();
        double suma = 0;
        if (notas <= 0) {
            System.out.println("Nota inválida.");
            return;
        }
        System.out.println("Digita las " + notas + " notas: ");

        for (int i = 0; i < notas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double calificacion = sc.nextDouble();
            suma +=calificacion;
        }
        double promedio = suma / notas;
        System.out.println("El promedio de las notas es: " + promedio);
        if (promedio < 0) {
            System.out.println("Dato inválido. Intenta nuevamente.");
        }
        if (promedio < 60) {
            System.out.println("Reprobado.");
        } else if (promedio >= 60 && promedio < 79.9) {
            System.out.println("Aprobado.");
        } else if (promedio >= 80) {
            System.out.println("Excelente.");
        }
        sc.close();
    }
}

