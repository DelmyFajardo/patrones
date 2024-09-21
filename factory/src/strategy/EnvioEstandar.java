package strategy;

public class EnvioEstandar implements EstrategiaEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 1.0; // Costo estándar por kg
    }
}

public class EnvioExpres implements EstrategiaEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 2.0; // Costo exprés por kg
    }
}

public class EnvioInternacional implements EstrategiaEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 3.0; // Costo internacional por kg
    }
}
