package state;

public class Reproductor {
    private EstadoReproductor estado;

    public Reproductor() {
        estado = new EstadoDetenido(); // Estado inicial
    }

    public void setEstado(EstadoReproductor estado) {
        this.estado = estado;
    }

    public void presionarPlay() {
        estado.presionarPlay(this);
    }

    public void presionarPausa() {
        estado.presionarPausa(this);
    }

    public void presionarDetener() {
        estado.presionarDetener(this);
    }

}
