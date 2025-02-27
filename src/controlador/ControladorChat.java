package controlador;

import modelo.chat.Chat;
import modelo.mensaje.Mensaje;
import modelo.mensaje.MensajeTexto;
import modelo.usuario.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class ControladorChat {
    private Chat chat;
    private Usuario usuarioActual;
    private Usuario maquina;

    public ControladorChat(String nombreUsuario, String nombreMaquina) {
        this.chat = new Chat();
        this.usuarioActual = new Usuario(nombreUsuario, nombreMaquina);
        this.maquina = new Usuario(nombreMaquina, nombreUsuario);
        chat.agregarParticipante(usuarioActual);
        chat.agregarParticipante(maquina);
        System.out.println("Chat iniciado entre " + nombreUsuario + " y " + nombreMaquina);
    }

    public void enviarMensajeUsuario(String contenido) {

        MensajeTexto mensajeUsuario = new MensajeTexto(contenido, LocalDate.now(), LocalTime.now(), usuarioActual, maquina);
        chat.agregarMensaje(mensajeUsuario);
        mensajeUsuario.EnviarMensaje();

        String respuesta = generarRespuesta(contenido);
        MensajeTexto mensajeMaquina = new MensajeTexto(respuesta, LocalDate.now(), LocalTime.now(), maquina, usuarioActual);
        chat.agregarMensaje(mensajeMaquina);
        mensajeMaquina.EnviarMensaje();
    }


    private String generarRespuesta(String mensajeUsuario) {
        Random random = new Random();
        mensajeUsuario = mensajeUsuario.toLowerCase();

        if (mensajeUsuario.contains("hola") || mensajeUsuario.contains("saludos")) {
            return "¡Hola! ¿En qué puedo ayudarte hoy?";
        } else if (mensajeUsuario.contains("como estas") || mensajeUsuario.contains("que tal")) {
            return "Estoy bien, gracias. ¿Y tú?";
        } else if (mensajeUsuario.contains("adios") || mensajeUsuario.contains("chao")) {
            return "¡Hasta luego! Que tengas un buen día.";
        } else if (mensajeUsuario.contains("Cuentame tu dia") ||  mensajeUsuario.contains("Como va tu dia")) {
            return "Muy bien, la verdad. Gracias por preguntar.";
    }else {
            String[] respuestasGenericas = {
                    "Interesante, cuéntame más.",
                    "No estoy seguro de qué decir a eso.",
                    "¡Qué curioso! ¿Qué opinas tú?",
                    "Eso suena genial.",
                    "Mmm... No se que decir a eso"
            };
            return respuestasGenericas[random.nextInt(respuestasGenericas.length)];
        }
    }
    public void mostrarHistorial() {
        ArrayList<Mensaje> mensajes = Chat.MostrarMensaje();
        if (mensajes.isEmpty()) {
            System.out.println("No hay mensajes en el chat.");
        } else {
            System.out.println("\nHistorial de mensajes:");
            for (Mensaje mensaje : mensajes) {
                System.out.println(mensaje.getRemitente().getNombre() + " a " +
                        mensaje.getReceptor().getNombre() + ": " +
                        mensaje.getInformacion());
            }
        }
    }

    public void mostrarParticipantes() {
        ArrayList<Usuario> participantes = chat.MostrarParticipantes();
        System.out.println("Participantes del chat:");
        for (Usuario usuario : participantes) {
            System.out.println("- " + usuario.getNombre());
        }
    }
}
