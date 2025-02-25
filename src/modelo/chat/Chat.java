package modelo.chat;

import modelo.mensaje.Mensaje;
import modelo.usuario.Usuario;
import java.util.ArrayList;

public class Chat {
    private static ArrayList<Mensaje> historialMensajes;
    private ArrayList<Usuario> listParticipantes;

    public Chat() {
        this.historialMensajes = new ArrayList<>();
        this.listParticipantes = new ArrayList<>();
    }

    public void agregarMensaje(Mensaje mensaje) {
        historialMensajes.add(mensaje);
    }

    public void agregarParticipante(Usuario usuario) {
        listParticipantes.add(usuario);
    }

    public static ArrayList<Mensaje> MostrarMensaje() {
        return historialMensajes;
    }

    public ArrayList<Usuario> MostrarParticipantes() {
        return listParticipantes;
    }
}