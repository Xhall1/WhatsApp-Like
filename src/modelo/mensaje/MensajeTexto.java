package modelo.mensaje;

import modelo.usuario.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class MensajeTexto extends Mensaje {

    public MensajeTexto(String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor) {
        super(informacion, fecha, hora, remitente, receptor);
    }


    @Override
    public void EnviarMensaje() {
        System.out.println("Mensaje enviado");
    }

    @Override
    public void EditarMensaje() {
        System.out.println("Mensaje editado");
    }

    @Override
    public void EliminarMensaje() {
        System.out.println("Mensaje eliminado");}
}
