package controlador;

import modelo.chat.Chat;
import modelo.usuario.Usuario;

public class ControladorChat {
    private final Usuario usuarioActual;
    private final ControladorMensajes mensajes;
    private final ControladorParticipantes participantes;
    private final ControladorHistorialChat historial;
    private final ControladorRespuesta respuestaBot; // Se agrega el bot

    public ControladorChat(String nombreUsuario) {
        Chat chat = new Chat();
        this.usuarioActual = new Usuario(nombreUsuario, nombreUsuario);
        this.historial = new ControladorHistorialChat();
        this.mensajes = new ControladorMensajes(historial);
        this.participantes = new ControladorParticipantes(chat);
        this.respuestaBot = new ControladorRespuesta(); // Inicializamos el bot

        chat.agregarParticipante(usuarioActual);
        System.out.println("Chat iniciado. Usuario: " + nombreUsuario);
    }

    public void enviarMensajeUsuario(String contenido, Usuario receptor) {
        //Aqui responde/escribe el usuario
        mensajes.enviarMensaje("texto", contenido, usuarioActual, receptor, null);

        //Aqui responde el bot
        String respuestaBotTexto = respuestaBot.generarRespuesta(contenido);
        mensajes.enviarMensaje("texto", respuestaBotTexto, receptor, usuarioActual, null);
    }

    public void mostrarHistorialChat() {
        historial.mostrarMensajes();
    }

    public void mostrarParticipantes() {
        participantes.obtenerParticipantes();
    }
}
