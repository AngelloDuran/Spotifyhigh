package models;
public class Playlist {
    private final String nombre;
    private final int numeroCanciones;

    public Playlist(String nombre, int numeroCanciones) {
        this.nombre = nombre;
        this.numeroCanciones = numeroCanciones;
    }

    public void mostrarDetalles() {
        System.out.println("Playlist: " + nombre + ", Número de canciones: " + numeroCanciones);
    }
}
