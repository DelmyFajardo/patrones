package state;

public class EstadoPausado implements EstadoReproductor {
    @Override
    public void presionarPlay(Reproductor reproductor) {
        System.out.println("Reanudando la música.");
        reproductor.setEstado(new EstadoReproduciendo());
    }

    @Override
    public void presionarPausa(Reproductor reproductor) {
        System.out.println("El reproductor ya está pausado.");
    }

    @Override
    public void presionarDetener(Reproductor reproductor) {
        System.out.println("Deteniendo la música desde el estado pausado.");
        reproductor.setEstado(new EstadoDetenido());
    }
}