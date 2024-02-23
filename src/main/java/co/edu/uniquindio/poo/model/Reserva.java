package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva(Habitacion habitacion, Cliente cliente, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Reserva() {
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "habitacion=" + habitacion +
                ", cliente=" + cliente.getNombreCliente() + // Asumiendo que Cliente tiene un método getNombreCliente
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }

}
