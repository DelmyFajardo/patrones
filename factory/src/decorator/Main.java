package decorator;

public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println(cafe.obtenerDescripcion() + " $" + cafe.costo());

        // Decorando con leche
        cafe = new LecheDecorator(cafe);
        System.out.println(cafe.obtenerDescripcion() + " $" + cafe.costo());

        // Decorando con azúcar
        cafe = new AzúcarDecorator(cafe);
        System.out.println(cafe.obtenerDescripcion() + " $" + cafe.costo());
    }
}
