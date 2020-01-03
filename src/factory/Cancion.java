package factory;

public class Cancion extends Contenido {
    
    public Cancion(String nombre) {
        super(nombre);
    }

    @Override
    void reproducir() {
        System.out.println("Reproduciendo la canción " + super.nombre + " turururu");
    }
}
