package models;
public class Album {
    private final String nombre;
    private final int canciones;

    public Album(String nombre, int canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public void mostrarDetalles() {
        System.out.println("Álbum: " + nombre + ", Canciones: " + canciones);
    }
}
