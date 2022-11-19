/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import controlador.ControladorCanciones;
import controlador.ControladorCantante;
import datos.Canciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Isaias Alarcon y compañía
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorCanciones CancionesController = new ControladorCanciones();
        ControladorCantante CantanteController = new ControladorCantante();
        Scanner sc=new Scanner(System.in);
        
        //Datos en duro para arrancar
        CancionesController.agregarCanciones("Thriller ", "1982-11-30", "2 Gramy, America Music Award");
        CancionesController.agregarCanciones("Billie Jean ", "1982-11-30", "Gramy, America Music Award");
        CancionesController.agregarCanciones("Beat it ", "1982-11-30", "Gramy");
        CantanteController.AgregarCantante("29 de agosto de 1958", "USA", "Michael Joseph Jackson", (ArrayList<Canciones>) CancionesController.getCanciones());
        
        CancionesController = new ControladorCanciones();
        CancionesController.agregarCanciones("Rehab ", "2007", "Brit Awards,  MTV Europe Music Awards");
        CancionesController.agregarCanciones("Back to Black", "2004", "Brit Awards, Premios Mercury, Grammy");
        CancionesController.agregarCanciones("Body & Soul ", "2012", "Gramy");
        CantanteController.AgregarCantante("4 de septiembre de 1983", "King Dom", "Amy Winehouse", (ArrayList<Canciones>) CancionesController.getCanciones());
        //Fin Datos
        
        int opcion;
        boolean salir = false;
        while(!salir){
            System.out.println("1 Agregar Cantante");
            System.out.println("2 Mostrar Cantantes");
            System.out.println("3 Buscar Cantante");
            System.out.println("4 Salir");
            try{
                System.out.println("Selecciona una opcion : ");
                opcion = sc.nextInt();
                if (opcion == 1){
                    String nombre;
                    String fecha;
                    String pais;
                    
                    CancionesController = new ControladorCanciones();
                    Scanner loc = new Scanner(System.in);
                    System.out.println("Ingrese nombre del cantante");
                    nombre =  loc.nextLine();
                    System.out.println("Ingrese fecha de nacimiento");
                    fecha =  loc.nextLine();                    
                    System.out.println("Ingrese pais de nacionalidad del cantante");
                    pais =  loc.nextLine();
                    System.out.println("Canciones....");
                    boolean fin =false;
                    Scanner sc2=new Scanner(System.in);
                    int op2;
                    while (!fin){
                        String cancion2;
                        String fecha2;
                        String premio2;
                        
                        System.out.println("1 Ingrese cancion");
                        System.out.println("2 Salir");
                        op2 =  sc2.nextInt();
                        if (op2==1){
                            System.out.println("Ingrese titulo de la cancion");
                            cancion2 =  loc.nextLine();
                            System.out.println("Ingrese fecha de lanzamiento");
                            fecha2 =  loc.nextLine();                    
                            System.out.println("Ingrese premios obtenidos");
                            premio2 =  loc.nextLine();
                            CancionesController.agregarCanciones(cancion2, fecha2, premio2);
                        }
                        else{
                            fin = true;
                        }
                    }
                    CantanteController.AgregarCantante(fecha, pais, nombre, (ArrayList<Canciones>) CancionesController.getCanciones());   
                }
                if (opcion == 2){
                    CantanteController.MostrarCantantes();
                }
                if (opcion == 3){
                    String busca;
                    Scanner bus=new Scanner(System.in);
                    System.out.println("nombre del cantante a buscar?");
                    busca = bus.nextLine();
                    System.out.println(CantanteController.buscarCantante(busca));
                }
                if (opcion == 4){
                    salir =true;
                }
                
            }catch(InputMismatchException err){
            
            }
        }
        
        
    }
    
}
