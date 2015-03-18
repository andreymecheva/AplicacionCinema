/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author W7
 */
public class Funcion {
    
    private int id;
    private String nombreFuncion;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList <Ubicacion> ubicaciones;

    public Funcion(int id, String nombreFuncion, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombreFuncion = nombreFuncion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        ubicaciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public ArrayList<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
//    public ArrayList <Ubicacion> buscarUbicacionesSinReserva()
//    {
//        return buscarUbicaciones();
//    }
    
    public ArrayList <Ubicacion>buscarUbicaciones(ArrayList<Ubicacion> ubicacionesReserva)
    {
        ArrayList <Ubicacion> ubicacionesFuncion;/*Definision del ArrayList*/
        ubicacionesFuncion = new ArrayList<>();/*Inicializacion del ArrayList*/
        ArrayList <Ubicacion> ubicacionesFuncionDisponibles;/*Definision del ArrayList*/
        ubicacionesFuncionDisponibles = new ArrayList<>();/*Inicializacion del ArrayList*/
        ArrayList <Ubicacion> ubicacionesFuncionNoDisponibles;/*Definision del ArrayList*/
        ubicacionesFuncionNoDisponibles = new ArrayList<>();/*Inicializacion del ArrayList*/
        
        /*For clasico*/
        for (int i=0; i <ubicaciones.size();i++)
        {
           if( ubicaciones.get(i).getReserva()== null)
           {
               ubicacionesFuncion.add(ubicaciones.get(i));
           }
           
        }
        //return ubicacionesFuncion;
        for (int j=0; j<=ubicacionesReserva.size();j++)
        {
            for (int k=0; k<=ubicacionesReserva.size();k++)
            {
                if (ubicacionesReserva.get(j).getIdUbicacion()== ubicacionesFuncion.get(k).getIdUbicacion())
                {
                    ubicacionesFuncionDisponibles.add(ubicacionesReserva.get(j));
                    

                }
                
            }
            ubicacionesFuncionNoDisponibles.add(ubicacionesReserva.get(j));
            
        }
        if (ubicacionesFuncionNoDisponibles==null)
        {
            return ubicacionesFuncionDisponibles;
        }else
        {
            return ubicacionesFuncionNoDisponibles;
        }
        
    }
}
    //public ArrayList <Ubicacion> buscarUbicacionesSinReserva(ArrayList<Ubicacion> ubicacionesReserva, ArrayList<Ubicacion> ubicacionesFuncion) {
//        for (int i=0; i<=ubicacionesReserva.size();i++)
//        {
//            if (ubicacionesReserva.get(i).getIdUbicacion()== ubicacionesFuncion.get(i).getIdUbicacion())
//            {
//                
//            }
//        }
    //}
    
    
//}
