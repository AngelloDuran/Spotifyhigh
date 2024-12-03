package menu;
import models.*;
public class Menu {
    public void mostrarMenu() {
        System.out.println("=== BIENVENIDO: Spothigh ===");
        System.out.println("1. Canción");
        System.out.println("2. Playlist");
        System.out.println("3. Artista");
        System.out.println("4. Podcast");
        System.out.println("5. Álbum");
        System.out.println("6. Salir");
    }

    public void gestionarOpciones() {
        Cancion cancion = new Cancion("My Pain", "Scarlxrd", 2.33);
        Playlist playlist = new Playlist("Favoritas", 10);
        Artista artista = new Artista("Raww Alejandro", "Trap");
        Podcast podcast = new Podcast("La pension", "Fede el de los hobos", 20);
        Album album = new Album("YHLQMDLG", 20);

        System.out.println("\n=== Mostrar ===");
        cancion.mostrarDetalles();
        playlist.mostrarDetalles();
        artista.mostrarDetalles();
        podcast.mostrarDetalles();
        album.mostrarDetalles();
    }
}