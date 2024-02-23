package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GestionReservas {
    private Collection<Reserva> reservas;

    public GestionReservas() {
        this.reservas = new ArrayList<>();
    }

    public Collection<Reserva> getReservas() {
        return Collections.unmodifiableCollection(reservas);
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public Collection<Reserva> obtenerReservasActivasPorCliente(Cliente cliente) {
        return reservas.stream()
                .filter(reserva -> reserva.getCliente().equals(cliente))
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "GestionReservas [reservas=" + reservas + "]";
    }
}
