package controlador;

import java.util.Random;

public class ControladorRespuesta {

    //Se genera la lógica para cuando la máquina responda
    public String generarRespuesta(String mensajeUsuario) {
        Random random = new Random();
        mensajeUsuario = mensajeUsuario.toLowerCase();

        if (mensajeUsuario.contains("hola") || mensajeUsuario.contains("saludos")) {
            return "¡Hola! ¿En qué puedo ayudarte hoy?";
        } else if (mensajeUsuario.contains("como estas") || mensajeUsuario.contains("que tal")) {
            return "Estoy bien, gracias. ¿Y tú?";
        } else if (mensajeUsuario.contains("adios") || mensajeUsuario.contains("chao")) {
            return "¡Hasta luego! Que tengas un buen día.";
        } else {
            String[] respuestasGenericas = {
                    "Interesante, cuéntame más.",
                    "No estoy seguro de qué decir a eso.",
                    "¡Qué curioso! ¿Qué opinas tú?",
                    "Eso suena genial.",
                    "Mmm... No sé qué decir a eso"
            };
            return respuestasGenericas[random.nextInt(respuestasGenericas.length)];
        }
    }
}

