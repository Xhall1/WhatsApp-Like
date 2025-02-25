package modelo.mensaje;

public class Opcion {
    private Boolean seleccionado;
    private String texto;

    public Opcion(Boolean seleccionado, String texto) {
        this.seleccionado = seleccionado;
        this.texto = texto;
    }

    public Boolean getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
