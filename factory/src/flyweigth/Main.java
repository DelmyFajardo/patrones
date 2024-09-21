package flyweigth;

public class Main {
    public static void main(String[] args) {
        LibroFactory libroFactory = new LibroFactory();

        // Obtenemos y mostramos información de varios libros
        LibroFlyweight libro1 = libroFactory.obtenerLibro("Cien años de soledad", "Gabriel García Márquez");
        libro1.mostrarInformacion(3); // 3 copias de este libro

        LibroFlyweight libro2 = libroFactory.obtenerLibro("Cien años de soledad", "Gabriel García Márquez");
        libro2.mostrarInformacion(5); // 5 copias de este libro

        LibroFlyweight libro3 = libroFactory.obtenerLibro("1984", "George Orwell");
        libro3.mostrarInformacion(2); // 2 copias de este libro

        // Verificando que libro1 y libro2 son la misma instancia
        System.out.println("¿libro1 es igual a libro2? " + (libro1 == libro2));
    }
}
