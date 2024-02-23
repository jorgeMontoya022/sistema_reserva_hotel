package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Hotel {
    private String nombre;
    private Collection<Reserva> listaServicios;
    private Collection<Reserva> listaHabitaciones;
    private Collection<Reserva> listaReservas;
    private Collection<Reserva> listaClientes;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.listaServicios = new LinkedList<>();
        this.listaHabitaciones = new LinkedList<>();
        this.listaReservas = new LinkedList<>();
        this.listaClientes = new LinkedList<>();
    }

    public Hotel() {
        this.listaServicios = new LinkedList<>();
        this.listaHabitaciones = new LinkedList<>();
        this.listaReservas = new LinkedList<>();
        this.listaClientes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Reserva> getListaServicios() {
        return Collections.unmodifiableCollection(listaServicios);
    }

    public void setListaServicios(List<Reserva> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public Collection<Reserva> getListaHabitaciones() {
        return Collections.unmodifiableCollection(listaHabitaciones);
    }

    public void setListaHabitaciones(List<Reserva> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Collection<Reserva> getListaReservas() {
        return Collections.unmodifiableCollection(listaReservas);
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public Collection<Reserva> getListaClientes() {
        return Collections.unmodifiableCollection(listaClientes);
    }

    public void setListaClientes(List<Reserva> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
