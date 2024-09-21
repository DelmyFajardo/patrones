package decorator;

public class AzúcarDecorator extends BebidaDecorator {
    public AzúcarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", Azúcar";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.20; // Precio adicional por azúcar
    }
}

