package modelo.mensaje;

import modelo.intefaces.*;
import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class MensajeEncuesta extends Mensaje implements Enviar, Eliminar {
    private List<Opcion> opciones;

    public MensajeEncuesta(String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor, List<Opcion> opciones) {
        super(informacion, fecha, hora, remitente, receptor);
        this.opciones = opciones;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    @Override
    public void enviar() {
        System.out.println(opciones.size() + " opciones.");
        setEstado(true);
    }

    @Override
    public void eliminar() {
        System.out.println("Encuesta eliminada.");
    }

}
