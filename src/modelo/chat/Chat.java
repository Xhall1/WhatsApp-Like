package modelo.chat;

import modelo.usuario.Usuario;
import java.util.ArrayList;

public class Chat {
    private ArrayList<Usuario> listParticipantes;

    public Chat() {
        this.listParticipantes = new ArrayList<>();
    }

    public void agregarParticipante(Usuario usuario) {
        listParticipantes.add(usuario);
    }

    public ArrayList<Usuario> MostrarParticipantes() {
        return listParticipantes;
    }
}