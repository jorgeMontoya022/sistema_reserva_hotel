package co.edu.uniquindio.poo;

public class Habitacion {
    private int numeroHabitacion;
    private TipoHabitacion Tipohabitacion;
    private int precio;
    
    public Habitacion(int numeroHabitacion, TipoHabitacion tipohabitacion, int precio) {
        this.numeroHabitacion = numeroHabitacion;
        Tipohabitacion = tipohabitacion;
        this.precio = precio;
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
}
