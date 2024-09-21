package adapter;

public class Main {
    public static void main(String[] args) {
        ReproductorAudio reproductorMP3 = new ReproductorMP3();
        reproductorMP3.reproducir("mp3", "cancion1.mp3");

        // Usando el adaptador para reproductor MP4
        ReproductorMP4 reproductorMP4 = new ReproductorMP4();
        ReproductorAudio adaptadorMP4 = new AdapterMP4(reproductorMP4);
        adaptadorMP4.reproducir("mp4", "video1.mp4");

        // Intentando reproducir un formato no soportado
        adaptadorMP4.reproducir("avi", "pelicula.avi");
    }
}
