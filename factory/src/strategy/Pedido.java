package strategy;

public class Pedido {
    private EstrategiaEnvio estrategiaEnvio;

    public Pedido(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public void setEstrategiaEnvio(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public double calcularCostoEnvio(double peso) {
        return estrategiaEnvio.calcularCosto(peso);
    }
}
