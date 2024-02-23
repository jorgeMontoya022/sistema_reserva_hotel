package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Collection;

public class Habitacion {
    private int numeroHabitacion;
    private TipoHabitacion Tipohabitacion;
    private int precio;
    private Collection<Servicio> servicios;
    
    public Habitacion(int numeroHabitacion, TipoHabitacion tipohabitacion, int precio) {
        this.numeroHabitacion = numeroHabitacion;
        Tipohabitacion = tipohabitacion;
        this.precio = precio;
        this.servicios = new ArrayList<>();
    }

    public Habitacion() {
        this.servicios = new ArrayList<>();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoHabitacion getTipohabitacion() {
        return Tipohabitacion;
    }

    public void setTipohabitacion(TipoHabitacion tipohabitacion) {
        Tipohabitacion = tipohabitacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void agregarServicios(Servicio servicio){
        servicios.add(servicio);
    }

}
