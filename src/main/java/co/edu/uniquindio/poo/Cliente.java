package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    private String nombreCliente;
    private String DNI;
    private Collection<Reserva>reservasActivas;

    public Cliente(String nombreCliente, String DNI){
        this.nombreCliente = nombreCliente;
        this.DNI = DNI;
        this.reservasActivas = new ArrayList<>();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public Collection<Reserva> getReservasActivas() {
        return reservasActivas;
    }

    public void setReservasActivas(Collection<Reserva> reservasActivas) {
        this.reservasActivas = reservasActivas;
    }

  

}
