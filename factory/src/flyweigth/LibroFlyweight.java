package flyweigth;

public class LibroFlyweight {
    private String titulo;
    private String autor;

    public LibroFlyweight(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInformacion(int copias) {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Copias disponibles: " + copias);
    }
}
