package flyweigth;

import java.util.HashMap;

public class LibroFactory {
    private HashMap<String, LibroFlyweight> libros = new HashMap<>();

    public LibroFlyweight obtenerLibro(String titulo, String autor) {
        String key = titulo + "-" + autor;
        if (!libros.containsKey(key)) {
            libros.put(key, new LibroFlyweight(titulo, autor));
        }
        return libros.get(key);
    }
}
