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
public class Tarjeta {
    private int cedula;
    private String nombre;
    private double saldo;
    

    public Tarjeta(int cedula, String nombre, double saldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.saldo = saldo;
        
        
    }
    
    

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
   

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
