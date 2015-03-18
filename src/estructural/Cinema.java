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
public class Cinema {
    private double tarifaVip;
    private double tarifaGeneral;
    private ArrayList <Funcion>funciones;
    private ArrayList <Ubicacion>ubicaciones;
    private ArrayList <Tarjeta>tarjetas;
    private ArrayList <Reserva>reservas;

    public Cinema(double tarifaVip, double tarifaGeneral) {
        this.tarifaVip = tarifaVip;
        this.tarifaGeneral = tarifaGeneral;
        funciones = new ArrayList<>();
        ubicaciones = new ArrayList<>();
        tarjetas = new ArrayList<>();
        reservas = new ArrayList<>();
        
    }

    public double getTarifaVip() {
        return tarifaVip;
    }

    public double getTarifaGeneral() {
        return tarifaGeneral;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public ArrayList<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setTarifaVip(double tarifaVip) {
        this.tarifaVip = tarifaVip;
    }

    public void setTarifaGeneral(double tarifaGeneral) {
        this.tarifaGeneral = tarifaGeneral;
    }
    
//    public void CrearFuncion ( Date FechaInicio, Date FechaFinal, String NomPelicula )
//    {
//        
//    }
    
    public void SolicitarReserva(int cedula, int id, ArrayList <Ubicacion> ubicacionesReserva,ArrayList <Ubicacion> ubicacionesFuncionDisponibles, ArrayList <Ubicacion>ubicacionesFuncionNoDisponibles)
    {
        Tarjeta tarjeta = buscarTarjeta(cedula);
        Funcion funcion = buscarFuncion(id);
        funcion.buscarUbicaciones(ubicacionesReserva);
        ///Reserva mov = new Reserva(funcion, ubicacionesReserva,tarjeta);
        if(ubicacionesFuncionNoDisponibles ==null){
            Reserva res = new Reserva(funcion, ubicacionesReserva,tarjeta);
            
        }else 
            System.out.println("Las ubicaciones:" + ubicacionesFuncionNoDisponibles+"no estan disponibles." );
        {
            
        }
        //Ubicacion ubicacion=buscarUbicaciones(ubicaciones);
    }
    
    public Tarjeta buscarTarjeta(int cedula)
    {
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta.getCedula() == cedula) {
                return tarjeta;
            }
        }
        return tarjetas.get(9999);
    }
    
    public Funcion buscarFuncion(int id)
    {
        for (Funcion funcion : funciones) {
            if (funcion.getId() == id) {
                return funcion;
            }
        }
        return null;
    }
    
    public void agregarReserva (Reserva res)
    {
        reservas.add(res);
    }
    
    

    
}
