/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import datos.Canciones;
import datos.Cantante;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
/**
 *
 * @author Isaias Alarcon y compañía
 */
public class ControladorCantante {
    private List<Cantante> listaCantante;
    
    public ControladorCantante(){
        listaCantante = new ArrayList<>();
    }
    
    public void AgregarCantante(String nFechaNacimiento, String nNacionalidad, String nNombre, ArrayList<Canciones> nCanciones){
        Cantante objetoCantante = new Cantante(nFechaNacimiento, nNacionalidad, nNombre, nCanciones);
        listaCantante.add(objetoCantante);
    }
    
    public void MostrarCantantes(){
        if(!listaCantante.isEmpty()){
            for(Cantante objetoCantante: listaCantante){
               System.out.println(objetoCantante.toString());
            }
        }else{
            System.out.println("No hay cantantes en la lista");
        }    
    }
    public String buscarCantante(String cantanteBuscado){
        String mensajeCantantes="No hay cantantes";
        if(!listaCantante.isEmpty()){
            for(Cantante objetoCantante: listaCantante){
                if (objetoCantante.getNombre().equals(cantanteBuscado)){
                   mensajeCantantes = objetoCantante.toString() + "\n";
                   if(!objetoCantante.getCanciones().isEmpty()){
                       for(Canciones can: objetoCantante.getCanciones()){
                           mensajeCantantes += " : " + can.toString();
                       }
                   }
                }
            }
        }
        return mensajeCantantes;
    }     
    
}
