package decorator;

public class Cafe implements Bebida {
    @Override
    public String obtenerDescripcion() {
        return "Café";
    }

    @Override
    public double costo() {
        return 1.00; // Precio del café
    }
}

