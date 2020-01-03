package factory;

public class ConstruirContenido {
    
      Contenido construir(String name) throws Exception {
        if (name.toLowerCase().endsWith(".mp3")) {
            return new Cancion(name);
        } else if (name.toLowerCase().endsWith(".mp4")) {
            return new Video(name);
        }
        throw new Exception("Este tipo de archivo no se reconoce");
    }
    
}
