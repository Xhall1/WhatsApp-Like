package modelo.mensaje;

import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class MensajeTipo {

    //Creando diferentes tipos de mensajes sin que el controlador dependa de ellos
    public static Mensaje crearMensaje(String tipo, String contenido, Usuario remitente, Usuario receptor, List<Opcion> opciones) {
        switch (tipo.toLowerCase()) {
            case "texto":
                return new MensajeTexto(contenido, LocalDate.now(), LocalTime.now(), remitente, receptor);
            case "multimedia":
                return new MensajeMultimedia(contenido, LocalDate.now(), LocalTime.now(), remitente, receptor);
            case "encuesta":
                return new MensajeEncuesta(contenido, LocalDate.now(), LocalTime.now(), remitente, receptor, opciones);
            default:
                throw new IllegalArgumentException("Tipo de mensaje desconocido: " + tipo);
        }
    }
}
