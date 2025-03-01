package controlador;

import modelo.usuario.Usuario;
import java.util.Scanner;

public class ControladorSalidaChat {
    private final ControladorChat controlador;
    private final Scanner scanner;

    public ControladorSalidaChat() {
        controlador = new ControladorChat("Tú");
        scanner = new Scanner(System.in);
    }

    public void iniciarChat() {
        controlador.mostrarParticipantes();
        Usuario receptor = new Usuario("Bot", "Tu"); // Se define un receptor

        System.out.println("\nEscribe un mensaje o 'salir' para terminar: ");

        while (true) {
            String mensaje = scanner.nextLine();

            if (mensaje.equalsIgnoreCase("salir")) {
                System.out.println("Fin de la conversación.");
                break;
            }

            controlador.enviarMensajeUsuario(mensaje, receptor); // Ahora envía el receptor también
            controlador.mostrarHistorialChat();
            System.out.println("\nEscribe otro mensaje o 'salir' para terminar: ");
        }
    }
}
