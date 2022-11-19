/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import datos.Canciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
/**
 *
 * * @author Isaias Alarcon y compañía
 */
public class ControladorCanciones {
    private List<Canciones> listaCanciones;
    
    public ControladorCanciones(){
        listaCanciones = new ArrayList<>();
    }
    
    public void agregarCanciones(String titulo, String fecha, String premio){
        Canciones objetCanciones=new Canciones(titulo, fecha, premio);
        listaCanciones.add(objetCanciones);
    }
    
    public List<Canciones> getCanciones(){
        return this.listaCanciones;
    }
    
    public void mostrarCanciones(){
        if(!listaCanciones.isEmpty()){
            for(Canciones objetoC: listaCanciones){
               System.out.println(objetoC.toString());
            }
        }else{
            System.out.println("No hay canciones");
        }
    }
    
    public String buscarCanciones(String tituloBuscado){
        String listadoCanciones="No hay canciones";
        if(!listaCanciones.isEmpty()){
            for(Canciones objetoC: listaCanciones){
                if (objetoC.getTitulo().equals(tituloBuscado)){
                   listadoCanciones = objetoC.toString();
                }
            }
        }
        return listadoCanciones;
    }    
    
}
