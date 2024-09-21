package builder;

public class Pizza {
    private String tamano;
    private String masa;
    private String salsa;
    private boolean extraQueso;
    private String[] ingredientes;

    private Pizza(PizzaBuilder builder) {
        this.tamano = builder.tamano;
        this.masa = builder.masa;
        this.salsa = builder.salsa;
        this.extraQueso = builder.extraQueso;
        this.ingredientes = builder.ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamaño='" + tamano + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", extraQueso=" + extraQueso +
                ", ingredientes=" + String.join(", ", ingredientes) +
                '}';
    }


public static class PizzaBuilder {
    private String tamano;
    private String masa;
    private String salsa;
    private boolean extraQueso;
    private String[] ingredientes;

    public PizzaBuilder setTamaño(String tamaño) {
        this.tamano = tamano;
        return this;
    }

    public PizzaBuilder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaBuilder setSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public PizzaBuilder setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
        return this;
    }

    public PizzaBuilder setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }

}}
