package Ex6;

import java.util.Scanner;

public class ControlAsistencia {
    public static void asistencia() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digita la cantidad total de estudiantes: ");
        int crear = sc.nextInt();
        sc.nextLine();
        if (crear <= 0){
            System.out.println("Cantidad inválida.");
            return;
        }

        for (int i = 0; i < crear; i++) {
            String estudiante;

            do {
                System.out.print("Digita el nombre completo del estudiante: ");
                estudiante = sc.nextLine().trim();
                if (estudiante.isEmpty()) {
                    System.out.println("Nombre inválido. Intenta nuevamente.");
                }
                }
                while (estudiante.isEmpty()) ;

                String estado;

                do {
                    System.out.print("¿El estudiante está presente o ausente?: ");
                    estado = sc.nextLine().toLowerCase();

                    if (!estado.equals("presente") && !estado.equals("ausente")) {
                        System.out.println("Respuesta inválida. Digita 'presente' o 'ausente'.");
                    }
                    }
                    while (!estado.equals("presente") && !estado.equals("ausente"));

                    System.out.println("Registro guardado: " + estudiante + " — " + estado);
                    System.out.println("----------------------------------");
                }
                sc.close();
            }
        }

