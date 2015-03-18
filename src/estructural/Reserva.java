/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import java.util.ArrayList;

/**
 *
 * @author W7
 */
public class Reserva {
    private Funcion funciones;
    private ArrayList <Ubicacion>ubicaciones;
    private Tarjeta tarjetas;

    public Reserva(Funcion funciones, ArrayList<Ubicacion> ubicaciones, Tarjeta tarjetas) {
        this.funciones = funciones;
        this.ubicaciones = ubicaciones;
        this.tarjetas = tarjetas;
    }

    public Funcion getFunciones() {
        return funciones;
    }

    public ArrayList<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }

    public Tarjeta getTarjetas() {
        return tarjetas;
    }

    public void setFunciones(Funcion funciones) {
        this.funciones = funciones;
    }

    public void setUbicaciones(ArrayList<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public void setTarjetas(Tarjeta tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    
    
}
