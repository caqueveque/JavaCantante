/**
 *
 * @author Isaias Alarcon y compañía
 */
package datos;

import java.util.ArrayList;
import java.util.List;

public class Cantante {
    private String fechaNacimiento;
    private String nacionalidad;
    private String nombre;
    private ArrayList<Canciones> canciones;
 
    public Cantante(){}
    
    public Cantante(String _fechaNacimiento, String _nacionalidad, String _nombre, ArrayList<Canciones> _canciones){
      setFechaNacimiento(_fechaNacimiento);
      setNacionalidad(_nacionalidad);
      setNombre(_nombre);
      setCanciones(_canciones);      
    }
   
    
    public void setCanciones(ArrayList<Canciones> _canciones) {
        this.canciones = _canciones;
    }
    
    public ArrayList<Canciones> getCanciones() {
        return this.canciones;
    }
    
     /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Cantante : " + getNombre() + " Fecha de nacimiento: " + getFechaNacimiento() + " Nacionalidad :" + getNacionalidad() + "\n" +  "**** Temas **** " + "\n" + getCanciones() +"\n";
    }   
  
}
