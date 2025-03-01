package controlador;

import modelo.chat.Chat;
import modelo.usuario.Usuario;
import java.util.List;

//Para mostrar los participantes que están en el chat
public class ControladorParticipantes {
    private final Chat chat;

    public ControladorParticipantes(Chat chat) {
        this.chat = chat;
    }

    public List<Usuario> obtenerParticipantes() {
        return chat.MostrarParticipantes();
    }
}
