package modelo.mensaje;
import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

public class MensajeTexto extends Mensaje {

    public MensajeTexto(String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor) {
        super(informacion, fecha, hora, remitente, receptor);
    }

    @Override
    public void EnviarMensaje() {
        System.out.println("Mensaje de texto enviado");
        setEstado(true);
    }

    @Override
    public void EditarMensaje() {
        if (!getEstado()) {
            System.out.println("Mensaje de texto editado");
        } else {
            System.out.println("No se puede editar un mensaje de texto ya enviado");
        }
    }

    @Override
    public void EliminarMensaje() {
        System.out.println("Mensaje de texto eliminado");
    }
}