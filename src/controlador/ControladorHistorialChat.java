package controlador;

import modelo.mensaje.Mensaje;
import java.util.ArrayList;
import java.util.List;

public class ControladorHistorialChat {
    private final List<Mensaje> historialMensajes;

    public ControladorHistorialChat() {
        this.historialMensajes = new ArrayList<>();
    }

    public void agregarMensaje(Mensaje mensaje) {
        historialMensajes.add(mensaje);
    }

    // Se devielve el arraylist para evitar modificaciones
    public List<Mensaje> obtenerMensajes() {
        return new ArrayList<>(historialMensajes);
    }

    public void mostrarMensajes() {
        if (historialMensajes.isEmpty()) {
            System.out.println("No hay mensajes en el chat.");
        } else {
            System.out.println("\nHistorial de mensajes:");
            for (Mensaje mensaje : historialMensajes) {
                System.out.println(mensaje);
            }
        }
    }
}
