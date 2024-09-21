package state;

public class EstadoDetenido implements EstadoReproductor {
    @Override
    public void presionarPlay(Reproductor reproductor) {
        System.out.println("Reproduciendo la música desde detenido.");
        reproductor.setEstado(new EstadoReproduciendo());
    }

    @Override
    public void presionarPausa(Reproductor reproductor) {
        System.out.println("No se puede pausar, el reproductor está detenido.");
    }

    @Override
    public void presionarDetener(Reproductor reproductor) {
        System.out.println("El reproductor ya está detenido.");
    }
}