package modelo.mensaje;
import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class MensajeMultimedia extends Mensaje {

    public MensajeMultimedia(String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor) {
        super(informacion, fecha, hora, remitente, receptor);
    }

    @Override
    public void EnviarMensaje() {
        System.out.println("Mensaje enviado");
        setEstado(true);
    }

    @Override
    public void EliminarMensaje() {
        System.out.println("Mensaje eliminado");
    }

    @Override
    public void EditarMensaje() {
        if (getEstado()) {
            System.out.println("No se puede editar un mensaje multimedia ya enviado");
        }
    }
}