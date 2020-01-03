package factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MiCalisoft
 */
public class MapaDeCali extends Contenido {
    
    public MapaDeCali(String nombre) {
        super(nombre);
    }
    
    @Override
     void reproducir() {
         try{
             System.out.println("Cargando el  mapa " + super.nombre + " Cali en 3.4516° N, 76.5320° W");
             Thread.sleep(1000);
             System.out.println("Desplegando el  mapa " + super.nombre + " Cali");
             
         } catch (InterruptedException e) {
			e.printStackTrace();
         
         }
        
    }
}
