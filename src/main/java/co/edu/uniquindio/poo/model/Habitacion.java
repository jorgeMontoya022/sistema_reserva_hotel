package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Habitacion {
    private int numeroHabitacion;
    private TipoHabitacion Tipohabitacion;
    private double precio;
    private Collection<Servicio> servicios;
    
    public Habitacion(int numeroHabitacion, TipoHabitacion tipohabitacion, double precio) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Collection<Servicio> getServicios() {
        return Collections.unmodifiableCollection(servicios);
    }

    public void setServicios(Collection<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void agregarServicios(Servicio servicio){
        servicios.add(servicio);
    }

    public void eliminarServicios(Servicio servicio){
        servicios.remove(servicio);
    }

    @Override
    public String toString() {
        return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", Tipohabitacion=" + Tipohabitacion + ", precio="
                + precio + ", servicios=" + servicios + "]";
    }

}
