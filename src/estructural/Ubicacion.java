/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

/**
 *
 * @author W7
 */
public class Ubicacion {
    
    private String idUbicacion;
    private int tipo;
    private Reserva reserva;

    public Ubicacion(String idUbicacion, int tipo) {
        this.idUbicacion = idUbicacion;
        this.tipo = tipo;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public int getTipo() {
        return tipo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    
    
}
