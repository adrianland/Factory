package factory;

public abstract class Contenido {

    protected String nombre;

    public Contenido(String nombre) {
        this.nombre = nombre;
    }

    abstract void reproducir();
}
