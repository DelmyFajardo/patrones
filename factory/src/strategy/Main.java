package strategy;

public class Main {
    public static void main(String[] args) {
        double peso = 10.0; // Peso del paquete

        // Usando estrategia de envío estándar
        Pedido pedido = new Pedido(new EnvioEstandar());
        System.out.println("Costo de envío estándar: $" + pedido.calcularCostoEnvio(peso));

        // Cambiando a estrategia de envío exprés
        pedido.setEstrategiaEnvio(new EnvioExpres());
        System.out.println("Costo de envío exprés: $" + pedido.calcularCostoEnvio(peso));

        // Cambiando a estrategia de envío internacional
        pedido.setEstrategiaEnvio(new EnvioInternacional());
        System.out.println("Costo de envío internacional: $" + pedido.calcularCostoEnvio(peso));
    }
}
