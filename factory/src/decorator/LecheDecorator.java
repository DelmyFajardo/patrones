package decorator;

public class LecheDecorator extends BebidaDecorator {
    public LecheDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.50; // Precio adicional por leche
    }
}
