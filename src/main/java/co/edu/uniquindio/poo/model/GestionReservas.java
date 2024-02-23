package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestionReservas {
    private List<Reserva> reservas;

    public GestionReservas() {
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public List<Reserva> obtenerReservasActivasPorCliente(Cliente cliente) {
        return reservas.stream()
                .filter(reserva -> reserva.getCliente().equals(cliente))
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "GestionReservas [reservas=" + reservas + "]";
    }
}
