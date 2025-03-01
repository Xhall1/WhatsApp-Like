package modelo.mensaje;

import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;


public class Mensaje {
    private String informacion;
    private LocalDate fecha;
    private LocalTime hora;
    private Usuario remitente;
    private Usuario receptor;
    private Boolean estado;

    public Mensaje (String informacion, LocalDate fecha, LocalTime hora, Usuario remitente, Usuario receptor) {
        this.informacion = informacion;
        this.fecha = fecha;
        this.hora = hora;
        this.remitente = remitente;
        this.receptor = receptor;
        this.estado = false;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Usuario getRemitente() {
        return remitente;
    }

    public void setRemitente(Usuario remitente) {
        this.remitente = remitente;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "[" + fecha + " " + hora + "] " +
                remitente.getNombre() + " a " +
                receptor.getNombre() + ": " +
                informacion;
    }
}
