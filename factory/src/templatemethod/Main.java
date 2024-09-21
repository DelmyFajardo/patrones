package templatemethod;

public class Main {
    public static void main(String[] args) {
        Bebida te = new Te();
        te.prepararBebida(); // Preparar té

        System.out.println();

        Bebida cafe = new Cafe();
        cafe.prepararBebida(); // Preparar café
    }
}
