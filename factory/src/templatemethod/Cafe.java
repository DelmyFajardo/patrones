package templatemethod;

public class Cafe  extends Bebida {
    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando café molido.");
    }
}
