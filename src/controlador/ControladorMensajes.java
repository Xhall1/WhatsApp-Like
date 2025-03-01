package controlador;

import modelo.mensaje.Mensaje;
import modelo.mensaje.MensajeTipo;
import modelo.mensaje.Opcion;
import modelo.usuario.Usuario;
import modelo.intefaces.Enviar;
import java.util.List;

//Para mostrar los mensajes que están en el chat
public class ControladorMensajes {
    private final ControladorHistorialChat historial;
    public ControladorMensajes(ControladorHistorialChat historial) {
        this.historial = historial;
    }

    public void enviarMensaje(String tipo, String contenido, Usuario remitente, Usuario receptor, List<Opcion> opciones) {
        Mensaje mensaje = MensajeTipo.crearMensaje(tipo, contenido, remitente, receptor, opciones);
        historial.agregarMensaje(mensaje);
        if (mensaje instanceof Enviar) {
            ((Enviar) mensaje).enviar();
        }
    }
}
