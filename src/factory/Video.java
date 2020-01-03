package factory;

public class Video extends Contenido {

    
    public Video(String nombre) {
        super(nombre);
    }

    @Override
    void reproducir() {
        System.out.println("Reproduciendo el video " + super.nombre+ " turururu");
    }
}
