package models;
public class Cancion {
    private final String nombre;
    private final String artista;
    private final double duracion;

    public Cancion(String nombre, String artista, double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarDetalles() {
        System.out.println("Canción: " + nombre + ", Artista: " + artista + ", Duración: " + duracion + " mins");
    }
}
