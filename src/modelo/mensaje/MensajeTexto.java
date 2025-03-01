package modelo.mensaje;

import modelo.intefaces.*;
import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

public class MensajeTexto extends Mensaje implements Enviar, Editar, Eliminar {
    public MensajeTexto(String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor) {
        super(informacion, fecha, hora, remitente, receptor);
    }

    @Override
    public void enviar() {
        System.out.println("Mensaje de texto enviado");
        setEstado(true);
    }

    @Override
    public void editar() {
        if (!getEstado()) {
            System.out.println("Mensaje de texto editado");
        } else {
            System.out.println("No se puede editar un mensaje de texto ya enviado");
        }
    }

    @Override
    public void eliminar() {
        System.out.println("Mensaje de texto eliminado");
    }
}
