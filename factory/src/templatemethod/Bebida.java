package templatemethod;

public abstract class Bebida {
    public final void prepararBebida() {
        hervirAgua();
        agregarIngredientes();
        servir();
    }

    private void hervirAgua() {
        System.out.println("Hirviendo agua...");
    }

    protected abstract void agregarIngredientes();

    private void servir() {
        System.out.println("Sirviendo la bebida.");
    }
}
