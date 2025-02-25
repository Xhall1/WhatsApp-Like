package modelo.mensaje;
import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class MensajeEncuesta extends Mensaje {

    public MensajeEncuesta(String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor) {
        super(informacion, fecha, hora, remitente, receptor);
    }

    @Override
    public void EnviarMensaje() {
        System.out.println("Encuesta enviada");
        setEstado(true);
    }

    @Override
    public void EliminarMensaje() {
        System.out.println("Encuesta eliminada");
    }

    @Override
    public void EditarMensaje() {
        if (!getEstado()) {
            System.out.println("Encuesta editada");
        } else {
            System.out.println("No se puede editar una encuesta ya enviada");
        }
    }
}