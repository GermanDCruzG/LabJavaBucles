package Ex4;

import java.util.Scanner;
public class CajeroAutomatico {
    public static void cajero() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int saldo = 0;
        int retiro;
        int deposito;

        do {
        System.out.println("Bienvenid@. Por favor selecciona una opción: ");
        System.out.println("Digita 1 para consultar saldo.");
        System.out.println("Digita 2 para retirar.");
        System.out.println("Digita 3 para depositar.");
        System.out.println("Digita 0 para salir.");
        opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado consultar.");
                    System.out.println("Tu saldo es: $" + saldo);
                    break;
                case 2:
                    System.out.println("Has seleccionado retirar.");
                    System.out.println("Digita la cantidad a retirar.");
                    retiro = sc.nextInt();
                    if(retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo = saldo - retiro;
                        System.out.println("Has retirado: $" + retiro);
                        System.out.println("Saldo actual: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado depositar.");
                    System.out.println("Digita la cantidad a depositar.");
                    deposito = sc.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Has depositado: $" + deposito);
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;
                case 0:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while(opcion != 0);
    }
}


