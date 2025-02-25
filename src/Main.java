import controlador.ControladorChat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControladorChat controller = new ControladorChat("Tú", "Bot");
        controller.mostrarParticipantes();
        Scanner scanner = new Scanner(System.in);
        String mensaje;

        System.out.println("\nEscribe un mensaje (o 'salir' para terminar):");
        while (true) {
            mensaje = scanner.nextLine();

            if (mensaje.equalsIgnoreCase("salir")) {
                System.out.println("Fin de la conversación.");
                break;
            }

            controller.enviarMensajeUsuario(mensaje);
            controller.mostrarHistorial();
            System.out.println("\nEscribe otro mensaje (o 'salir' para terminar):");
        }

        scanner.close();
    }
}