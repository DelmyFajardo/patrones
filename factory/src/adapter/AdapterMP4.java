package adapter;

public class AdapterMP4 implements ReproductorAudio {
    private ReproductorMP4 reproductorMP4;

    public AdapterMP4(ReproductorMP4 reproductorMP4) {
        this.reproductorMP4 = reproductorMP4;
    }

    @Override
    public void reproducir(String tipoArchivo, String nombreArchivo) {
        if (tipoArchivo.equalsIgnoreCase("mp4")) {
            reproductorMP4.reproducirMP4(nombreArchivo);
        } else {
            System.out.println("Formato no soportado: " + tipoArchivo);
        }
    }
}