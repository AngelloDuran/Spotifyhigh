package models;
public class Artista {
    private final  String nombre;
    private final String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public void mostrarDetalles() {
        System.out.println("Artista: " + nombre + ", Género: " + genero);
    }
}