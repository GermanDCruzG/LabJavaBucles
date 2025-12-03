package Ex1;

import java.util.Scanner;
public class Registradora {
    public static void registradora() {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int hamburguesas = 0;
        int papas = 0;
        int gaseosas = 0;

       final int pHamb = 15000;
       final int pPapas = 4000;
       final int pGaseosa = 6000;

        do{
            System.out.println("Menú");
            System.out.println("1. Hamburguesa sencilla: $15.000");
            System.out.println("2. Papa francesa porción: $4.000");
            System.out.println("3. Gaseosa vaso: $6.000");
            System.out.println("4. Ordenar");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    hamburguesas++;
                    System.out.println("Elegiste Hamburguesa sencilla.");
                    break;
                case 2:
                    papas++;
                    System.out.println("Elegiste Papa francesa porción.");
                    break;
                case 3:
                    gaseosas++;
                    System.out.println("Elegiste Gasesosa vaso.");
                    break;
                case 4:
                    System.out.println("Orden en proceso...");
                    imprimirOrden(hamburguesas, papas, gaseosas, pHamb, pPapas, pGaseosa);
                    return;
                case 5:
                    System.out.println("Proceso finalizado.");
                case 6:
                    System.out.println("Opción inválida.");

            }
        }while(opcion != 5);
    }
    public static void imprimirOrden(int hamburguesas, int papas, int gaseosas, int pHamb, int pPapas, int pGaseosa){

        int total = (hamburguesas * pHamb) + (papas * pPapas) + (gaseosas * pGaseosa);

        System.out.println("===== ORDEN FINAL =====");

        if (hamburguesas > 0)
            System.out.println("Hamburguesas x" + hamburguesas + ": $" + (hamburguesas * pHamb));

        if (papas > 0)
            System.out.println("Papas x" + papas + ": $" + (papas * pPapas));

        if (gaseosas > 0)
            System.out.println("Gaseosas x" + gaseosas + ": $" + (gaseosas * pGaseosa));

        if (total == 0) {
            System.out.println("No ordenaste nada.");
        } else {
            System.out.println("-----------------------");
            System.out.println("Total a pagar: $" + total);
        }
        System.out.println("=========================");
        System.out.println("Gracias por tu compra.");
}
}

