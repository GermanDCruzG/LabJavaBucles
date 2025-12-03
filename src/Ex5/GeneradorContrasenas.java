package Ex5;

import java.util.Scanner;
import java.util.Random;

public class GeneradorContrasenas {
    public static void clave() {

    Scanner sc = new Scanner(System.in);
    int crear;

        do {
            System.out.println("Bienvenid@ a este generador de contraseñas.");
            System.out.println("Por favor, digita 1 para comenzar.");
            crear = sc.nextInt();

            switch (crear) {
                case 0:
                    System.out.println("Has seleccionado finalizar.");
                    break;
                case 1:
                    System.out.println("Has seleccionado comenzar.");

                    String letrasMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String letrasMin = "abcdefghijklmnopqrstuvwxyz";
                    String numeros = "0123456789";
                    String especiales = "!@#$%&*()-_=+<>?";

                    String todos = letrasMay + letrasMin + numeros + especiales;

                    int longitud = 8;
                    String contrasena = "";

                    Random random = new Random();

                    for (int i = 0; i < longitud; i++) {
                        int indice = random.nextInt(todos.length());
                        contrasena += todos.charAt(indice);
                    }
                    System.out.println("La contraseña generada es: " + contrasena);
            }
        }
            while (crear != 0) ;
        }
    }


