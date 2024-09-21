package state;

public class main {
    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor();

        reproductor.presionarPlay(); // Debería iniciar la reproducción
        reproductor.presionarPausa(); // Pausar la música
        reproductor.presionarDetener(); // Detener la música
        reproductor.presionarPlay(); // Reproduciendo de nuevo
    }
}
