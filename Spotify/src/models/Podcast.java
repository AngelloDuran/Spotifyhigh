package models;
public class Podcast {
    private final  String nombre;
    private final  String anfitrion;
    private final int episodios;

    public Podcast(String nombre, String anfitrion, int episodios) {
        this.nombre = nombre;
        this.anfitrion = anfitrion;
        this.episodios = episodios;
    }

    public void mostrarDetalles() {
        System.out.println("Podcast: " + nombre + ", Anfitrión: " + anfitrion + ", Episodios: " + episodios);
    }
}