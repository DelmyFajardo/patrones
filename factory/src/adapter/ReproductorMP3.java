package adapter;

public class ReproductorMP3 implements ReproductorAudio {
    @Override
    public void reproducir(String tipoArchivo, String nombreArchivo) {
        if (tipoArchivo.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo MP3: " + nombreArchivo);
        } else {
            System.out.println("Formato no soportado: " + tipoArchivo);
        }
    }
}