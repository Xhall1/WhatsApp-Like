package modelo.mensaje;

import modelo.intefaces.Enviar;
import modelo.intefaces.Eliminar;
import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

public class MensajeMultimedia extends Mensaje implements Enviar, Eliminar {

    public MensajeMultimedia(String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor) {
        super(informacion, fecha, hora, remitente, receptor);
    }

    @Override
    public void enviar() {
        System.out.println("Mensaje multimedia enviado");
        setEstado(true);
    }

    @Override
    public void eliminar() {
        System.out.println("Mensaje multimedia eliminado");
    }
}
