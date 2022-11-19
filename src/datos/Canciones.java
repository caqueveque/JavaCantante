/**
 *
 * @author Isaias Alarcon y compañía
 */
package datos;

import java.util.Date;

public class Canciones {
  private String titulo;
  private String fecha;
  private String premio;
  
  public Canciones(){}
  
  public Canciones(String _titulo, String _fecha, String _premio){
    setTitulo(_titulo);
    setFecha(_fecha);
    setPremio(_premio); 
  }

  public void setTitulo(String ntitulo){
    this.titulo=ntitulo;
  }
  public void setFecha(String nfecha){
    this.fecha=nfecha;
  }
  public void setPremio(String npremio){
    this.premio=npremio;
  } 

  public String getTitulo(){
    return this.titulo;
  }
  public String getFecha(){
    return this.fecha;
  }
  public String getPremio(){
    return this.premio;
  } 

  @Override
  public String toString(){
    return "Titulo de Cancion : " + getTitulo() + " Fecha de lanzamiento : " + getFecha() + " Premio :" + getPremio() + "\n";
  }
  
}
