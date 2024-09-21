package state;

public class EstadoReproduciendo  implements EstadoReproductor {
    @Override
    public void presionarPlay(Reproductor reproductor) {
        System.out.println("El reproductor ya está reproduciendo.");
    }

    @Override
    public void presionarPausa(Reproductor reproductor) {
        System.out.println("Pausando la música.");
        reproductor.setEstado(new EstadoPausado());
    }

    @Override
    public void presionarDetener(Reproductor reproductor) {
        System.out.println("Deteniendo la música.");
        reproductor.setEstado(new EstadoDetenido());
    }
}
